<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="mynavbar.jsp" %>
<%@include file="Navbar.jsp" %>

<form action="create" method="post">

<table border="1">
<tr>
<td>Name</td>
<td><input type="text" name="name"> </td>

</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
 </td>
</tr>
<tr>
<td>Age:</td>
<td> <input type="number" name="age"> </td>
</tr>
<tr>
<tr>
<td>Phone:</td>
<td> <input type="number" name="phone"> </td>
</tr>
<tr>
<td colspan="2"> <input type="submit" value="Save"></td>
</tr>

</table>

</form>
</body>
</html>