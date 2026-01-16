<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<jsp:include page="menubar.jsp"></jsp:include>
	<div>
		<form action="productspage" method="post">
			<h3>Create Product</h3>
			<div>
				<label>Code</label> <input type="text" name="code">
			</div>
			<div>
				<label>Name</label> <input type="text" name="name">
			</div>
			<div>
				<label>Price</label> <input type="text" name="price">
			</div>
			<div>
				<button>Save</button>
			</div>
		</form>
	</div>

</body>
</html>