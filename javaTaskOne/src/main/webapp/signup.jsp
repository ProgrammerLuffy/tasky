<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Sign Up Form</h1>

	<form action="SignUpServlet" method="POST">
	
	
	FirstName<input type="text" name = "fname"><br><br>
	LastName <input type = "text" name = "lname"><br><br>
	Username<input type="text" name = "username"><br><br>
	Password <input type = "password" name = "password"><br><br>
	<input type = "submit" value = "Signup">
	</form>

</body>
</html>