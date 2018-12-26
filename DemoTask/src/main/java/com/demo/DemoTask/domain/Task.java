package com.demo.DemoTask.domain;

import java.util.Date;

public class Task {

	private String taskStatus;
	private String taskDescription;
	private String taskNote;
	private String taskFeedback;
	private Date timeInput;
	private String taskName;
	private User user;

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskNote() {
		return taskNote;
	}

	public void setTaskNote(String taskNote) {
		this.taskNote = taskNote;
	}

	public String getTaskFeedback() {
		return taskFeedback;
	}

	public void setTaskFeedback(String taskFeedback) {
		this.taskFeedback = taskFeedback;
	}

	public Date getTimeInput() {
		return timeInput;
	}

	public void setTimeInput(Date timeInput) {
		this.timeInput = timeInput;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
