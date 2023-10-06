<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오전 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        h4 {
            text-align: center;
        }

        th, td {
            text-align: center;
        }

        table {
            margin: 20px auto;
            width: 40%;
        }

        form {
            position: absolute;
            bottom: 150px;
            left: 35%;
            width: 30%;
            display: flex;
            justify-content: space-evenly;
        }
    </style>
</head>
<body>
<h4>공급자 목록</h4>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach items="${supplierList}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>
</table>
<form action="/main22/sub2">
    <c:forEach begin="1" end="${lastPageNumber}" var="num">
        <input type="submit" name="p" value="${num}">
    </c:forEach>
</form>
</body>
</html>
