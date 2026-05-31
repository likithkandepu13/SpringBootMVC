<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
</head>
<body>

<h2>Sign Up</h2>

<h3>${msg}</h3>

<form action="${pageContext.request.contextPath}/registerUser" method="post">

    Email:
    <input type="email" name="uemail">

    <br><br>

    Password:
    <input type="password" name="upwd">

    <br><br>

    <input type="submit" value="Sign Up">

</form>

</body>
</html>