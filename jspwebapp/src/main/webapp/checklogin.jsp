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
<h3>Welcome <%= login %></h3>
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
