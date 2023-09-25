<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 80%;
            margin: 10px auto;
            border: 1px solid black;
        }
        tr {
            height: 50px; line-height: 50px;
            text-align: center;
        }
        .title > th {
            border-bottom: 1px solid red;
            font-size: 2rem;
        }
    </style>
</head>
<body>
<c:choose>
    <%--/main11/sub7?show=true--%>
    <%--table 형식의 데이터 출력--%>
    <c:when test="${not empty table}">
        <table>
            <tr class="title">
                <th>id</th>
                <th>firstName</th>
                <th>lastName</th>
                <th>className</th>
                <th>phoneNumber</th>
            </tr>
            <c:forEach items="${table}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.firstName}</td>
                    <td>${item.lastName}</td>
                    <td>${item.className}</td>
                    <td>${item.phoneNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <%--/main11/sub7--%>
    <%--정보를 입력해주세요.--%>
    <c:otherwise>
        <h1>정보를 입력해주세요.</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
