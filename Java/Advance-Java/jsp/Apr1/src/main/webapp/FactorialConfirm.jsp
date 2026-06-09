<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
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

		<%
		int value = Integer.parseInt(request.getParameter("text_value"));
		Vector uv = (Vector) session.getAttribute("uv");
		if (uv.contains(value)) {
			out.println("<font color='red'>Already Exists</font>");
		} else {
			out.println("The factorial of " + value + " is : " + calculateFactorial(value));
			uv.add(value);
		}
		%>
		<%!public long calculateFactorial(int value) {
		long result = 1;
		for (int i = 1; i <= value; i++) {
			result *= i;
		}
		return result;
	}%>
	</div>

</body>
</html>