package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.taskapp.dao.TasksDaoImpl;
import com.taskapp.model.Task;


@WebServlet("/tasklist")
public class TaskListServlet extends HttpServlet
{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		out.write("Hello world Task List");
				
		TasksDaoImpl taskDao=new TasksDaoImpl();
		
		boolean flag=taskDao.insertTask("taskname","low","pending","shubham");
		out.write("Servelet Call");
		if(flag)
		{
			out.write("\ninserted successfully");
		}
		else
		{
		out.write("\nnot inserted");	
		}
		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		out.write("Hello world Task List");
		
		TasksDaoImpl taskDao=new TasksDaoImpl();
		 List < Task > listTask = taskDao.taskList();
	        req.setAttribute("listUser", listTask);
	        RequestDispatcher dispatcher = req.getRequestDispatcher("tasklist.html");
	        dispatcher.forward(req, resp);
				
//		TasksDaoImpl taskDao=new TasksDaoImpl();
//		
//		boolean flag=taskDao.insertTaskList();
//		out.write("Servelet Call");
//		if(flag)
//		{
//			out.write("\ninserted successfully");
 //		}
//		else
//		{
//		out.write("\nnot inserted");	
//		}
		
		
		
	}

}
 