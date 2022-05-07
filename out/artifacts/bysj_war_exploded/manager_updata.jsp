<%@ page import="com.bysj.dto.Manager" %><%--
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
        Manager manager = (Manager) session.getAttribute("manager");
    %>
    <div class="body">
        <form  method="post" action="UpdataManagerServlet" target="maintext">
            <div class="body_box"></div>
            <div class="body_box">
                <p>管理员登录名：<input type="text" name="loginName" value="<%=manager.getLoginName()%>"></p>
            </div>
            <div class="body_box">
                <p>管理员密码：<input name="loginPwd" type="text" value="<%=manager.getLoginPwd()%>"></p>
            </div>
            <div class="body_box">
                <p>管理员姓名：<input name="mgrName" type="text" value="<%=manager.getMgrName()%>"></p>
            </div>
            <div class="body_box">
                <p>管理员性别：<input name="mgrGender" type="text" value="<%=manager.getMgrGender()%>"></p>
            </div>
            <div class="body_box" style="text-align: center">
                <input type="submit" value="提交" >
            </div>
        </form>
    </div>
</body>
</html>
