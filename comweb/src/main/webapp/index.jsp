<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background: url("img/3.png");
            background-repeat: no-repeat;
            background-size: 100%;
        }
        h1{
            color: chartreuse;
        }
        div{
            size: 25px;
            position: center;
        }
    </style>
</head>
<body >
<<h1 align="center" style="font-size: 100px" >趣味社交区</h1>
<div style="float: right">
    <form action="user/singin">
        用户名<input name="name" /></br>
        </br>
        密&nbsp&nbsp&nbsp码<input type="password" name="password"/></br>
        </br>
        <input type="submit" value="登录" style="size: 100px " />
        <input type="reset" value="重置">
        <a href="user/register"><input type="button" value="注册"></a>

    </form>
</div>


</body>
</html>
