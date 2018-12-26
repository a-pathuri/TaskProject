package com.demo.DemoTask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DemoTask.dao.TaskDAO;
import com.demo.DemoTask.domain.Task;
import com.demo.DemoTask.domain.User;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	TaskDAO taskDAO;

	@Override
	public List<Task> getTaskList() throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.getTaskList();
	}

	@Override
	public List<Task> getTaskListSortByRank() throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.getTaskListSortByRank();
	}

	@Override
	public List<Task> createTask(Task task) throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.createTask(task);
	}

	@Override
	public Task getTask(String taskName) throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.getTask(taskName);
	}

	@Override
	public List<Task> getTaskList(String userName) throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.getTaskList(userName);
	}

	@Override
	public List<User> createUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.createUser(user);
	}

	@Override
	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return taskDAO.getUserList();
	}

}
