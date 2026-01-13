package com.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String login = req.getParameter("lg");
		String password = req.getParameter("pw");
		if (login == null || password == null || login.equals("") || password.equals(""))
			out.print("<h3>Login/Password required...</h3>");
		else if (login.equals("Jack") && password.equals("Sparrow"))
			out.print("<h3>Welcome " + login + "!!</h3>");
		else
			out.print("<h3>Invaid Login/Password...</h3>");

	}
}
