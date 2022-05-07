package com.bysj.dto;

public class Zq {
    private String userName;
    private String userDiZhi;
    private double userTel;
    private String goodName;
    private double  goodPrice;
    private int userId;

    @Override
    public String toString() {
        return "Zq{" +
                "userName='" + userName + '\'' +
                ", userDiZhi='" + userDiZhi + '\'' +
                ", userTel=" + userTel +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", userId=" + userId +
                '}';
    }

    public void setUserTel(double userTel) {
        this.userTel = userTel;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Zq(String userName, String userDiZhi, double userTel, String goodName, double goodPrice, int userId) {
        this.userName = userName;
        this.userDiZhi = userDiZhi;
        this.userTel = userTel;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDiZhi() {
        return userDiZhi;
    }

    public void setUserDiZhi(String userDiZhi) {
        this.userDiZhi = userDiZhi;
    }

    public double getUserTel() {
        return userTel;
    }

    public void setUserTel(int userTel) {
        this.userTel = userTel;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Zq() {
    }

}
