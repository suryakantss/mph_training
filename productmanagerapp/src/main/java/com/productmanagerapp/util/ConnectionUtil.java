package com.productmanagerapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/mpdb","root","root");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
