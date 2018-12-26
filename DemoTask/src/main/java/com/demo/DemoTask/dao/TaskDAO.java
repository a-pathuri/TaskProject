package com.demo.DemoTask.dao;

import java.util.List;

import com.demo.DemoTask.domain.Task;
import com.demo.DemoTask.domain.User;

public interface TaskDAO {
	public List<Task> getTaskList() throws Exception;

	public List<Task> getTaskListSortByRank() throws Exception;

	public List<Task> createTask(Task task) throws Exception;

	public Task getTask(String taskName) throws Exception;
	
	public List<Task> getTaskList(String userName) throws Exception;
	
	public List<User> createUser(User user) throws Exception;
	
	public List<User> getUserList() throws Exception;
}
