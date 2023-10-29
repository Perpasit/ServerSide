<%--
  Created by IntelliJ IDEA.
  User: perpasit
  Date: 29/10/2566
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Your Theme</title>
</head>
<body style="background-color: ${bg_color}">
<div style="margin-left: 150px">
    <h3>Select your theme</h3>
    <form action="set-theme" method="post">
        <input type="radio" name="bg" value="silver">
        Silver <label style="background-color: silver"></label><br>

        <input type="radio" name="bg" value="gray">
        Gray <label style="background-color: gray"></label><br>

        <input type="radio" name="bg" value="lightgoldenrodyellow">
        lightgoldenrodyellow <label style="background-color: lightgoldenrodyellow"></label><br>

        <input type="radio" name="bg" value="aqua">
        aqua <label style="background-color: aqua"></label><br>

        <hr>
        <input type="submit" value="OK">
    </form>
    <a href="index.jsp"><button>Done</button></a>

</div>
</body>
</html>
