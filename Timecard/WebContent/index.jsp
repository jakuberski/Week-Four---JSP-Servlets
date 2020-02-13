<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Timecard Homepage</title>
</head>
<body>
<h1>Your timecard!</h1>
<form action ="timecardServlet" method = "post">
<h3> Please enter the hours your worked this week:</h3>
<input type= "text" name="hours" size = "12">
<input type= "submit" value = "Calculate total hours before overtime"/>

</form>

</body>
</html>