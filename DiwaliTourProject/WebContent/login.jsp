<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="login" method="post">
	<label for="userId">User Id : </label>
	<input type="number" name="userId" />
	<label for="passWord">Password : </label>
	<input type="password" name="passWord" />
	<input type="submit" name="submit" value="login"/>
</form>
</body>
</html>