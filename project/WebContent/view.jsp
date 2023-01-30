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
<h1>Displaying Details</h1>

<s:property value="user_id"/><br>
		<s:property value="firstname"/><br>
		<s:property value="lastname"/><br>
		<s:property value="father_name"/><br>
		<s:property value="mother_name"/><br>
		<s:property value="gender"/><br>
		<s:property value="email"/><br>
		<s:property value="dob"/><br>
	
</body>
</html>