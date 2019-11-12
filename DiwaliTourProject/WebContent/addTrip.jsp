<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addTrip" method="post">
	<label for="code">TripCode</label>
	<input type="number" name="code" />
	
	<label for="tripName">Trip Name</label>
	<input type="text" name="tripName" />
	
	<label for="startDate">Start Date</label>
	<input type="Date" name="startDate" />
	
	<label for="endDate">End Date</label>
	<input type="Date" name="endDate" />
	
	
	
	<label for="price">Price</label>
	<input type="number" name="price" />
</form>



</body>
</html>