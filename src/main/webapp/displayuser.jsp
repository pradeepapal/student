<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%
	String name = (String)session.getAttribute("name"); 
	if(name == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<%@ include file="mynavbar.jsp" %>
	<h1>User list</h1>
</body>
</html>