package com.demo.DemoTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.DemoTask.domain.Task;
import com.demo.DemoTask.domain.User;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTaskApplication.class, args);
		//run1();
	}
	
	//TODO remove after generating the JSON
	private static void run1() {
		ObjectMapper mapper = new ObjectMapper();

		Task task = new Task();
		User user = new User();
		
		user.setUsername("testUser");
		user.setFullName("Test User");
		user.setEmailAddress("test.user@testuser.com");
		user.setPassword("testPWD");
		
		task.setTaskDescription("test 1");
		task.setTaskFeedback("well done");
		task.setTaskName("Test App");
		task.setTaskNote("Use Java");
		task.setTaskStatus("Completed");
		task.setUser(user);
		
		Task task1 = new Task();
		task1.setTaskDescription("test 2");
		task1.setTaskFeedback("good job");
		task1.setTaskName("Test App1");
		task1.setTaskNote("Use Java tech");
		task1.setTaskStatus("in progress");
		task1.setUser(user);
		
		Task task2 = new Task();
		task2.setTaskDescription("test 3");
		task2.setTaskFeedback("Good");
		task2.setTaskName("Test App2");
		task2.setTaskNote("Use Java app");
		task2.setTaskStatus("TODO");
		task2.setUser(user);
		List<Task> taskList = new ArrayList<Task>();
		taskList.add(task);
		taskList.add(task1);
		taskList.add(task2);

		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("taskDetails.json"), taskList);
			mapper.writeValue(new File("user.json"), user);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(taskList);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(taskList);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void run2() {
		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			//List<Task> task = (List<Task>) mapper.readValue(new File("taskDetails.json"), Task.class);
			List<Task> task = mapper.readValue(new File("taskDetails.json"), new TypeReference<List<Task>>(){});
			System.out.println(task.size());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

