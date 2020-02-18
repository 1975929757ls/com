<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 19759
  Date: 2020/2/6
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页</title>
    <style>
        .container{
            width: 100%;
            margin: 0px auto;
            background-image: url("/img/2.jpg");
        }
        .top{
            width: 100%;
            height: 20%;
            background-color: aqua
        }
        .left{
            float: left;
            width: 30%;
            height: 80%;
            background: khaki;
        }
        .right{
            float: right;
            width: 70%;
            height: 80%;
            background: chartreuse;
        }
        /*#h{*/
            /*color: chartreuse;*/
            /*size: 70px;*/
            /*text-align: center;*/
        /*}*/
    </style>
</head>
<body>
<div class="container">
    <div class="top">
        <h1 style="color: chartreuse;font-size: 50px;text-align: center">社交网络平台主页</h1>
    </div>
    <div class="left">
        <a href="fabu"><input type="button" value="动态发布"></a></br>
        </br>
        <a href="own?id=${user.id}"><input type="button" value="查看个人主页"></a></br>
        </br>
        <div>
            <table>
                <tr>
                    <td>搜索</td>
                </tr>
                <tr>
                    <form action="authorsearch">
                        <td>
                            <input type="text" name="author">
                            <input type="submit" value="作者搜索">
                    </form>
                    </td>
                </tr>
                <tr>
                    <form action="searchByinfo">
                        <td>
                            <input type="text" name="info">
                            <input type="submit" value="内容搜索">
                    </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form action="sd">
                            <input type="submit" value="查看动态">
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form action="all">
                            <input type="submit" value="查看全部">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div class="right">
        <h1 style="color: deepskyblue; text-align: center">热点动态</h1>
        <table>
            <c:forEach var="info" items="${informationList}">
                <tr>
                    <td>作&nbsp&nbsp&nbsp者：&nbsp&nbsp${info.author}</td>
                </tr>
                <tr>
                    <td>动态内容：&nbsp&nbsp${info.info}</td>
                    <td><a><input type="button" value="点赞" style="color: darkgreen">${info.zan}</a>
                        <a><input type="button" value="喜欢" style="color: lawngreen">${info.love}</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
