<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Diwali Tours</title>
</head>
<body>
<h2 align="center">Welcome To Vishal Tours</h2>

<table>
	<tr>
		<th>Code</th>
		<th>Trip Name</th>
		<th>Start Date</th>
		<th>End Date</th>
		<th>Price</th>
	</tr>
	
	<c:forEach var="eachTrip" items="${requestScope.foundTrip}">
	<tr>
		<td><c:out value ="${eachTrip.code}"/></td>
		<td><c:out value ="${eachTrip.authorName}"/></td>
		<td><c:out value ="${eachTrip.phoneNumber}"/></td>
		<td><c:out value ="${eachTrip.email}"/></td>
	</tr>
	 
	</c:forEach>
</table>
</body>
</html>