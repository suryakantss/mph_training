<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div>
<jsp:include page="menu.jsp"></jsp:include>
<%
if(session.getAttribute("user") != null)
{
%>
<h3>Already logged in....</h3>
<%
}
else {
%>
<form action="checklogin.jsp" method="post">
<h3>Login Form</h3>
	<div>
	<label>Login</label>
	<input type="text" name="lg">
	</div>
		<label>Password</label>
	<input type="text" name="pw">
	</div>
	<div>
	<button>Next</button>
	</div>
	
</form>
<%
}
%>
</div>
</body>
</html>