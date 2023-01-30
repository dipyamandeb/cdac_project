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
	<s:form action="add_book" method="post">
	
		<s:textfield name="book_id" label="Book-Id"></s:textfield>
		<s:textfield name="book_name" label="Book Name"></s:textfield>
		<s:textfield name="author_name" label="Author name"></s:textfield>
		<s:submit value="Add Book"></s:submit>
	
	</s:form>
	<s:a href="delete.jsp">delete book</s:a><br>
	<s:a href="search.jsp">search book</s:a>
</body>
</html>