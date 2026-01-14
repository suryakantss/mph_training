package com.mysecondwebapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletB")
public class ServletB extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3> Company : " + getServletContext().getAttribute("Company") + "</h3>");
		out.println("<h3> Course : " + getServletContext().getAttribute("Course") + "</h3>");
		out.println("<h3> Location : " + getServletContext().getInitParameter("location") + "</h3>");

	}

}
