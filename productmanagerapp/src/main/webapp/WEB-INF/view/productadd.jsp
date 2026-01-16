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
		<form action="productspage" method="post"
			onsubmit="return validate(this);">
			<h3>Create Product</h3>
			<div>
				<label>Code</label> <input type="text" name="code"><span
					class='err'>*</span>
			</div>
			<div>
				<label>Name</label> <input type="text" name="name"><span
					class='err'>*</span>
			</div>
			<div>
				<label>Price</label> <input type="text" name="price"><span
					class='err'>*</span>
			</div>
			<div>
				<button>Save</button>
			</div>
		</form>
	</div>
	<script>
		function validate(frm) {
			if (frm.code.value == '') {
				alert('code is required...')
				return false;
			} else if (frm.name.value == '') {
				alert('name is required...')
				return false;
			} else if (frm.price.value == '') {
				alert('price is required...')
				return false;
			}
			return true;
		}
	</script>

</body>
</html>