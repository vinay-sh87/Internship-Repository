<%@page import="com.app.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Record</title>
</head>
<body>

<%
    String name = request.getParameter("text_name");
    String sal = request.getParameter("text_salary");

    double salary = Double.parseDouble(sal);

    EmployeeDao dao = new EmployeeDao();

    int result = dao.insertEmployee(name, salary);

    if(result > 0)
    {
        out.println("<h3>Record Inserted Successfully</h3>");
    }
    else
    {
        out.println("<h3>Insertion Failed</h3>");
    }
%>

</body>
</html>