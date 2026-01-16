package com.productmanagerapp.service;

import java.util.List;

import com.productmanagerapp.dao.ProductDAO;
import com.productmanagerapp.model.Product;

public class ProductService {
	private ProductDAO productDAO = new ProductDAO();

	public List<Product> getProducts() {
		return productDAO.findAll();
	}

}
