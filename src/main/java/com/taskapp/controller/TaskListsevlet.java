package com.taskapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import com.taskapp.dao.TasksDaoImpl;
import com.taskapp.model.Task;

@WebServlet("/TaskListservlet")
public class TaskListsevlet extends HttpServlet {

	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TasksDaoImpl taskDao = new TasksDaoImpl();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside TaskList doGet method");
		
		try {
			TasksDaoImpl impl = new TasksDaoImpl();
			TasksDaoImpl taskDao = new TasksDaoImpl();
			List<Task> listTask = new ArrayList<Task>();
			listTask = taskDao.taskList();
			request.setAttribute(" ", listTask);
			RequestDispatcher req = request.getRequestDispatcher("taskList.jsp");
			req.forward(request, response);
			
		} catch (SQLException e) {
			e.getMessage();
		}

	}

}
