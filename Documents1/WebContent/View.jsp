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


	<table border="1" align="center" style="bordercolor:1px solid green background:green">
 <caption>Student Profile</caption>
		<tr>
		<td>Batch_ID</td>
			<td>Student_ID</td>	
				<td>HSC Marksheet</td>
					<td>SSC Marksheet</td>
						<td>Graduation Marksheet</td>
							<td>Marksheet</td>
		</tr>	
		<tr>				
			<td><s:property value="Batch_ID"/></td>
			<td><s:property value="Student_ID"/></td>
			<td><s:property value="Doc1"/></td>
			<td><s:property value="Doc2"/></td>
			<td><s:property value="Doc3"/></td>
			<td><s:property value="Doc4"/></td>
		</tr>
					
</table>
</body>
</html>