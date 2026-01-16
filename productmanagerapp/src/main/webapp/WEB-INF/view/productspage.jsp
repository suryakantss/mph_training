<%@ taglib uri="jakarta.tags.core" prefix="c"%>
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
	<table>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="p" items="${products}">
			<tr>
				<td>${p.code}</td>
				<td>${p.name}</td>
				<td>${p.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>