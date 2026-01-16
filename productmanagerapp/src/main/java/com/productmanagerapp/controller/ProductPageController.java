package com.productmanagerapp.controller;

import java.io.IOException;

import com.productmanagerapp.model.Product;
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
		if(req.getParameter("op").equals("list"))
		{
		req.setAttribute("products", productService.getProducts());
		req.getRequestDispatcher("WEB-INF/view/productspage.jsp").forward(req, resp);
		}
		else if (req.getParameter("op").equals("add")) {
			req.getRequestDispatcher("WEB-INF/view/productadd.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code=req.getParameter("code");
		String name=req.getParameter("name");
		int price = Integer.valueOf(req.getParameter("price"));
		Product p = new Product(code,name,price);
		req.setAttribute("product", productService.addProduct(p));
		req.getRequestDispatcher("WEB-INF/view/productsavedpage.jsp").forward(req, resp);

	}
}
