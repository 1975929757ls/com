<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/16
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <table>
        <c:forEach var="info" items="${allInfoList}">
            <tr>
                <td>作&nbsp&nbsp&nbsp者：&nbsp&nbsp${info.author}</td>
            </tr>
            <tr>
                <td>动态内容：&nbsp&nbsp${info.info}</td>
            </tr>
            <tr>
                <td>
                    <a href="click?id=${info.id}"><input type="button" value="点赞" style="color: darkgreen">${info.zan}</a>
                    <a href="likes?id=${info.id}"><input type="button" value="喜欢" style="color: lawngreen">${info.love}</a>
                    <a href="addcommon?id=${info.id}"><input type="button" value="发表评论" style="color: cornflowerblue"></a>
                </td>
            </tr>
            <tr>
                <td style="color: yellow">
                    评&nbsp论&nbsp区:${info.content}
                </td>
            </tr>
            <tr>
                <td>${info.content}</td>
            </tr>
            <tr>
                <td>评论者：${info.name}</td>
            </tr>
        </c:forEach>
    </table>
</table>
</body>
</html>
