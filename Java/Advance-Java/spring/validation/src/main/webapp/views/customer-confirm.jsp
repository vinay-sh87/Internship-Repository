<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	The customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br><br> Free Passes : ${customer.freepasses}
	<br><br> Email : ${customer.email}
	<br><br> Postal Code : ${customer.postalCode}

</body>
</html>