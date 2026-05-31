<form action="${pageContext.request.contextPath}/Userlogin" method="post">

    <label>Gmail:</label>
    <input type="email" name="email" required>

    
    <br>${msg}<br>

    <label>Name:</label>
    <input type="text" name="name" required>

    <br><br>

    <button type="submit">Login</button>

</form>