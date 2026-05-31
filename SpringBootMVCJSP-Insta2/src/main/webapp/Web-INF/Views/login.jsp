<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<h2>Login</h2>

<h3>${msg}</h3>

<form action="${pageContext.request.contextPath}/loginUser" method="post">

    Email:
    <input type="email" name="uemail">

    <br><br>

    Password:
    <input type="password" name="upwd">

    <br><br>

    <input type="submit" value="Login">

</form>

</body>
</html>