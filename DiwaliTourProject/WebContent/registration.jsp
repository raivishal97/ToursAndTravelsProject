<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="register" method="post">
	<label for="firstName">First Name : </label>
	<input type="text" name="firstName" /><br>
	<label for="lastName"> Last Name :  </label>
	<input type="text" name="lastName" /><br>
	<label for="userName"> UserId : </label>
	<input type="number" name="userName" /><br>
	<label for="passWord"> PassWord :   </label>
	<input type="password" name="passWord" /><br>
	<label>User or Employee : </label>
	<select name="options">
		<option>User</option>
		<option>Employee</option>
	</select><br>
	<input type="submit" name="Submit" value="Submit"/>
	
</form>
</body>
</html>