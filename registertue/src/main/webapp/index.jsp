<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body style="margin-left: 100px; background-color: ${bg_color}">
    Session Id: ${cookie.JSESSIONID.value}<br>
    <h2>Menu</h2><hr>
    <a href="course-list">ลงทะเบียน</a><br>
    <a href="course-registered-history">ประวัติลงทะเบียน</a><br>
    ----------------------------<br>
    <a href="set-theme">Select Your Theme</a><br>
    ----------------------------<br>
    <a href="">Logout</a>
</body>
</html>