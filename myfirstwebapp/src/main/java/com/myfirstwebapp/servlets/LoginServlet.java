package com.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		if(session.getAttribute("username") == null )
		{
			RequestDispatcher disp =  req.getRequestDispatcher("loginpage.html");
			disp.forward(req, resp);
			
		}
		else
			out.println("Already loggedin....");
			
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		String login = req.getParameter("lg");
		String password = req.getParameter("pw");
		if (login == null || password == null || login.equals("") || password.equals(""))
			out.print("<h3>Login/Password required...</h3>");
		else if (login.equals("Jack") && password.equals("Sparrow"))
		{
			session.setAttribute("username", login);
			out.print("<h3>Welcome " + login + "!!</h3>");
		}
		else
			out.print("<h3>Invalid Login/Password...</h3>");

	}
}
