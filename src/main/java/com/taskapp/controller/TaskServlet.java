package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
//import java.sql.Date;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taskapp.dao.TasksDaoImpl;
import com.taskapp.model.Task;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();

		String taskName = req.getParameter("task_name");
		String priority = "Low";
		String createdBy = "Shubham";
		String status = "Pending";
		Task task = new Task("",taskName, priority, createdBy, status, "");

		TasksDaoImpl taskDao = new TasksDaoImpl();

		boolean flag = taskDao.insertTask(task);

		if (flag) {
			out.write("\ninserted successfully");
			resp.sendRedirect("register.jsp");

		} else {
			out.write("\nnot inserted");
		}
	}
}
