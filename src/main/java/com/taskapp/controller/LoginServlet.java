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
		out.write("Hello world");
		out.write("Servelet Called");
		
		String uname=req.getParameter("user name");
		String uemail=req.getParameter("user email");
		String password=req.getParameter("pass");
		
		User user=new User(uname, uemail, password);
		
		UserDaoImpl userDao=new UserDaoImpl();
		out.write(uemail);
		out.write(password);
		boolean flag=userDao.findUser(user);
		if(flag)
		{
			out.write("\nLogin successfully");
		}
		else
		{
		out.write("\nInvalid Login Crendential");	
		}
	}

}
