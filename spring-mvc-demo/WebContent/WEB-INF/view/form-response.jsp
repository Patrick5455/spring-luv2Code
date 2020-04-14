<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Response</title>
</head>

<body>

Response
<br>
<!-- This is how to read HTML form data in jsp use param."name of form field"  -->
Welcome : ${param.studentName}

<br>

<!-- view page can access model attribute directly from the controller using the attribute name. in this case "message" -->
Message: ${message}
</body>
</html>