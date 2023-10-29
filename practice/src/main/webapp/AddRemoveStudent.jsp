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
    <title>Add Remove</title>
</head>
<body>
<h1>
    Add
</h1>



<form action="add" method="post">
    Student ID: <input type="text" name="id"><br>
    Name: <input type="text" name="name"><br>
    Score: <input type="text" name="score"><br> <br>
    <input type="submit" value="Add Student">
</form>
<hr>
<h1>
    Remove
</h1>
<%-- Remove Student Form --%>
<form action="remove" method="post">
    Student ID to Remove: <input type="text" name="id"><br> <br>
    <input type="submit" value="Remove Student">
</form>



<c:forEach items="${applicationScope.studentContext.all}" var="student">
    <p>
            ${student.id} ${student.name} ${student.grade}
    </p>
</c:forEach>

<c:if test="${message != null}">
    <p>
            ${message}
    </p>
</c:if>

</body>
</html>