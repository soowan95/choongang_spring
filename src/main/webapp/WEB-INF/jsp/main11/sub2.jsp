<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
localhost:8080/main11/sub2?dan=2
구구단 2단 출력

localhost:8080/main11/sub2?dan=2
구구단 3단 출력
--%>
<c:if test="${(param.dan ge 2) and (param.dan le 9)}" var="okDan">
    <h1>구구단 ${param.dan}단</h1>
    <c:forEach begin="1" end="9" var="i">
        <p>${param.dan} X ${i} = ${param.dan * i}</p>
    </c:forEach>
</c:if>
<c:if test="${not okDan}">
    <h1>구구단의 수를 2~9 사이의 값으로 입력해주세요</h1>
</c:if>
</body>
</html>
