<%@page import="java.util.ArrayList"%>
<%@page import="com.productmanagerapp.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<jsp:include page="menubar.jsp"></jsp:include>
<%
List<Product> products = (ArrayList)request.getAttribute("products");
for(Product p:products)
{
%>
<h4><%= p.getCode() %>,<%= p.getName() %>,<%= p.getPrice() %></h4>
<%
}
%>
</body>
</html>