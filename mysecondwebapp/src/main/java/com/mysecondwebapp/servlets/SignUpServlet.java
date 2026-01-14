package com.mysecondwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

	private HashMap<String, String> data = new HashMap<String, String>();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String fname = req.getParameter("fname");
		String email = req.getParameter("email");
		if (data.containsKey(email))
			req.setAttribute("flag",true);
		else
		{
			req.setAttribute("flag",false);
			data.put(email, fname);
		}
		RequestDispatcher rd = req.getRequestDispatcher("success");
		rd.forward(req, resp);

	}
}
