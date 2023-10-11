<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-11
  Time: 오전 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>직원 정보 변경</h3>
<form action="/main25/sub5">
    변경할 직원 번호
    <input type="text" name="id">
    <button>조회</button>
</form>

<hr>

<form action="/main25/sub5" method="post">
    <div>
        직원 번호
        <input type="number" name="id" value="${employee.employeeId}" readonly>
    </div>
    <div>
        성
        <input type="text" name="lastName" value="${employee.lastName}">
    </div>
    <div>
        이름
        <input type="text" name="firstName" value="${employee.firstName}">
    </div>
    <div>
        생일
        <input type="date" name="birthDate" value="${employee.birthDate}">
    </div>
    <div>
        사진
        <input type="text" name="photo" value="${employee.photo}">
    </div>
    <div>
        정보
        <textarea name="notes" id="" cols="30" rows="10">${employee.notes}</textarea>
    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>
</body>
</html>
