package com.demo.DemoTask.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.DemoTask.domain.Task;
import com.demo.DemoTask.domain.User;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class TaskDAOImpl implements TaskDAO {

	// Demo of get tasks, later we can integrate with DB
	@Override
	public List<Task> getTaskList() throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		List<Task> tasks = new ArrayList<Task>();

		try {

			tasks = mapper.readValue(new File("taskDetails.json"), new TypeReference<List<Task>>() {
			});
			// System.out.println(tasks.size());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return tasks;
	}
	
	// Demo of get users, later we can integrate with DB
	@Override
	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		List<User> users = new ArrayList<User>();
		try {
			users = mapper.readValue(new File("user.json"), new TypeReference<List<User>>() {
			});
			System.out.println(users.size());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return users;
		
	}

	// TODO , we can implement UI layer for demo , later based on the req we can
	// change to server
	@Override
	public List<Task> getTaskListSortByRank() throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		List<Task> tasks = new ArrayList<Task>();
		try {
			tasks = mapper.readValue(new File("taskDetails.json"), new TypeReference<List<Task>>() {
			});
			System.out.println(tasks.size());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tasks;
	}

	// TODO Demo of creation task, later we can integrate with DB
	@Override
	public List<Task> createTask(Task task) throws Exception {

		return createTasks(task);
	}

	// TODO To get task details with out db call for testing
	private static List<Task> getTaskDetails(Task task) {
		ObjectMapper mapper = new ObjectMapper();
		List<Task> tasks = new ArrayList<Task>();

		try {

			tasks = mapper.readValue(new File("taskDetails.json"), new TypeReference<List<Task>>() {
			});
			if (task != null)
				tasks.add(task);
			System.out.println(tasks.size());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return tasks;
	}

	// TODO Demo of creation task, later we can integrate with DB
	private static List<Task> createTasks(Task task) {
		ObjectMapper mapper = new ObjectMapper();
		List<Task> tasks = getTaskDetails(task);
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("taskDetails.json"), tasks);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tasks;
	}

	@Override
	public Task getTask(String taskName) throws Exception {
		List<Task> taskLsit = getTaskDetails(null);
		for (Task task : taskLsit) {
			if (taskName.equals(task.getTaskName())) {
				System.out.println(taskName + "==" + task.getTaskName());
				return task;
			}
		}
		return null;
	}

	@Override
	public List<Task> getTaskList(String userName) throws Exception {
		// TODO Auto-generated method stub
		List<Task> userTaskLsit = new ArrayList<Task>();
		List<Task> taskLsit = getTaskDetails(null);
		for (Task task : taskLsit) {
			if (userName.equals(task.getUser().getUsername())) {
				System.out.println(userName + "==" + task.getUser().getUsername());
				userTaskLsit.add(task);
			}
		}
		return userTaskLsit;
	}

	// TODO Demo of creation user, later we can integrate with DB
	@Override
	public List<User> createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return createUsers(user);
	}

	// TODO Demo of creation task, later we can integrate with DB
	private static List<User> createUsers(User user) {
		ObjectMapper mapper = new ObjectMapper();
		List<User> users = getUserDetails(user);
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("user.json"), users);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}

	// TODO To get user details with out db call for testing
	private static List<User> getUserDetails(User user) {
		ObjectMapper mapper = new ObjectMapper();
		List<User> users = new ArrayList<User>();
		try {
			users = mapper.readValue(new File("user.json"), new TypeReference<List<User>>() {
			});
			if (user != null)
				users.add(user);
			System.out.println(users.size());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return users;
	}

	

}
