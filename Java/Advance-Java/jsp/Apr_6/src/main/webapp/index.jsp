<html>
<body>
	<form method="post" action="ValidateLogin.jsp">
	
		<pre>
			Enter UserId <input type="text" name="txt_uid">
			Enter Password <input type="password" name="txt_pass">
			
			<input type="submit" value="login">
		</pre>
	
	</form>
	<%
		out.println("The company name :: "+config.getInitParameter("Company"));
	%>
</body>
</html>