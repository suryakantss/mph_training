<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Products</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h3>Product List</h3>
	<table>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<%
		String url = "jdbc:mysql://localhost/mpdb";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "select * from products";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("code")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getInt("price")%></td>
		</tr>
		<%
		}
		rs.close();
		stmt.close();
		con.close();
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		%>
	</table>
</body>
</html>