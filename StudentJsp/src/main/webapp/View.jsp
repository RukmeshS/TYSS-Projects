	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<%@page import ="com.ty.dto.Student" %>
<%@page import="java.util.List"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View page</title>
</head>
<body>
<%
List<Student> list =(List)request.getAttribute("students");
%>
<table border="2px">
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>phone</th>
<th>password</th>
</tr>
        <%for (Student students : list) {%>
		<tr>
			<td><%=students.getId()%></td>
			<td><%=students.getName()%></td>
			<td><%=students.getEmail()%></td>
			<td><%=students.getPhone()%></td>
			<td><%=students.getPassword()%></td>
			<td><a href="view?id=<%=students.getId()%>">view</a></td>

		</tr>

		<%
		}
		%>
</table>
</body>
</html>