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
import com.demo.DemoTask.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	TaskService taskService;

	@RequestMapping(value = "/task", method = RequestMethod.GET)
	@ResponseBody
	public List<Task> getTaskList() {
		List<Task> taskList = new ArrayList<Task>();

		try {
			return taskService.getTaskList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return taskList;

	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	@ResponseBody
	public Task getTask(@RequestParam String taskName) {
		Task task = new Task();

		try {
			return taskService.getTask(taskName);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return task;
	}

	@RequestMapping(value = "/task/sort", method = RequestMethod.GET)
	@ResponseBody
	public List<Task> getTaskListSortByRank() {
		List<Task> taskList = new ArrayList<Task>();
		try {
			return taskService.getTaskListSortByRank();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskList;
	}

	@RequestMapping(value = "/task", method = RequestMethod.POST)
	@ResponseBody
	public List<Task> createTask(@RequestBody Task task) {

		List<Task> taskList = new ArrayList<Task>();
		try {
			return taskService.createTask(task);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskList;
	}
}
