<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String receivedValue = request.getParameter("rdb_capital");
	out.println("The received value is:: "+receivedValue);
	%>
</body>
</html>