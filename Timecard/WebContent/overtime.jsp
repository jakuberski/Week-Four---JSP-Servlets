<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="overtimeServlet" method = "post">

	<h2>Your worked:</h2>

	<p>${employee.getHours()}
		<br />
	<h1>Enter your bonus amount below:</h1>

	<input type="text" name="bonus" size="12">
	<input type="submit" value="Submit" />

	<input type="hidden" value="${employee.getHours()}" name="hours" />
</form>
</body>
</html>