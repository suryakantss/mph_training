package com.productmanagerapp.service;

import java.util.List;

import com.productmanagerapp.dao.ProductDAO;
import com.productmanagerapp.model.Product;

public class ProductService {
	private ProductDAO productDAO = new ProductDAO();

	public List<Product> getProducts() {
		return productDAO.findAll();
	}
	public Product getProduct(String code) {
		return productDAO.findByCode(code);
	}

	public Product addProduct(Product product) {
		return productDAO.save(product);
	}

	public String delProduct(String code) {
		return productDAO.delete(code);
	}
}
