<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/16
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>个人主页</title>
</head>
<body>
<h1 style="text-align: center">个人主页</h1>
<table>
    <c:forEach var="info" items="${informationList}">
        <tr>
            <td>动态内容：&nbsp&nbsp&nbsp${info.info}</td>
        </tr>
        <tr>
            <td>作者：&nbsp&nbsp&nbsp${info.author}</td>
        </tr>
        <tr>
            <td>点赞数：&nbsp&nbsp&nbsp${info.zan}&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp感兴趣数：${info.love}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
