package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taskapp.dao.TasksDaoImpl;
import com.taskapp.model.Task;

@WebServlet("/IsActiveTaskServlet")
public class IsActiveTaskServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		out.write( id);
		
		//Task task = new Task(id, "","","","","");
		TasksDaoImpl taskDao = new TasksDaoImpl(); 
		  boolean flag = taskDao.IsActiveTask(id); 
		  if (flag) {
			  out.write("\nUpdated successfully");
			  resp.sendRedirect("taskList.jsp");
		  } 
		  else { out.write("\nnot inserted"); }
		 
	}
}
