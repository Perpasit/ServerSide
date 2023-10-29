<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: perpasit
  Date: 28/10/2566
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Subject List</title>

</head>
<body>
    <div class="flex-content" style="margin: 50px">
        <div style="background-color: beige;color: darkgoldenrod"><h1>Subject List::</h1><hr></div>
        <div>
            <table>
                <tr>
                    <td>No</td>
                    <td>Subject Code</td>
                    <td>Title</td>
                    <td>Credit</td>
                    <td>Select</td>
                </tr>
               <c:forEach items="${subjects}" var="subject" varStatus="vs"> <%-- items = collection,var = each one item, varStatus check round--%>
                    <tr>
                        <td>${vs.count}</td>
                        <td>${subject.id}</td>
                        <td>${subject.title}</td>
                        <td>${subject.credit}</td>
                        <td><input type="checkbox" value="${subject.id}" name="subjects"> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
