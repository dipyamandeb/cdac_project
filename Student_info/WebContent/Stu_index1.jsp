<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
	<body>

	<s:form action="register" method="post">
	<s:textfield  label="First Name" name="fname"></s:textfield>
	<s:textfield  label="Last Name" name="lname"></s:textfield>
	<s:textfield  label="Father's Name" name="faname"></s:textfield>
	<s:textfield  label="Mother's Name" name="moname"></s:textfield>
	<s:textfield  label="Course Applied" name="Ca"></s:textfield>
	<s:textfield  label="Email" name="email"></s:textfield>
	<s:textfield  label="Date of Birth" name="dob"></s:textfield>
	<s:textfield  label="Blood Group" name="bloodg"></s:textfield>
	<s:textfield  label="Mobile no." name="mobile"></s:textfield>
	<s:textfield  label="Nationality" name="nationality"></s:textfield>
	<s:textfield  label="Region" name="region"></s:textfield>
	<s:textfield  label="Category" name="category"></s:textfield>
	<s:textarea   label="Address" name="address"></s:textarea>
	<s:textfield  label="City" name="City"></s:textfield>
	<s:textfield  label="state" name="state"></s:textfield>
	<s:submit 	  value="Register"></s:submit>
	
	</s:form>		
	


</body>
</html>


