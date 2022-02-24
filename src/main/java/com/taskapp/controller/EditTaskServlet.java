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

@WebServlet("/EditTaskServlet")
public class EditTaskServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		String taskName = req.getParameter("task_name");
		String status = req.getParameter("status");
		String priority=req.getParameter("priority");
		String createdby=req.getParameter("created_by");
		//int id = Integer.parseInt(req.getParameter("id"));
		String id = req.getParameter("id");
		
		out.write(taskName);
		out.write(status);
		out.write( id);
//		 Integer.valueOf(id);
//		out.write("\nUpdated successfully");
		Task task = new Task(id, taskName,priority,createdby,status,"");
		TasksDaoImpl taskDao = new TasksDaoImpl(); 
		  boolean flag = taskDao.editTask(task); 
		  if (flag) {
			  out.write("\nUpdated successfully");
			  resp.sendRedirect("taskList.jsp");
		  } 
		  else { out.write("\nnot inserted"); }
		 
	}
}
