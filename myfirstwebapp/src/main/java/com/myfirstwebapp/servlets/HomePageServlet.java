package com.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomePageServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("This is init method...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h3>Welcome!! " + new Random().nextInt(10) +"</h3>");
		out.println("<h3>This is Home Page</h3>");
	}
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method...");
		
	}

}
