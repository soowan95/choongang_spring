<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>해야할 일</h1>
<form action="/main13/sub8">
    <div>
        <label for="id">ID</label>
        <input type="text" name="id" id="id">
    </div>
    <div>
        <label for="name">Name</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="address">Address</label>
        <input type="text" name="address" id="address">
    </div>
    <div>
        <label for="schedule">Schedule</label>
        <input type="datetime-local" name="schedule" id="schedule">
    </div>
    <div>
        <label for="weight">헬스</label>
        <input type="checkbox" name="todos" id="weight" value="weight">
    </div>
    <div>
        <label for="swim">수영</label>
        <input type="checkbox" name="todos" id="swim" value="swim">
    </div>
    <div>
        <label for="study">공부</label>
        <input type="checkbox" name="todos" id="study" value="study">
    </div>
    <button>submit</button>
</form>
</body>
</html>
