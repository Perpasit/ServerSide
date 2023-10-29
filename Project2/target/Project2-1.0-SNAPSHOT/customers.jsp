<%--
  Created by IntelliJ IDEA.
  User: perpasit
  Date: 29/10/2566
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h1>Add Customer</h1>
        <form action="customers", method="post">
            <input type="hidden" name="action" value="addCustomer">
            <label>Name</label>
            <input type="text" name="name"/><br>

            <label>Phone</label>
            <input type="tel" name="phone"/><br>

            <button type="submit">Add</button>

        </form>
    </div>
</body>
</html>
