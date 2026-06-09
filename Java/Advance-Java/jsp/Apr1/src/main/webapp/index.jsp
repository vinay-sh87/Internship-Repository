<html>
<body>

	<%
	out.println("The sessionid is : " + session.getId());
	session.setAttribute("Teacher", "Teacher Name");
	%>
	<hr>
	<a href="SecondPage.jsp">Jump to the second page</a>
</body>
</html>
