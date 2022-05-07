<%@ page import="com.bysj.service.GoodService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.bysj.dto.Good" %><%--
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
    <title>抽签管理</title>
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
        GoodService goodService = new GoodService();
        List<Good> goodList = goodService.goodList();
    %>
    <div class="body">
        <div class="body_line">
            <div class="body_line_box">商品名称</div>
            <div class="body_line_box">商品介绍</div>
            <div class="body_line_box">商品价格</div>
            <div class="body_line_box">商品图片</div>
            <div class="body_line_box">商品状态</div>
            <div class="body_line_box">商品库存</div>
            <div class="body_line_box">操作1</div>
            <div class="body_line_box">操作2</div>
        </div>

            <%
                for(int i =0 ;i<goodList.size();i++){
                    Good good = goodList.get(i);
            %>
            <div class="body_line">
                <div class="body_line_box"><%=good.getGoodName()%></div>
                <div class="body_line_box"><%=good.getGoodDesc()%></div>
                <div class="body_line_box"><%=good.getGoodPrice()%></div>
                <img class="body_line_box" src="<%=good.getGoodImg()%>">
                <%
                    String state = "";
                    if(good.getGoodState()==0){
                        state = "未开启抽签";
                    }else if(good.getGoodState()==1){
                        state = "正在抽签";
                    }else {
                        state="抽签已结束";
                    }
                %>
                <div class="body_line_box"><%=state%></div>
                <div class="body_line_box"><%=good.getGoodStock()%></div>
                <div class="body_line_box">
                    <a href="ActionCQServlet?goodId=<%=good.getGoodId()%>">开始抽签</a>
                </div>
                <div class="body_line_box">
                    <a href="EndCQServlet?goodId=<%=good.getGoodId()%>">结束抽签</a>
                </div>
            </div>
        <%
            }
        %>
    </div>
</body>
</html>
