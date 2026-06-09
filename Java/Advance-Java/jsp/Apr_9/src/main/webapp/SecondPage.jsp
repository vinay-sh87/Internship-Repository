5
<%@page info="information about the" %>
<%@page extends="com.app.MyServlet" %>


<jsp:useBean id="obj" class="com.app.HelloBean" scope="application" />
Hello... <jsp:getProperty property="message" name="obj"/>
