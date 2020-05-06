<!--%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%-->
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<link
	type="text/css"
	rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"/>

<title>List Customers</title>
</head>


<body>
<div id="wrapper">
	<div id="header">
		<h2>CRM - Customer Relationship Manager</h2>
		<br/>
	</div>
</div>

<div id="container">
	<div id="content">
			<!-- add our html table -->
			
			<input type="button" value="Add New"
			class="button"
			onclick="window.location.href='showFormAdd'"/>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
				<!-- loop over and print our customers -->
			<c:forEach var="tempCustomer" items="${customers}">
			
			<!-- url for update info -->
	
			<c:url 	var="updateLink" value="/customer/updateForm">
				<c:param name="customerId" value="${tempCustomer.id}"/>
			</c:url>
			
			<!-- url for delte form -->
			<c:url var="deleteLink" value="/customer/deleteForm">
			
			<c:param name="customerId" value="${tempCustomer.id}"></c:param>
			
			</c:url>
	
				<tr>
					<td>${tempCustomer.firstName}</td>
					<td>${tempCustomer.lastName}</td>
					<td>${tempCustomer.email}</td>
					<td><a href="${updateLink}">update|</a></td>
					<td>
					<a href="${deleteLink}">delete</a></td>
				</tr>
						
			</c:forEach>	
		</table>		
		</div>
	</div> 
	
</body>
</html>