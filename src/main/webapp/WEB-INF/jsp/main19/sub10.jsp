<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-05
  Time: 오전 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>고객 조회</h4>
<form action="/main19/sub11">
    고객 번호
    <input type="text" name="cid" placeholder="id입력">
    <button>조회</button>
</form>
<form action="/main19/sub11">
    도시 이름
    <select name="ccountry" id="">
        <option value="France">France</option>
        <option value="Germany">Germany</option>
        <option value="UK">UK</option>
    </select>
    <button>조회</button>
</form>
</body>
</html>
