<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/15
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: url("img/3.png");
            background-repeat: no-repeat;
            background-size: 100%;
        }
    </style>
</head>
<body>
<table>
<c:forEach var="info" items="${informationList}">
    <tr style="height: 20px"></tr>
    <tr>
        <td style="color: deepskyblue">作&nbsp&nbsp&nbsp者：&nbsp&nbsp${info.author}</td>
    </tr>
    <tr>
        <td>动态内容：&nbsp&nbsp${info.info}</td>
    </tr>
    <tr>
        <td>
            <a href="click?id=${info.id}"><input type="button" value="点赞" style="color: darkgreen;">${info.zan}</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <a href="likes?id=${info.id}"><input type="button" value="喜欢" style="color: lawngreen">${info.love}</a></br>
            </br>
            <a href="see?id=${info.id}"><input type="button" value="查看评论" style="color: cornflowerblue"></a>&nbsp&nbsp
            <a href="addcommon?id=${info.id}"><input type="button" value="发表评论" style="color: cornflowerblue"></a>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
