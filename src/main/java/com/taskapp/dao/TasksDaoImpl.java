package com.taskapp.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.taskapp.model.Task;

public class TasksDaoImpl implements TasksDao{

	
	@Override
	public boolean insertTask(Task task) {
		// TODO Auto-generated method stub
		
		String insert="insert into user_task(taskname,priority,createdby,status,createddate) values(?,?,?,?)";
		Connection con=Connection123.getDBConnection();
		boolean result=false;
		try {
			PreparedStatement pstmt=con.prepareStatement(insert);
			pstmt.setString(1, task.getTaskName());
			pstmt.setString(2, task.getPriority());
			pstmt.setString(3, task.getCreatedBy());
			pstmt.setString(4, task.getStatus());
   		    //pstmt.setDate(5,  (Date) task.getCreatedDate());
			
			result=pstmt.executeUpdate()>0;
			
			
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
                userBean.setId(rs.getInt("userid"));
                userBean.setTaskName(rs.getString("firstname"));
                userBean.setTaskName(rs.getString("lastname"));                             
                tasks.add(userBean);
            }
//			PreparedStatement pstmt=con.prepareStatement(insert);
						
//			result=pstmt.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
