
<%@page import="java.util.Vector"%>
<%
	Vector usedValues = new Vector();
	session.setAttribute("uv", usedValues);

%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center" >
		<form method="post" action="FactorialConfirm.jsp">
			<table>
				<tr>
					<th>Factorial Form</th>
				</tr>
				<tr>
					<td><input type="text" name="text_value" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Factorial"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>