<%@page import="com.ty.dto.Student"%>
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

	<% Student user=(Student)request.getAttribute("mystudents");  %>

	<h1>Edit User</h1>
	<form action="edit" method="post">

		ID : <input type="number" name="id" value=<%= user.getId() %>
			readonly="readonly"></br>
		</br> Name : <input type="text" name="username" value=<%= user.getName() %>>
		</br>
		</br> Email : <input type="text" name="email" value=<%= user.getEmail() %>>
		</br>
		</br> Age : <input type="number" name="age" value=<%=user.getAge() %>></br>
		</br>
		
		 Gender:<input type="radio" name="gender" value=<%=user.getGender() %>>Male
		<input type="radio" name="gender" value=<%=user.getGender()%>>Female
		
		Phone : <input type="number" name="phone"
			value=<%=user.getPhone_no() %>> </br>
		</br> <input type="submit" value="Update Student">

	</form>
</body>
</html>