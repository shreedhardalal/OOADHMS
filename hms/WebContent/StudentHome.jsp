<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if((String)session.getAttribute("username")==null||(String)session.getAttribute("username")=="")
		response.sendRedirect("login.jsp");
	

		out.println("Welcome : " + (String)session.getAttribute("username"));
	
%>
<br>
<a href="Logout.jsp">Logout</a>
</body>
</html>