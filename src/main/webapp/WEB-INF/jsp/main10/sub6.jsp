<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 100%; height: 500px;
            text-align: center;
            border: 1px solid black;
        }
        tr {
            width: 100%; height: 80px;
            margin: 10px auto;
        }
        td {
            width: 20%;
            border: 1px solid red;
        }
        .title {
            height: 120px;
            font-size: 2rem;
            font-weight: bolder;
        }
    </style>
</head>
<body>
<table>
    <tr class="title">
        <td>id</td>
        <td>firstName</td>
        <td>lastName</td>
        <td>className</td>
        <td>phoneNumber</td>
    </tr>
    <c:forEach items="${table}" var="t" varStatus="status">
        <tr>
            <td>${t.id}</td>
            <td>${t.firstName}</td>
            <td>${t.lastName}</td>
            <td>${t.className}</td>
            <td>${t.phoneNumber}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
