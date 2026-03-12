<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String[] cities = {"Mumbai","Kolkata","Dehradoon","Noida", "Delhi"};
%>
	<div align="center">
		<form method="post" action="DropdownPage.jsp">
			<table cellpadding="10" cellspacing="10" bgcolor="lightyellow" border="0" width="70%">
				<tr>
					<th colspan="4" >Dropdown Demo</th>
				</tr>
				<tr>
					<td width="25%"></td>
					<td>Select the capital of India?</td>
					<td>
					<select name="cmb_capital">
						<option value="">--select option--</option>
						<!--  
							<option value="Mumbai">Mumbai</option>
							<option value="Mumbai">Mumbai</option>
						 -->
						<%
						for(String value : cities){
						%>
							<option value="<%=value%>"><%=value %></option>
							<%
							}
						%>
					</select>
					<td>
					<td width="25%"></td>
				</tr>
				<tr>
					<td width="25%"></td>
					<td align="center"><input type="submit" value="Post to server"></td>
				</tr>
			
			</table>
		</form>
		
	</div>

</body>
</html>