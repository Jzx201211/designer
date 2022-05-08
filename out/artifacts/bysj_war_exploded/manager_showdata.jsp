<%@ page import="com.bysj.service.GoodService" %>
<%@ page import="com.bysj.service.UserService" %>
<%@ page import="com.bysj.service.OrderService" %><%--
  Created by IntelliJ IDEA.
  User: 蒋子旭
  Date: 2022/4/20
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统首页</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            border: 0;
        }
        .body{
            width: 80%;
            margin: 0 auto;
            padding: 20px 10%;
            height: 100%;
        }
        .body_box{
            width: 100%;
            height: 33%;
            float: left;
        }
        .show{
            width: 300px;
            height: 100px;
            float: left;
            margin-left: 20px;
            margin-top: 10px;
            float: left;
        }
        .show_left{
            width: 40%;
            float: left;
            height: 100%;
        }
        .show_right{
            width: 50%;
            float: left;
            height: 80px;
            padding: 10px 5%;
        }
        .show_right_shang{
            width: 100%;
            height: 50px;
            font-size: 30px;
            float: left;
            line-height: 50px;
            text-align: center;
            font-weight: 700;
            letter-spacing: 2px;

        }
        .show_right_xia{
            width: 100%;
            float: left;
            font-size: 15px;
            height: 30px;
            text-align: center;
            line-height: 30px;
            letter-spacing: 2px;
        }
        .center{
            height: 160px;
            width: 300px;
            margin-left: 20px;
            float: left;
        }
        .center_box{
            width: 100%;
            height: 40px;
            float: left;
            text-align: center;
            line-height: 40px;
            font-size: 20px;
        }
        .buttom{
            width: 100px;
            height: 120px;
            margin-left: 20px;
            margin-top: 20px;
            float: left;
        }
        .buttom:hover{
            color: red;
        }
        .buttom_shang{
            height: 100px;
            width: 100%;
            float: left;
        }
        .buttom_xia{
            height: 20px;
            width: 100%;
            float: left;
            text-align: center;
            line-height: 20px;
            letter-spacing: 2px;

        }
        .buttom_shang a{
            text-decoration: none;
        }
        .buttom_shang a img{
            height: 100%;
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="body">
        <div class="body_box">
            <div class="show">
                <div class="show_left">
                    <img src="logo/1.jpg" style="width: 100%;height: 100%">
                </div>
                <div class="show_right">
                    <%
                        UserService userService = new UserService();
                        long user = userService.userNumber();
                    %>
                    <div class="show_right_shang"><%=user%></div>
                    <div class="show_right_xia">用户数量</div>
                </div>
            </div>
            <div class="show">
                <div class="show_left">
                    <img src="logo/2.png" style="width: 100%;height: 100%">
                </div>
                <div class="show_right">
                    <%
                        GoodService goodService = new GoodService();
                        long good = goodService.goodNumber();
                    %>
                    <div class="show_right_shang"><%=good%></div>
                    <div class="show_right_xia">商品数量</div>
                </div>
            </div>
            <div class="show">
                <div class="show_left">
                    <img src="logo/3.png" style="width: 100%;height: 100%">
                </div>
                <div class="show_right">
                    <%
                        OrderService orderService = new OrderService();
                        long order = orderService.orderNumber();
                    %>
                    <div class="show_right_shang"><%=order%></div>
                    <div class="show_right_xia">订单数量</div>
                </div>
            </div>
        </div>
        <div class="body_box">
            <div class="center">
                <%
                    long orderPendingNumber = orderService.orderPendingNumber();
                    long orderDoneNumber = orderService.orderDoneNumber();
                    long orderCancelledNumber = orderService.orderCancelledNumber();
                %>
                <div class="center_box">订单统计信息</div>
                <div class="center_box">待处理订单数：<%=orderPendingNumber%></div>
                <div class="center_box">已完成订单数：<%=orderDoneNumber%></div>
                <div class="center_box">已取消订单数：<%=orderCancelledNumber%></div>
            </div>
            <div class="center">
                <%
                    long brandNumber = goodService.brandNumber();
                %>
                <div class="center_box">商品统计情况</div>
                <div class="center_box">现有商品品牌数：<%=brandNumber%></div>
                <div class="center_box"></div>
                <div class="center_box"></div>
            </div>
            <div class="center"></div>
        </div>
        <div class="body_box">
            <div class="buttom">
                <div class="buttom_shang">
                    <a href="manager_controlgood.jsp"><img src="logo/4.png"></a>
                </div>
                <div class="buttom_xia">商品管理</div>
            </div>
            <div class="buttom">
                <div class="buttom_shang">
                    <a href="manager_controlchouqian.jsp"><img src="logo/7.png"></a>
                </div>
                <div class="buttom_xia">抽签管理</div>
            </div>
            <div class="buttom">
                <div class="buttom_shang">
                    <a href="manager_controluser.jsp"><img src="logo/8.png"></a>
                </div>
                <div class="buttom_xia">用户管理</div>
            </div>
            <div class="buttom">
                <div class="buttom_shang">
                    <a href="manager_controlorder.jsp"><img src="logo/6.png"></a>
                </div>
                <div class="buttom_xia">订单管理</div>
            </div>
        </div>
    </div>
</body>
</html>
