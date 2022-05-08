<%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/22
  Time: 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更据品牌查询商品页面</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        a{
            text-decoration: none;
        }
        .content{
            width: 200px;
            height: 300px;
            float: left;
            margin-top: 70px;
            margin-left: 50px;
        }
        .content_img{
            width: 200px;
            height: 200px;
            float: left;
        }
        .content_img img{
            height: 100%;
            width: 100%;
        }
        .center_text{
            width: 200px;
            height: 100px;
            float: left;
        }
        .center_text_box{
            width: 200px;
            height: 50px;
            float: left;
            text-align: center;
        }
    </style>
</head>
<body>
    <c:forEach items="${goodList}" var="good">
        <a href="UserSelectGoodByGoodIdServlet?goodId=${good.goodId}" class="content">
            <div class="content_img">
                <img src="${good.goodImg}">
            </div>
            <div class="center_text">
                <div class="center_text_box">${good.goodName}</div>
                <c:if test="${good.goodState==0}">
                    <div class="center_text_box">未开始抽签</div>
                </c:if>
                <c:if test="${good.goodState==1}">
                    <div class="center_text_box">开始抽签</div>
                </c:if>
                <c:if test="${good.goodState==2}">
                    <div class="center_text_box">已结束抽签</div>
                </c:if>
            </div>
        </a>
    </c:forEach>
    <%--${goodList}--%>
</body>
</html>
