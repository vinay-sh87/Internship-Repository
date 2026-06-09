<%@page import="com.app.dao.EmployeeDao"%>
<%@page import="com.app.entity.VisualData"%>
<%@page import="java.util.List"%>

<%
List<VisualData> list = (new EmployeeDao()).allEmployees();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>
	body {
		font-family: Arial, sans-serif;
		background-color: #f4f4f4;
		padding: 20px;
	}

	table {
		width: 80%;
		margin: auto;
		border-collapse: collapse;
		background: white;
		box-shadow: 0 2px 8px rgba(0,0,0,0.1);
	}

	th, td {
		padding: 12px;
		text-align: center;
		border: 1px solid #ddd;
	}

	th {
		background-color: #4CAF50;
		color: white;
	}

	tr:nth-child(even) {
		background-color: #f9f9f9;
	}

	tr:hover {
		background-color: #f1f1f1;
	}

	img {
		border-radius: 8px;
		border: 2px solid #ccc;
		object-fit: cover;
	}
</style>

</head>
<body>

<h2 style="text-align:center;">Employee Details</h2>

<table>
	<tr>
		<th>Code</th>
		<th>Name</th>
		<th>Image</th>
	</tr>

	<%	
	for (int i = 0; i < list.size(); i++) {
	%>
	<tr>
		<td><%=list.get(i).getCode()%></td>
		<td><%=list.get(i).getName()%></td>
		<td>
			<img src="ShowImage.jsp?code=<%=list.get(i).getCode()%>"
				 width="100" height="100" />
		</td>
	</tr>
	<%
	}
	%>
</table>

</body>
</html>