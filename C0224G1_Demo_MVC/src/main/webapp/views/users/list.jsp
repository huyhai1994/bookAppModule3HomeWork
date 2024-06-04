<%@ page import="org.codegym.bookapp.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: huyhai1994
  Date: 6/4/24
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%List<User> users = (List<User>) request.getAttribute("users"); %>
<html>
<head>
    <title>UserList</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
  <div class = "container text-center my-3">
    <h2> USER LIST </h2>
    Total: <%= users.size()%>
    <table class = "table">
      <thead class = "table-dark">
        <tr>
          <td>#</td>
          <td>Name</td>
          <td>User Name</td>
        </tr>
      </thead>
      <c:set var = "i" value = "1"/>
      <c:forEach items = "${users}" var = "user">
      <tr>
        <td><c:out value="${i}"/></td>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.username}"/></td>
        <c:set var="i" value ="${i+1}"/>
      </c:forEach>
      </tr>
   </table>
  </div>

</body>
</html>
