<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>

<h2>Instagram Clone</h2>

<form action="${pageContext.request.contextPath}/login">
    <input type="submit" value="Login">
</form>

<br>

<form action="${pageContext.request.contextPath}/signup">
    <input type="submit" value="Sign Up">
</form>

</body>
</html>