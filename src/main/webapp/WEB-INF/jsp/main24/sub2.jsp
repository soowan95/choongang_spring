<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-10
  Time: 오후 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>정보 입력</h4>
<form method="post">
    제공자  <input type="text" name="sname">
    <br>
    계약명  <input type="text" name="cname">
    <br>
    주소    <input type="text" name="address">
    <br>
    도시    <input type="text" name="city">
    <br>
    우편번호 <input type="text" name="pc">
    <br>
    나라    <input type="text" name="country">
    <br>
    전화번호 <input type="text" name="phone">
    <br>
    <button>저장</button>
</form>
</body>
</html>
