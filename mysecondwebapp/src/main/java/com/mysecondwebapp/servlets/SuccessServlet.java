package com.mysecondwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if ((Boolean)req.getAttribute("flag"))
			out.println("<h3>Already Registered</h3>");
		else 
			out.println("<h3>Thank you for registration!!</h3>");
			out.println("<h3>" + req.getParameter("fname") + "," + req.getParameter("email") + "</h3>");

	}
}
