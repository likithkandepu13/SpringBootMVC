<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facebook</title>
</head>
<body>

<h2>Facebook Here</h2>

<form action="${pageContext.request.contextPath}/login" method="get">
    <button type="submit">Login</button>
</form>

<br>

<form action="${pageContext.request.contextPath}/signup" method="get">
    <button type="submit">Sign Up</button>
</form>

</body>
</html>