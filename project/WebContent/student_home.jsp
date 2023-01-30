<%@page import="stud.Userbean"%>
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
<%= session.getAttribute("student")%>

<h1>WelcomeStudent!!!</h1>


<s:a href="edit_profile.jsp"><s:submit value="Edit Profile"></s:submit></s:a>
<s:a href="logout.jsp"><s:submit value="Logout"></s:submit></s:a>
</body>
</html>