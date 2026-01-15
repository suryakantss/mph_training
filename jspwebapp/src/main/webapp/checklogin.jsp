<html>
<head>
<link rel="stylesheet" href="style.css">
</head>

<body>
<jsp:include page="menu.jsp"></jsp:include>
<%
String login = request.getParameter("lg");
String password = request.getParameter("pw");
if(login.equals("Jai") && password.equals("Veeru"))
{
	session.setAttribute("user", login);
%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
}
else
{
%>
<h3>Invalid login/password</h3>
<%
}
%>
</body>

</html>
