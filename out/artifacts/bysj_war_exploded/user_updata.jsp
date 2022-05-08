<%@ page import="com.bysj.dto.User" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/21
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员更改信息</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .body{
            margin-top: 50px;
            margin-left: 50px;
            width: 300px;
            height: 300px;
            border: black 2px solid;
            border-radius: 25px;
        }
        .body_box{
            width: 100%;
            height: 50px;
            float: left;
            line-height: 50px;
        }
        .body_box input{
            border: black 2px solid;
        }
    </style>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
%>
<div class="body">
    <form  method="post" action="UpdataUserServlet?userId=<%=user.getUserId()%>" target="usermaintext">
        <div class="body_box"></div>
        <div class="body_box">
            <p>用户名：<input type="text" name="userName" value="<%=user.getUserName()%>"></p>
        </div>
        <div class="body_box">
            <p>密码：<input name="userPwd" type="text" value="<%=user.getUserPwd()%>"></p>
        </div>
        <div class="body_box" style="text-align: center">
            <input type="submit" value="提交" >
        </div>
    </form>
</div>
</body>
</html>
