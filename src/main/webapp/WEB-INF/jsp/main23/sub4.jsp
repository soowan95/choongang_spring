<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-10
  Time: 오전 11:14
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
        table, th, td {
            border: 1px solid black;
        }
        th {
            background-color: aquamarine;
        }
    </style>
</head>
<body>
<h4>직원 조회</h4>
<form>
    <div>
        검색 조건
        <select name="t" id="">
            <option value="lname" ${option == 'lname' ? 'selected' : ''}>Last Name</option>
            <option value="fname" ${option == 'fname' ? 'selected' : ''}>First Name</option>
            <option value="note"  ${option == 'note' ? 'selected' : ''}>Notes</option>
        </select>
    </div>
    <div>
        검색어
        <input type="text" name="k" value="${keyword}">
    </div>
    <div>
        <button>조회</button>
    </div>
</form>

<hr>

<table>
    <tr>
        <th>lastName</th>
        <th>firstName</th>
        <th>notes</th>
    </tr>
    <c:forEach items="${someList}" var="item">
        <tr>
            <td>${item.lastName}</td>
            <td>${item.firstName}</td>
            <td>${item.note}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
