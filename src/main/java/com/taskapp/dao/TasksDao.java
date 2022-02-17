package com.taskapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.taskapp.model.Task;

public interface TasksDao {

	public boolean insertTask(Task task);
	 public  List<Task> taskList() throws SQLException;	
}
