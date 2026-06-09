<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="InsertionServlet" enctype="multipart/form-data">
		<pre>
			Enter name <input type="text" name="text_name" />
			Select Image <input type="file" name="file_upload" />
			<input type="submit" value="Upload" />
		</pre>
	</form>

</body>
</html>