<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Login Page</h1>


	<form action="LoginServlet" method="POST">
	
	<p>${error}</p>
	
	Username<input type="text" name = "username"><br><br>
	Password <input type = "password" name = "password"><br><br>
	<input type = "submit" value = "Login">
	</form>

</body>
</html>