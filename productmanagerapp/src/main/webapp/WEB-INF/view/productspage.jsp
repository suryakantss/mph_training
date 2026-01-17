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
			<th>Del</th>
		</tr>
		<c:forEach var="p" items="${products}">
			<tr>
				<td>${p.code}</td>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>
					<form action="productspage" method="get" onsubmit="return doCheck();">
						<input type="hidden" name="op" value="del">
						<input type="hidden" name="code" value="${p.code}">
						<button>X</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<script type="text/javascript">
		function doCheck() {
			if(prompt('Are you sure ?') == 'y')
			return true;
			else
			return false;
		}
	</script>
</body>
</html>