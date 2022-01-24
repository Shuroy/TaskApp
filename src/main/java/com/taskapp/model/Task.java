package com.taskapp.model;

import java.sql.Date;

public class Task {

	private String taskName;
	private String priority;
	private String createdBy;
	private String status;
	private Date createdDate;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Task(String taskName, String priority, String createdBy, String status, Date createdDate) {
		super();
		this.taskName = taskName;
		this.priority = priority;
		this.createdBy = createdBy;
		this.status = status;
		this.createdDate = createdDate;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		// TODO Auto-generated method stub

	}

}
