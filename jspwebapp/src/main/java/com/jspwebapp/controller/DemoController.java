package com.jspwebapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jspwebapp.service.TopicService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TopicService ts = new TopicService();
		List<String> topics = ts.getAllTopics();
		req.setAttribute("topics", topics);
		req.getRequestDispatcher("WEB-INF/demo.jsp").forward(req, resp);
	}

}
