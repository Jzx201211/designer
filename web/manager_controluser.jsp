<%@ page import="java.util.List" %>
<%@ page import="com.bysj.service.UserService" %>
<%@ page import="com.bysj.dto.User" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/21
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户管理</title>
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
    </style>
</head>
<body>
<%
    UserService userService = new UserService();
    List<User> userList = userService.userList();
%>
<div class="body">
    <div class="body_line">
        <div class="body_line_box">用户名称</div>
        <div class="body_line_box">用户密码</div>
        <div class="body_line_box">用户状态</div>
        <div class="body_line_box">操作1</div>
        <div class="body_line_box">操作2</div>
    </div>

    <%
        for(int i =0 ;i<userList.size();i++){
            User user = userList.get(i);
    %>
    <div class="body_line">
        <div class="body_line_box"><%=user.getUserName()%></div>
        <div class="body_line_box"><%=user.getUserPwd()%></div>
        <%
            String state = "";
            if(user.getUserState()==1){
                state = "禁止抽签";
            } else {
                state="正常抽签";
            }
        %>
        <div class="body_line_box"><%=state%></div>
        <div class="body_line_box">
            <a href="BanUserServlet?userId=<%=user.getUserId()%>">禁止抽签权限</a>
        </div>
        <div class="body_line_box">
            <a href="ReNewUserServlet?userId=<%=user.getUserId()%>">恢复抽签权限</a>
        </div>
    </div>
    <%
        }
    %>
</div>
</body>
</html>
