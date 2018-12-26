package com.demo.DemoTask.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DemoTask.domain.Task;
import com.demo.DemoTask.domain.User;
import com.demo.DemoTask.service.TaskService;

@RestController
public class UserController {
	
	@Autowired
	TaskService taskService;

	
	@RequestMapping(value = "/usertask", method = RequestMethod.GET)
	@ResponseBody
	public List<Task> getUserTaskList(@RequestParam String userName) {
		List<Task> taskList = new ArrayList<Task>();

		try {
			return taskService.getTaskList(userName);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskList;
	}

	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public List<User> createUser(@RequestBody User user) {

		List<User> userList = new ArrayList<User>();
		try {
			return taskService.createUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();

		try {
			return taskService.getUserList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;

	}
}
