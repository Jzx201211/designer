<%@ page import="com.bysj.dto.Manager" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/20
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员首页</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .navbar{
            height: 50px;
            width: 96%;
            float: left;
            padding: 12.5px 2%;
            background: #438eb9;
        }
        .navbar_box1{
            color: white;
            font-size: 25px;
            height: 50px;
            width: auto;
            float: left;
            letter-spacing:5px;
            line-height: 50px;
        }
        .navbar_box2{
            float: right;
            width: auto;
            height: 50px;
        }
        .navbar_box2_left{
            float: right;
            height: 50px;
            width: 70px;
        }
        .navbar_box2_left_box{
            width: 70px;
            height: 25px;
            line-height: 25px;
            color: white;
            letter-spacing: 1px;
        }
        .navbar_box2_right{
            float: right;
            height: 50px;
            width: auto;
            line-height: 50px;
            color: white;
            line-height: 50px;
            letter-spacing: 2px;
            font-size: 20px;
        }
        .navbar_box2_right a{
            text-decoration: none;
            color: white;
        }
        .navbar_box2_right a:hover{
            color: red;
        }
        .body{
            width: 100%;
            height: 500px;
            float: left;
            background: white;
            min-width: 1260px;
        }
        .body_left{
            width: 12%;
            float: left;
            height: 100%;
        }
        .body_left_box{
            width: 64%;
            height: 50px;
            background-color: #f9f9f9;
            padding: 0 22% 0 14%;
            float: left;
            text-align: center;
            line-height: 50px;
            font-size: 20px;
            font-family: 楷体;
        }
        .body_left_box a{
            text-decoration: none;
            color:black;
        }
        .body_right{
            float: right;
            width: 88%;
            height: 100%;
        }
        .body_right iframe{
            height: 100%;
            width: 100%;
            border: 0px;
        }
    </style>
</head>
<body>
    <div class="navbar">
        <div class="navbar_box1">后台管理系统</div>
        <div class="navbar_box2">
            <div class="navbar_box2_right"><a href="manager_center.jsp" target="maintext">个人中心</a></div>
            <div class="navbar_box2_left">
                <div class="navbar_box2_left_box">欢迎光临</div>
                <%
                    Manager manager = (Manager) session.getAttribute("manager");
                %>
                <div class="navbar_box2_left_box"><%=manager.getLoginName()%></div>
            </div>
        </div>
    </div>
    <div class="body">
        <div class="body_left">
            <div class="body_left_box"><a href="manager_showdata.jsp" target="maintext">系统首页</a></div>
            <div class="body_left_box"><a href="manager_controlgood.jsp" target="maintext">商品管理</a></div>
            <div class="body_left_box"><a href="manager_controlchouqian.jsp" target="maintext">抽签管理</a></div>
            <div class="body_left_box"><a href="manager_controluser.jsp" target="maintext">用户管理</a></div>
            <div class="body_left_box"><a href="manager_controlorder.jsp" target="maintext">订单管理</a></div>
        </div>
        <div class="body_right">
            <iframe id="iframe" onload="setIframeHeight(this)"width="100%" frameborder="no" border="0"  scrolling="no" name="maintext" src="manager_showdata.jsp"></iframe>
        </div>
    </div>
    <script type="text/javascript" language="javascript">
        function setIframeHeight(iframe) {
            if (iframe) {
                var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
                if (iframeWin.document.body) {
                    iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
                }
            }
        };
    </script>
</body>
</html>
