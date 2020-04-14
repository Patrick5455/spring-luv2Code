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

<form:select  path="country">
<form:options items="${student.countryList }"/>

<!-- 
<form:option value="BR" label="Brazil"/>
<form:option value="DE" label="Germany"/>
<form:option value="US" label="USA"/>
<form:option value="FR" label="French"/>
<form:option value="ES" label="Spanish"/>
 -->
 
</form:select>

<br>
<input type="submit"/>

</form:form>

</body>
</html>