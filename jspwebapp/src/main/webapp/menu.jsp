<div>
<img src='logo.jpg' width="100px"> 
</div>
<h2>Welcome <%= session.getAttribute("user")==null?"Guest":session.getAttribute("user") %> </h2>

<div>
<a href='index.jsp'>Home</a>
<a href='loginpage.jsp'>Login</a>
<a href='logoutpage.jsp'>Logout</a>

</div>