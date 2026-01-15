package com.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/hitcounter")
public class CounterServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		if(getServletContext().getAttribute("counter") == null)
			getServletContext().setAttribute("counter", 0);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		if(session.isNew())
		{
			int n = (int)getServletContext().getAttribute("counter");
			n++;
			getServletContext().setAttribute("counter", n);
		}
		PrintWriter out = resp.getWriter();
		out.println("<h3> counter :" + getServletContext().getAttribute("counter"));
	}
}
