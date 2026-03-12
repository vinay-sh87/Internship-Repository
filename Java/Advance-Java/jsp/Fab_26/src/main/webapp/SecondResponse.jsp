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
	String[] receivedValues = request.getParameterValues("chk_states");
	out.println("Selected States");
	for(String state: receivedValues){
		out.println(state);
	}
%>

</body>
</html>