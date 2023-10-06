<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오후 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
        }

        td, th {
            border: 1px solid black;
        }

        .active {
            background-color: darkblue;
            color: white;
        }

        .prev {
            display: none;
        }

        .next {
            display: none;
        }
    </style>
</head>
<body>
<h4>고객 목록</h4>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach items="${customerList}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>
</table>
<div>
    <a      <c:if test="${currentPage ge 1 and currentPage le 5}">
            class="prev"
            </c:if>
            href="/main22/sub3?p=${prevPage}"><<</a> |
    <c:forEach begin="${leftPageNumber}" end="${rightPageNumber}" var="number">
        <a
                <c:if test="${number == currentPage}">
                    class="active"
                </c:if>
                href="/main22/sub3?p=${number}">${number}</a> |
    </c:forEach>
    <a      <c:if test="${currentPage ge 16 and currentPage le lastPageNumber}">
            class="next"
            </c:if>
            href="/main22/sub3?p=${nextPage}">>></a>
</div>
</body>
</html>
