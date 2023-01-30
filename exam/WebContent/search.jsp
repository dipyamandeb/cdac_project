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
	<s:form action="search" method="post">
	
		<s:textfield name="book_id" label="Book-Id"></s:textfield>
		<s:textfield name="book_name" label="Book-Name"></s:textfield>
		<s:textfield name="author_name" label="author_name"></s:textfield>
		<s:submit value="search"></s:submit>
	
	</s:form>
</body>
</html>