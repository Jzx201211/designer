<%@ page import="com.bysj.service.OrderService" %>
<%@ page import="com.bysj.dto.Order" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单管理</title>
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
    OrderService orderService = new OrderService();
    List<Order> orderList = orderService.orderList();
%>
<div class="body">
    <div class="body_line">
        <div class="body_line_box">订单Id</div>
        <div class="body_line_box">订单商品</div>
        <div class="body_line_box">订单用户</div>
        <div class="body_line_box">用户电话</div>
        <div class="body_line_box">用户地址</div>
        <div class="body_line_box">订单时间</div>
        <div class="body_line_box">订单状态</div>
        <div class="body_line_box">操作</div>
    </div>

    <%
        for(int i =0 ;i<orderList.size();i++){
            Order order = orderList.get(i);
    %>
    <div class="body_line">
        <div class="body_line_box"><%=order.getOrderId()%></div>
        <div class="body_line_box"><%=order.getOrderGood()%></div>
        <div class="body_line_box"><%=order.getOrderUser()%></div>
        <div class="body_line_box"><%=order.getOrderTel()%></div>
        <div class="body_line_box"><%=order.getOrderDiZhi()%></div>
        <div class="body_line_box"><%=order.getOrderTime()%></div>
        <%
            String state = "";
            if(order.getOrderState()==0){
                state = "待处理";
            } else if (order.getOrderState()==1) {
                state = "已完成";
            } else {
                state = "已取消";
            }
        %>
        <div class="body_line_box"><%=state%></div>
        <div class="body_line_box">
            <a href="UpdataOrderStateServlet?orderId=<%=order.getOrderId()%>">转为已处理</a>
        </div>
    </div>
    <%
        }
    %>
</div>
</body>
</html>
