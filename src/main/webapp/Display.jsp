<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.List"%>
<%@page import="com.ty.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
</head>
<body>
<%@ include file="mynavbar.jsp" %>
<%@include file="Navbar.jsp" %>


	<%
List<Student> student=(List<Student>)request.getAttribute("studentlist");
  %>
	<table border="1">
		<tr>

			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>

		<%
		for(Student stu : student) {
			%>

		<tr>

			<td><%=stu.getName() %></td>
			<td><%=stu.getEmail()%></td>
			<td><%=stu.getPhone_no() %></td>
			<td><%=stu.getAge()%></td>
			<td><%=stu.getGender()%></td>
			<td><a href="delete?id=<%=stu.getId() %>">Delete</a></td>
			<td><a href="getstudent?id=<%=stu.getId() %>">Edit</a></td>
		</tr>


		<%
		}
	%>

	</table>

</body>
</html>