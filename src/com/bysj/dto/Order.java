package com.bysj.dto;

import java.util.Date;

public class Order {
    private int orderId;
    private String orderUser;
    private String orderDiZhi;
    private String orderTel;
    private Date orderTime;
    private int orderState;
    private String orderGood;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderUser='" + orderUser + '\'' +
                ", orderDiZhi='" + orderDiZhi + '\'' +
                ", orderTel='" + orderTel + '\'' +
                ", orderTime=" + orderTime +
                ", orderState=" + orderState +
                ", orderGood='" + orderGood + '\'' +
                '}';
    }

    public String getOrderGood() {
        return orderGood;
    }

    public void setOrderGood(String orderGood) {
        this.orderGood = orderGood;
    }

    public Order(int orderId, String orderUser, String orderDiZhi, String orderTel, Date orderTime, int orderState, String orderGood) {
        this.orderId = orderId;
        this.orderUser = orderUser;
        this.orderDiZhi = orderDiZhi;
        this.orderTel = orderTel;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.orderGood = orderGood;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser;
    }

    public String getOrderDiZhi() {
        return orderDiZhi;
    }

    public void setOrderDiZhi(String orderDiZhi) {
        this.orderDiZhi = orderDiZhi;
    }

    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Order() {
    }


}
