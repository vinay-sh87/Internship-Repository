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
	String[] values = request.getParameterValues("lb_winter");
	out.println("Selected months are: ");
	for(String value : values){
		out.print(value + " ");
	}
%>


</body>
</html>