package com.jsp.genericservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, res);
	}

}
