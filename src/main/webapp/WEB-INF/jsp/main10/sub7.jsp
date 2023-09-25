<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>el에서 사용할 수 있는 연산자</h1>
<h3>산술 연산자</h3>
<h3>+, -,*, /, %</h3>
<hr>
<h3>+ : 더하기</h3>
<p>${a} + ${b} = ${a + b}</p>
<p>${c} + ${d} = ${c + d}</p>
<h3>- : 빼기</h3>
<p>${a} - ${b} = ${a - b}</p>
<p>${c} - ${d} = ${c - d}</p>
<h3>* : 곱하기</h3>
<p>${a} * ${b} = ${a * b}</p>
<p>${c} * ${d} = ${c * d}</p>
<h3>/ : 나누기</h3>
<p>${a} / ${b} = ${a / b}</p>
<p>${c} / ${d} = ${c / d}</p>
<h3>% : 나머지 연산 (modulo)</h3>
<p>${b} % ${a} = ${b % a}</p>
<p>${d} % ${c} = ${d % c}</p>
<hr>
<h3>구구단 2단</h3>
<c:forEach begin="1" end="9" var="i">
    <p>2 X ${i} = ${2 * i}</p>
</c:forEach>
<h3>구구단 2단 ~ 9단</h3>
<c:forEach begin="2" end="9" var="i">
    <c:forEach begin="1" end="9" var="j">
        <p>${i} X ${j} = ${i * j}</p>
    </c:forEach>
</c:forEach>
<h3>구구단 9단 ~ 2단</h3>
<c:forEach items="${e}" var="i">
    <c:forEach begin="1" end="9" var="j">
        <p>${i} X ${j} = ${i * j}</p>
    </c:forEach>
</c:forEach>
</body>
</html>
