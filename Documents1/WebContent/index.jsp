<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="verified" method="post">

	<s:textfield name="Batch_ID"  label="Enter The Batch ID"></s:textfield>
	<s:textfield name="Student_ID"  label="Enter The Student ID"></s:textfield>
	<s:checkbox name="Doc1" label="HSC Marksheet" fieldValue="HSC"></s:checkbox>
	<s:checkbox name="Doc2" label="SSC Marksheet" fieldValue="SSC"></s:checkbox>
	<s:checkbox name="Doc3" label="Graduation Marksheet" fieldValue="Grad"></s:checkbox>
	<s:checkbox name="Doc4" label="Marksheet" fieldValue="Mark"></s:checkbox>
	
	<s:submit value="Verifed"></s:submit>
	</s:form>




</body>
</html>