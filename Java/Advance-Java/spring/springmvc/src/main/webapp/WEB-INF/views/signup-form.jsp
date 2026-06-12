<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>

<head>
<%@page isELIgnored="false"%>
</head>
<body>
	<form:form method="post" action="saveUser" modelAttribute="user">
		<pre>
			Enter Name: <form:input path="firstName"/>
			Enter Last Name: <form:input path="lastName"/>
			Enter Email: <form:input path="email"/>
			Username: <form:input path="username"/>
			Password: <form:input path="password"/>
			<form:button>Submit</form:button>			
		</pre>
		
	</form:form>
	
</body>
</html>