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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("pass");

		User user = new User(name, email, password);
		//out.write(name+" "+email+" "+password);

		UserDaoImpl userDao = new UserDaoImpl();

		boolean flag = userDao.insertUser(user); 
		if (flag) {
			out.write("\ninserted successfully");
		} else {
			out.write("\nnot inserted");
		}

	}

}
