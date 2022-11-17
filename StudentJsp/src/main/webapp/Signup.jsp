<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup page</title>
</head>
<body>

<%String message = (String)request.getAttribute("message"); %>
<h3>
<%
if (message != null){%>
<%=message %>
<% }%>
</h3>

<form action="Signup" method ="post">
<table>

<tr><td>
<label for "name">Name</label>
<input type ="text" placeholder="Enter Student name" name="name" required="required">
</td></tr>

<tr><td>
<label for "phone">Phone</label>
<input type ="tel" placeholder="Enter Student Pnumber" name="phone" required="required">
</td></tr>

<tr><td>
<label for "email">Email</label>
<input type ="text" placeholder="Enter Student email" name="email"  required="required">
</td></tr>

<tr><td>
<label for "password">Password</label>
<input type ="password" placeholder="Enter Student password" name="password" required="required">
</td></tr>

<tr><td>
<input type ="Submit">
</td></tr>


</table>
</form>
</body>
</html>