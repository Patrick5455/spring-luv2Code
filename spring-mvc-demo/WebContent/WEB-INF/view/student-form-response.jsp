<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
   
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form Response</title>
</head>

Welcome: ${student.firstName} ${student.lastName}
<br>
Country: ${student.country}
<br>
Favorite Programming Language: ${student.favoriteLanguage}

<br>
Operating Systems:

<ul>
	<c:forEach var="temp" items="${student.operatingSystems}" >
		<li>${temp}</li>
		</c:forEach>
</ul>


<body>

</body>
</html>