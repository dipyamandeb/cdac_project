<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ page import="module1.Login_Check" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
	<body>
	
	
	<s:form action="register" method="post">
	<s:textfield label="User-Id" name="user_id" disabled="true" value="{username}"  ></s:textfield>
	<s:textfield label="Password" name="password" type="password"></s:textfield>
	<s:textfield  label="First Name" name="firstname"></s:textfield>
	<s:textfield  label="Last Name" name="lastname"></s:textfield>
	<s:textfield  label="Father's Name" name="father_name"></s:textfield>
	<s:textfield  label="Mother's Name" name="mother_name"></s:textfield>
	<s:radio      label="Gender" name="gender" list="{'male','female'}" />
	<s:textfield  label="Email" name="email"></s:textfield>
	<s:textfield  label="Date of Birth" name="dob"></s:textfield>
	<s:textfield  label="Blood Group" name="blood_group"></s:textfield>
	<s:textarea   label="Address" name="address"></s:textarea>
	<s:textfield  label="City" name="city"></s:textfield>
	<s:textfield  label="Pin-code" name="pin_code"></s:textfield>
	<s:textfield  label="State" name="state"></s:textfield>
	<s:textfield  label="Mobile" name="mobile"></s:textfield>
	<s:textfield  label="Alternate-Mobile" name="alternate_mobile"></s:textfield>
	<s:textfield  label="Nationality" name="nationality"></s:textfield>
	<s:textfield  label="Religion" name="religion"></s:textfield>
	<s:textfield  label="Category" name="category"></s:textfield>
	<s:radio      label="Course" name="course" list="{'Dac','WiMc'}" />
	<s:submit value="Save"></s:submit>
	
	</s:form>	
	<s:a href="view_profile"><s:submit value="View Profile"/></s:a>
	
	
	

</body>
</html>


