<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

<form:form  action="processForm" modelAttribute="student">

<form:input type="text" path="firstName" placeholder="First Name"/>
<br>
<form:input type="text" path="lastName" placeholder="Last Name"/>
<br>
<input type="submit"/>

</form:form>

</body>
</html>