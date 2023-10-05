<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-05
  Time: 오후 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        h1 {
            text-align: center;
        }
        table {
            margin: 0 auto;
            width: 50%;
        }
        th {
            font-size: 2rem;
        }
        th, td {
            border: 1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>상품목록</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach items="${productList}" var="item">
        <tr>
            <td>${item.pid}</td>
            <td>${item.productName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
