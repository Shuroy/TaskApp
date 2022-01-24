package com.taskapp.dao;

import com.taskapp.model.User;

public interface UserDao {
	
	public boolean insertUser(User user);
	public boolean findUser(User user);
}
