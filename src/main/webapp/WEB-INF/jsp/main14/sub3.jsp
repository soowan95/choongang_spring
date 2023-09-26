<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main14/sub4", method="post">
  <div>
    <label for="input1">제목</label>
    <input type="text" id="input1" name="title">
  </div>
  <div>
    <label for="textarea1">내용</label>
    <textarea name="content" id="textarea1" cols="30" rows="10"></textarea>
  </div>
  <button>submit</button>
</form>
</body>
</html>
