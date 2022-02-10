package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taskapp.dao.TasksDaoImpl;
import com.taskapp.model.Task;


@WebServlet("/task")
public class TaskServlet extends HttpServlet
{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		out.write("Hello world Task");
		
		
		String taskName=req.getParameter("task_name");
		
		SimpleDateFormat format = new SimpleDateFormat("MMDDYYYY");
		 format.getCalendar();
		String priority = "Low";
		String createdBy = "Shubham";
		String status = "PENDING";
		Date d = new Date(0);
		out.write(priority);
		out.write(createdBy);
		out.write(status);
		out.write(taskName);
//out.write(d);

		Task task=new Task(taskName, priority,createdBy,status, d);
		
		TasksDaoImpl taskDao = new TasksDaoImpl();
		
		  boolean flag =taskDao.insertTask(task);
		  
		  
		if(flag)
		{
			out.write("\ninserted successfully");
			resp.sendRedirect("tasklist.jsp");

		}
		else
		{
		out.write("\nnot inserted");	
		}
	}
}

