package com.bysj.service;

import com.bysj.dao.OrderDao;
import com.bysj.dto.Order;

import java.util.List;

public class OrderService {
    //订单总数
    public long orderNumber(){
        OrderDao orderDao = new OrderDao();
        long l = orderDao.orderGetCount();
        return l;
    }
    //待处理订单数
    public long orderPendingNumber(){
        OrderDao orderDao = new OrderDao();
        long l = orderDao.orderPendingGetCount();
        return l;
    }
    //已完成订单数
    public long orderDoneNumber(){
        OrderDao orderDao = new OrderDao();
        long l = orderDao.orderDoneGetCount();
        return l;
    }
    //已取消订单数
    public long orderCancelledNumber(){
        OrderDao orderDao = new OrderDao();
        long l = orderDao.orderCancelledGetCount();
        return l;
    }

    public List<Order> orderList(){
        OrderDao orderDao = new OrderDao();
        List<Order> orderList = orderDao.orderList();
        return orderList;
    }

    public int updataOrderState(int orderId){
        OrderDao orderDao = new OrderDao();
        int i = orderDao.updataOrderState(orderId);
        return i;
    }
}
