<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" lang="JavaScript" src="js/prog1.js"></script>
<body>

	<div align="center">
		<table cellpadding="10" cellspacing="0" border="0"
			bgcolor="lightyellow">
			<tr>
				<td>Sign Up Form</td>
			</tr>
			<tr>
				<td width="25%"></td>
				<td><input type="text" placeholder="Enter UserId"
					onkeyup="crossCheckId(this.value)"></td>
				<td width="25%" id="info"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
		</table>
	</div>

</body>
</html>