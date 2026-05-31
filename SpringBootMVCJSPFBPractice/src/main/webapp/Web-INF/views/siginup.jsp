<form action="${pageContext.request.contextPath}/Usersignup" method="post">

    <label>Name:</label>
    <input type="text" name="name" required>

    <br>${msg}<br>

    <label>Gmail:</label>
    <input type="email" name="email" required>

    <br><br>

    <button type="submit">Sign Up</button>

</form>