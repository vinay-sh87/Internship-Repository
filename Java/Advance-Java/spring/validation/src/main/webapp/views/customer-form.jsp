<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="customer" action="processForm">
		<pre>
			First Name <form:input path="firstName" />
							<form:errors path="firstName" />
			Last Name <form:input path="lastName" />
							<form:errors path="lastName" />
			Free Passes <form:input path="freepasses" />
							<form:errors path="freepasses" />
			Postal Code <form:input path="postalCode" />
							<form:errors path="postalCode" />
			Email  <form:input path="email" />
							<form:errors path="email" />
							
		</pre>
	</form:form>

</body>
</html>