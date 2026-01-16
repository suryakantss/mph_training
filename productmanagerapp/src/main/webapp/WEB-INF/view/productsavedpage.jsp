<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Saved</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:include page="menubar.jsp"></jsp:include>
	<h3>${product.code},${product.name},${product.price}</h3>
	<h3>Saved...</h3>
</body>
</html>