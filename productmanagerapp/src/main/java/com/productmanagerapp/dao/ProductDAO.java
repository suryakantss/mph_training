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
