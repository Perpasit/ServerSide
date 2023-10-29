<%--
  Created by IntelliJ IDEA.
  User: perpasit
  Date: 29/10/2566
  Time: 6:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            margin: 12px;
            border: darkcyan solid 1px;
            padding: 0;
            border-spacing: 0px;
        }
    </style>
</head>
<body>
<h3>Multiplication Table of ${param.number}</h3>
<hr>
<c:if test="${message == null}">
    <table>
        <tr>
            <td colspan="5">Multiplication table of ${param.number}</td>
        </tr>

        <c:forEach begin="1" end="24" var="n">
            <c:choose>
                <c:when test="${n%2==0}">
                    <c:set var="bg" scope="page" value="lightgray"/> <%-- tag set is doesnt have body may use /> close tag--%>
                </c:when>
                <c:otherwise>
                    <c:set var="bg" scope="page" value="gray"/> <%-- tag set is doesnt have body may use /> close tag--%>
                </c:otherwise>
            </c:choose>
            <tr style="background-color: ${bg}">
                <td>${param.number}</td>
                <td> x</td>
                <td> ${n} </td>
                <td> =</td>
                <td>${param.number * n}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<c:if test="${message != null}">
    <h4>Error::
        <hr>
            ${requestScope.message} <span style="color: red">(${param.number})</span>
    </h4>
</c:if>
<hr>
<strong>Your browser : </strong>  ${header["User-Agent"]} <%--use [] as . cause name of Header use " - "--%>
</body>
</html>
