<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Registration Page</title>

<style>
	.error {color:red}
</style>

</head>

<body>

<form:form action="processForm" modelAttribute="patient">
<br>
 Name * : <form:input type="text" path="name"/>
 <form:errors path="name" cssClass="error"/>
 
<br>
Disease Name: <form:input type="text" path="diseaseName"/>
<br>
<input type="submit" value="Submit"/>

</form:form>

</body>
</html>