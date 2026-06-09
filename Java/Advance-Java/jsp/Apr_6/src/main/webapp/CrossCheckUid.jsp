<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
String uid = request.getParameter("uid");
Connection cn = (Connection) application.getAttribute("CONN");
PreparedStatement ps = cn.prepareStatement("select * from login where userid = ?");
ps.setString(1, uid);
ResultSet rs = ps.executeQuery();

if (rs.next()) {
	out.println("<font color='red'>Already Exists</font>");
}
%>