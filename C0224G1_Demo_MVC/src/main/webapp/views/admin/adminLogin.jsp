<%--
  Created by IntelliJ IDEA.
  User: huyhai1994
  Date: 6/4/24
  Time: 5:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<h2>Login page</h2>
<form action="/admin/login" method="post">
    <label>username:
        <input type="text" name="username"/>
    </label>
    pass: <input name="password" type="password">
    <button type="submit">Login</button>
</form>
</body>
</html>
