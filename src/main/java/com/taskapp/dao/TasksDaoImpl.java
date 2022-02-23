package com.taskapp.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.taskapp.model.Task;

public class TasksDaoImpl implements TasksDao {

	@Override
	public boolean insertTask(Task task) {
		// TODO Auto-generated method stub

		String insert = "insert into user_task(taskname,priority,createdby,status) values(?,?,?,?)";
		Connection con = Connection123.getDBConnection();
		boolean result = false;
		try {

			PreparedStatement pstmt = con.prepareStatement(insert);
			pstmt.setString(1, task.getTaskName());
			pstmt.setString(2, task.getPriority());
			pstmt.setString(3, task.getCreatedBy());
			pstmt.setString(4, task.getStatus());
			//pstmt.setDate(5, new Date(0));
			result = pstmt.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	public boolean editTask(Task task) {
	    Connection connection = Connection123.getDBConnection();
	    String sql = "update user_task set taskname=?,priority=?, status=? where id=?";
//	    sql += " where id=? ";
	    int i = 0;
	    try {
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
	      preparedStatement.setString(1, task.getTaskName());
	      preparedStatement.setString(2, task.getPriority());
	      preparedStatement.setString(3, task.getStatus());
	      preparedStatement.setInt(4, Integer.parseInt(task.getId()));
	      
	      i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    if (i == 0) {
	      return false;
	    } else {
	      return true;
	    }
	  }
	public boolean findTask(Task task) {
	    Connection connection = Connection123.getDBConnection();
	    String sql = "update user_task set taskname=?, status=? where id=?";
//	    sql += " where id=? ";
	    int i = 0;
	    try {
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
	      preparedStatement.setString(1, task.getTaskName());
	      preparedStatement.setString(2, task.getStatus());
	      preparedStatement.setInt(3, Integer.parseInt(task.getId()));
	      
	      i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    if (i == 0) {
	      return false;
	    } else {
	      return true;
	    }
	}
	public boolean IsActiveTask(String id) {
		 Connection connection = Connection123.getDBConnection();
	    String sql = "Update User_task SET IsActive=? where id=?";
	    int i = 0;
	    try {
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
	      preparedStatement.setInt(1, 1);
	      preparedStatement.setInt(2, Integer.parseInt(id));
	      i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    if (i == 0) {
		      return false;
		    } else {
		      return true;
		    }
	  }
	public boolean deleteTask(String id) {
		 Connection connection = Connection123.getDBConnection();
	    String sql = "delete from User_task where id=?";
	    int i = 0;
	    try {
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
	      //preparedStatement.setInt(1, 1);
	      preparedStatement.setInt(1, Integer.parseInt(id));
	      i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    if (i == 0) {
		      return false;
		    } else {
		      return true;
		    }
	  }

	@Override
	public List<Task> taskList() throws SQLException {
		List<Task> taskList = new ArrayList<>();
		String selectQuery = "select * from user_task";
		Connection con = null;
		PreparedStatement pstmte = null;
		ResultSet rs = null;
		try {
			con = Connection123.getDBConnection();
			pstmte = con.prepareStatement(selectQuery);
			rs = pstmte.executeQuery();
			while (rs.next()) {
				Task task = new Task();

				task.setTaskName(rs.getString(1));
				task.setPriority(rs.getString(2));
				task.setCreatedBy(rs.getString(3));
				task.setStatus(rs.getString(4));
				task.setCreatedDate(rs.getString(5));

				taskList.add(task);
			}

		} catch (SQLException e) {

			e.getMessage();
		} finally {
			if (pstmte != null) {
				pstmte.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return taskList;
	}

}

