<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Search</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:include page="menubar.jsp"></jsp:include>
	<h3>Search Page</h3>
	<div>
		<form action="productspage" method="get">
		   <input type="hidden" name="op" value="dosearch">
			<div>
				<label>Enter Product Code</label> 
				<input type='text' name='code'>
			</div>
			<div>
			<button>Search</button>
			</div>
		</form>
	</div>
	<h3>${product.code}</h3>
	<h3>${product.name}</h3>
	<h3>${product.price}</h3>
</body>
</html>