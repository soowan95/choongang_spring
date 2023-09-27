<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>My visit count ${sessionScope.count}.</h4>
<h4>How many person request to this server? ${applicationScope.count}.</h4>
</body>
</html>
