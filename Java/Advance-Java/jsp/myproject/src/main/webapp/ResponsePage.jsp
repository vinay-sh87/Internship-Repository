<%
	int value = Integer.parseInt(request.getParameter("varname"));
%>

<%!

public long calculateFactorial(int value){
	long result  = 1;
	for(int i=1;i<=value;i++)
		result *= i;
	return result;
}

%>

The Factorial of <%=value%> is <%=calculateFactorial(value) %>