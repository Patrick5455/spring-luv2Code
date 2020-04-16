<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Page</title>

<style>
	.error {color:red}
</style>

</head>

<body>

<form:form action="processForm" modelAttribute="customer">
<br>
First Name: <form:input type="text" path="firstName"/>
<br>
Last Name (*): <form:input type="text" path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br>
Free Passes: <form:input path="freePasses"/>
<form:errors  path="freePasses" cssClass="error"/>
<br>
Postal Code<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br>
<input type="submit" value="Submit"/>
</form:form>


</body>
</html>