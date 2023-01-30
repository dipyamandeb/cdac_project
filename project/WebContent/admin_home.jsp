<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username = (String)session.getAttribute("admin"); %>
	<h1>WelcomeAdmin!!!</h1> 
	<p><%= username %></p>
	
	
	<s:a href="student_profile">View Student Profile</s:a><br>
	<s:a href="show_reports">Show Reports</s:a><br>
	<s:a href="Schedule">Schedule for batch</s:a>
	
</body>
</html>