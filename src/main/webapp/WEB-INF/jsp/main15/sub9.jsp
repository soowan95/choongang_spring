<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>여전히 고른 음식들</h1>
<c:forEach items="${food}" var="item" varStatus="status">
    <p>${status.count}. ${item}</p>
</c:forEach>
<a href="/main15/sub7">다시 고르기</a>
</body>
</html>
