<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<%@page import ="com.ty.dto.Student" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<% Student student = (Student)request.getAttribute("student");%>
	<h3>Name:<%=student.getName() %></h3>
	<h3>Email:<%=student.getEmail() %></h3>
	<h3>Password:<%=student.getPassword()%></h3>
</body>
</html>