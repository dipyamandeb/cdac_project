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
	<s:form action="resgister" method="post" >
		<s:textfield name="stud_id" label="Student-Id"></s:textfield>
		<s:textfield name="stud_fname" label="Firstname"></s:textfield>
		<s:textfield name="stud_lname" label="Lastname"></s:textfield>
		<s:submit value="Register"></s:submit>
	</s:form>
</body>
</html>