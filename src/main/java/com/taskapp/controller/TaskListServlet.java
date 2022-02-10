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
public class TaskListServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		//out.write("Hello world Task List");
		boolean flag = false;
		TasksDaoImpl taskDao = new TasksDaoImpl();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();

		TasksDaoImpl taskDao = new TasksDaoImpl();
		List<Task> listTask = taskDao.taskList();
//System.out.println(listTask);
//		for (int i = 1; i <= n; ++i) {
//		      System.out.println("Java is fun");
//		    }
		out.println(listTask.get(0));
		out.write("List working");
		req.setAttribute("task", listTask);
//.write(listTask);

		RequestDispatcher dispatcher = req.getRequestDispatcher("tasklist.jsp");
		dispatcher.forward(req, resp);

	}

}
