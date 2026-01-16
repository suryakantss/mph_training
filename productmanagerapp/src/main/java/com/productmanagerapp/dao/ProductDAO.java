package com.productmanagerapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.productmanagerapp.model.Product;
import com.productmanagerapp.util.ConnectionUtil;

public class ProductDAO {
	
	public Product save(Product product) {
		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into products values(?,?,?)";
		int n = 0;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, product.getCode());
			stmt.setString(2, product.getName());
			stmt.setInt(3, product.getPrice());
			n = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		if(n>0)
			return product;
		else
			return null;
	}
	public List<Product> findAll() {
		List<Product> products = new ArrayList<>();
		Connection con = ConnectionUtil.getConnection();
		String sql = "select * from products";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				products.add(new Product(rs.getString("code"), rs.getString("name"), rs.getInt("price")));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return products;
	}

}
