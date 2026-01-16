package com.productmanagerapp.controller;

import java.io.IOException;

import com.productmanagerapp.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productspage")
public class ProductPageController extends HttpServlet {
	private ProductService productService = new ProductService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("products", productService.getProducts());
		req.getRequestDispatcher("WEB-INF/view/productspage.jsp").forward(req, resp);
		
	}
}
