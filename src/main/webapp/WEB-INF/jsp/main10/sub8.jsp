<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>el 비교 연산자</h1>
<p><, >, <=, >=, ==, !=</p>
<p>lt, gt, le, ge, eq, ne</p>
<hr>
<p>${a} < ${b} = ${a < b}</p>
<p>${a} < ${b} = ${a lt b}</p>
<hr>
<p>${c} == ${d} = ${c eq d}</p>
<hr>
<p>${e} > ${f} = ${e gt f}</p>
<p>${e} > ${g} = ${e gt g}</p>
<hr>
<h1>el 논리 연산자</h1>
<h3>&& (and), || (or)</h3>
<h3>&&</h3>
<p>\${true && true} : ${true && true}</p>
<p>\${true && false} : ${true && false}</p>
<hr>
<h3>! (not)</h3>
<p>\${! true} : ${! ture}</p>
<p>\${! false} : ${! false}</p>
<p>\${not true} : ${not true}</p>
<p>\${not false} : ${not false}</p>
</body>
</html>
