<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>고른 음식들</h1>
<c:forEach items="${food}" var="item" varStatus="status">
    <p>${status.count}. ${item}</p>
</c:forEach>
<a href="/main15/sub9">다른 페이지로 이동</a>
</body>
</html>
