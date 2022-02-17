package com.taskapp.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.taskapp.model.Task;

public class TasksDaoImpl implements TasksDao {

	
	@Override
	public boolean insertTask(Task task) {
		// TODO Auto-generated method stub
		
		String insert="insert into user_task(taskname,priority,createdby,status,createddate) values(?,?,?,?,?)";
		Connection con=Connection123.getDBConnection();
		boolean result=false;
		try {
			//java.sql.Date sqlDate = java.sql.Date.valueOf( sqlDate ) ;

			PreparedStatement pstmt=con.prepareStatement(insert);
			pstmt.setString(1, task.getTaskName());
			pstmt.setString(2, task.getPriority());
			pstmt.setString(3, task.getCreatedBy());
			pstmt.setString(4, task.getStatus());
			pstmt.setDate(5, new Date(0));

   		   // pstmt.setObject(5, sqlDate);
   		    
   			System.out.println(task.getTaskName());
   			System.out.println(task.getPriority());
   			System.out.println(task.getCreatedBy());
   			System.out.println(task.getCreatedDate());

			
			result = pstmt.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return result;
	}
	
	
	public  TasksDaoImpl() {
		
		// TODO Auto-generated method stub
		 List tasks = new ArrayList();
		
		String insert="select * from user_task";

		Connection con=Connection123.getDBConnection();
		
		boolean result=false;
		try {
			
			PreparedStatement ps = con.prepareStatement(insert);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Task userBean = new Task();
                userBean.setTaskName(rs.getString("taskName"));
                userBean.setPriority(rs.getString("priority"));
                userBean.setCreatedBy(rs.getString("createdBy"));    
                userBean.setStatus(rs.getString("status"));
                userBean.setCreatedDate(rs.getString("createdDate"));
                tasks.add(userBean);
            }
//			PreparedStatement pstmt=con.prepareStatement(insert);
						
//			result=pstmt.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			 con=Connection123.getDBConnection();
			pstmte = con.prepareStatement(selectQuery);
			rs = pstmte.executeQuery();
			while (rs.next()) {
				Task task = new Task();
				//answer.set(rs.getString(1));
				//answer.setStatus(rs.getString(2));
				
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

	
	/*
	 * @Override
	public List<Task> taskList() {
		
		List <Task> tasks = new ArrayList<>();
		
			String query="select * from user_task";

			Connection con=Connection123.getDBConnection();
			
			boolean result=false;
			try {
				
				PreparedStatement ps = con.prepareStatement(query);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Task userBean = new Task();
	                
	                userBean.setTaskName(rs.getString("taskname"));
	                userBean.setCreatedBy(rs.getString("createdby"));                             
	                tasks.add(userBean);
	                
	                
	            }
//				PreparedStatement pstmt=con.prepareStatement(insert);
						
//				result=pstmt.executeUpdate()>0;
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return tasks;
	}
	*/