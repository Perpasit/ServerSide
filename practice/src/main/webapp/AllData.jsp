<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 28/10/2566
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Student List</title>
</head>
<body>
<h1>
  Student List
</h1>

<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Score</th>
    <th>Grade</th>
  </tr>
  <c:forEach items="${applicationScope.studentContext.all}" var="student">
    <tr>
      <td>${student.id}</td>
      <td>${student.name}</td>
      <td>${student.score}</td>
      <td>${student.getGrade()}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>