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
	String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
%>
	<form method="post" action="ListResponse.jsp">
		<pre>
			Select the months of the winter
			<select multiple="true" size="5" name="lb_winter">
				<%
					for(String value : months){
				%>
					<option value="<%=value %>"><%=value %></option>
				<%
					}
				%>
			</select>
			<input type="submit" value="Post to server">
		</pre>
	</form>

</body>
</html>