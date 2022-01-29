package com.taskapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.taskapp.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		
		String insert="insert into user_details (Name,Email,Password) values(?,?,?)";
		Connection con=Connection123.getDBConnection();
		boolean result=false;
		try {
			PreparedStatement pstmt=con.prepareStatement(insert);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3,user.getPassword());
			
			result=pstmt.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	
	public boolean findUser(User user) {
		// TODO Auto-generated method stub
		
		String insert="insert into user_details values(?,?)";
		String qury="select * from user_details where email=? and password=?";
		Connection con=Connection123.getDBConnection();
		boolean result=false;
		try {
			PreparedStatement pstmt=con.prepareStatement(qury);
			//pstmt.setString(1, user.getName()); 
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2,user.getPassword());
			
			result=pstmt.executeUpdate()>0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
