<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/14
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<tr>
    <td>作者：</td>
    <td>内容：</td>
</tr>
    <c:forEach var="info" items="${infolist}">
        <td>${info.author}</td>
        <td>${info.info}</td>
    </c:forEach>
</table>
</body>
</html>
