<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오전 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>input 요소들</h3>
<form action="/main13/sub2">
    <div>
        <input type="text" name="param1">
    </div>
    <div>
        <input type="password" name="param2">
    </div>
    <div>
        <input type="date" name="param3">
    </div>
    <div>
        <input type="button" name="param4" value="some button">
    </div>
    <div>
        <input type="number" name="param5">
    </div>
    <div>
        <input type="submit" name="param6">
    </div>
    <div>
        <input type="radio" name="param7">
    </div>
    <div>
        <input type="radio" name="param7">
    </div>
    <div>
        <input type="checkbox" name="param9">
    </div>
    <div>
        <input type="checkbox" name="param9">
    </div>
    <div>
        <input type="hidden" name="param10">
    </div>
    <button>submit</button>
</form>

<hr>

<form action="/main13/sub2">
    <div>
        <input type="text" name="param1" value="son">
    </div>
    <div>
        <input type="text" name="param2" placeholder="이름을 입력해주세요.">
    </div>
    <div>
        <input type="text" maxlength="5">
    </div>
    <div>
        <input type="text" required>
    </div>
    <div>
        <input type="text" readonly value="son" name="param3">
    </div>
    <div>
        <input type="text" value="son" disabled name="param4">
    </div>
    <div>
        <input type="text" pattern="\d{3}" name="param5">
    </div>
    <div>
        <input type="checkbox" name="param6" checked>
    </div>
    <div>
        <input type="checkbox" name="param6">
    </div>
    <div>
        <input type="radio" name="param7" checked>
    </div>
    <div>
        <input type="radio" name="param7">
    </div>
    <div>
        <input type="file" multiple>
    </div>
    <button>submit</button>
</form>

<hr>

<form action="/main13/sub1">
    <label for="input1">
        주소
    </label>
    <input type="text" id="input1">
    <br>
    <div>
        <div>
            <label for="check1">Lorem.</label>
            <input type="checkbox" name="" id="check1">
        </div>
        <div>
            <label for="check2">Nulla!</label>
            <input type="checkbox" name="" id="check2">
        </div>
        <div>
            <label for="check3">Officia.</label>
            <input type="checkbox" name="" id="check3">
        </div>
    </div>
    <input type="submit">
</form>
</body>
</html>
