<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 


<html>

<head>
<title>Customer-Form</title>
</head>


<body>
	<h2>Customer Form</h2>

	<form:form action="saveForm" modelAttribute="customer" method="POST">
		<form:hidden path="id"/>
		<table>
			<tbody>
			
				<tr>
					<td><label>First Name:</label></td>
					<td>
					<form:input path="firstName"/>
					</td>
				</tr>	
				
				<tr>
					<td><label>Last Name:</label> </td>
					<td>
					<form:input path="lastName"/>
					</td>
				</tr>
				
				<tr>
					<td><label>Email:</label> </td>
					<td>
					<form:input path="email"/>
					</td>
				</tr>
			
			</tbody>
		</table>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>

