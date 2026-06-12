<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

<head>
<%@page isELIgnored="false"%>
</head>
<body>
	Hello...<h3>${user.firstName}</h3>	
	<hr>
	Your Name is <h3>${user.lastName}</h3>
	<hr>
	Email is <h3>${user.email}</h3>
	<hr>
	Password is <h3>${user.password}</h3>
</body>
</html>