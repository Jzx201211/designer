<%@ page import="com.bysj.dto.Manager" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/20
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员个人中心</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            border: 0;
        }
        .body{
            width: 98%;
            padding-left: 2%;
            padding-top: 2%;
            height: 98%;
        }
        .body_line{
            width: 100%;
            height: 50px;
            float: left;
        }
        .body_line_box{
            overflow: hidden;
            width: 150px;
            height: 50px;
            line-height: 50px;
            text-align: center;
            float: left;
        }
        .body_line_box a{
            text-decoration: none;
            color: black;
        }
        .body_line_box a:hover{
            color: red;
        }
        .buttom{
            margin-top: 30px;
            margin-left: 50px;
            float: left;
            height: 50px;
            width: 120px;
            text-align: center;
            border: black 2px solid;
            border-radius: 25px;
            line-height: 50px;
            font-size: 25px;
        }
        .buttom a{
            text-decoration: none;
        }
        .buttom:hover{
            background: red;
        }
    </style>
</head>
<body>
<%
    Manager manager = (Manager) session.getAttribute("manager");
%>
<div class="body">
    <div class="body_line">
        <div class="body_line_box">管理员登录名</div>
        <div class="body_line_box">管理员登录密码</div>
        <div class="body_line_box">账号创建时间</div>
        <div class="body_line_box">管理员姓名</div>
        <div class="body_line_box">管理员性别</div>
    </div>
    <div class="body_line">
        <div class="body_line_box"><%=manager.getLoginName()%></div>
        <div class="body_line_box"><%=manager.getLoginPwd()%></div>
        <div class="body_line_box"><%=manager.getCreateTime()%></div>
        <div class="body_line_box"><%=manager.getMgrName()%></div>
        <div class="body_line_box"><%=manager.getMgrGender()%></div>
    </div>
    <div class="buttom">
        <a href="manager_updata.jsp" target="maintext">更改信息</a>
    </div>
</div>
</body>
</html>
