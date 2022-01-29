package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taskapp.dao.UserDaoImpl;
import com.taskapp.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		PrintWriter out=resp.getWriter();
		//out.write("Hello world");
		out.write("Servelet Called");
		
		//String uname=req.getParameter("user name");
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		User user=new User("" ,email,password);
		
		UserDaoImpl userDao=new UserDaoImpl();
		
		//pstmt.setString(1, user.getEmail());

		boolean flag=userDao.findUser(user);
		if(flag)
		{
			out.write("\nLogin successfully");
		}
		else
		{
		out.write("\nInvalid Login Crendential");	
		out.write(user.getEmail());
				out.write(user.getPassword());
		}
	}

}
