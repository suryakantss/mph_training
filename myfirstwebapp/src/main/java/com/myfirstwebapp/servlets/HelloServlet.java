package com.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		PrintWriter out = resp.getWriter();
		out.print("<h3>Welcome to Servlet " +  name + " , " + city + "</h3>");
	}

}
