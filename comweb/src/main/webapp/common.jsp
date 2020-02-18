<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/17
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <c:forEach var="common" items="${commonList}">
            </br>
        <tr>
            <td>评论区：&nbsp&nbsp&nbsp${common.content}</td>
        </tr>
            <tr>
                <td>
                    评论者：&nbsp&nbsp&nbsp${common.name}
                </td>
            </tr>
            <tr style="height: 20px"></tr>
        </c:forEach>
    </table>
</div>
<form action="fanhui">
    <input type="submit" value="返回">
</form>
</body>
</html>
