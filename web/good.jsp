<%@ page import="com.bysj.dto.User" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/22
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品详情页面</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .left{
            width: 30%;
            height: 100%;
            float: left;
        }
        .left img{
            height: 100%;
            width: 100%;
        }
        .right{
            width: 30%;
            height: 100%;
            float: left;
        }
        .right_name{
            width: 100%;
            height: 100px;
            font-size: 40px;
            float: left;
            text-align: center;
        }
        .right_desc{
            width: 100%;
            height: 200px;
            font-size: 20px;
            float: left;
            text-align: center;
        }
        .right_price{
            width: 100%;
            height: 50px;
            font-size: 30px;
            float: left;
            text-align: center;
        }
        .right_chouqian{
            margin-left: 170px;
            margin-top: 20px;
            width: 100px;
            height: 50px;
            line-height: 50px;
            float: left;
            text-decoration: none;
            border: black 2px solid;
            border-radius: 25px;
            text-align: center;
        }
        .right_chouqian:hover{
            background: red;
        }
    </style>
</head>
<body>
    <%
        User user = (User) session.getAttribute("user");
    %>
    <div class="left">
        <img src="${good.goodImg}">
    </div>
    <div class="right">
        <div class="right_name">${good.goodName}</div>
        <div class="right_desc">${good.goodDesc}</div>
        <div class="right_price">${good.goodPrice}</div>
        <%
            if(user.getUserState()==1){
        %>
        <c:if test="${good.goodState==1}">
            <a href="cq.jsp?goodName=${good.goodName}" class="right_chouqian">参与抽签</a>
        </c:if>
        <%
            }
        %>
    </div>
</body>
</html>
