package com.taskapp.dao;

import java.util.List;

import com.taskapp.model.Task;

public interface TasksDao {

	public boolean insertTask(Task task);
	public List<Task> taskList();
}
