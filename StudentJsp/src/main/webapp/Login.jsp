<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

<%String message = (String)request.getAttribute("invalid"); %>
<h3>
<%
if (message != null){%>
<%=message %>
<% }%>
</h3>

<form action="Login" method="post">
<table>

<tr><td>
<label>Email</label>
<input type ="text" placeholder="Enter Student email" name="email"required="required">
</td></tr>

<tr><td>
<label>Password</label>
<input type ="password" placeholder="Enter Student password" name="password"required="required">
</td></tr>


<td>
<input type="submit">
</td>

</table>
</form>
</body>
</html>