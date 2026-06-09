<%@page import="java.io.OutputStream"%>
<%@page import="com.app.dao.EmployeeDao"%>
<%@page import="java.sql.Blob"%>
<%
	int code = Integer.parseInt(request.getParameter("code"));
	Blob image = (new EmployeeDao()).imageData(code);
	byte[] image_in_bits = (byte[]) image.getBytes(1, (int)image.length());
	OutputStream ous = response.getOutputStream();
	response.setContentType("image/jpg");
	ous.write(image_in_bits);
	ous.flush();
	ous.close();
%>