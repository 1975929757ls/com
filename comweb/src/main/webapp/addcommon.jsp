<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/17
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="sbcommon">
    <input type="hidden" name="id" value="${id}">
    评论：&nbsp&nbsp<input type="text" name="common" ></br>
    作者：&nbsp&nbsp<input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>
