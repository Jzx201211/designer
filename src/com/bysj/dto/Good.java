package com.bysj.dto;

public class Good {
    private int bId;
    private int goodId;
    private String goodName;
    private String goodDesc;
    private double goodPrice;
    private String goodImg;
    private int goodState;
    private int goodStock;

    @Override
    public String toString() {
        return "Good{" +
                "bId=" + bId +
                ", goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodDesc='" + goodDesc + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodImg='" + goodImg + '\'' +
                ", goodState=" + goodState +
                ", goodStock=" + goodStock +
                '}';
    }

    public int getGoodState() {
        return goodState;
    }

    public void setGoodState(int goodState) {
        this.goodState = goodState;
    }

    public int getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(int goodStock) {
        this.goodStock = goodStock;
    }

    public Good(int bId, int goodId, String goodName, String goodDesc, double goodPrice, String goodImg, int goodState, int goodStock) {
        this.bId = bId;
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodDesc = goodDesc;
        this.goodPrice = goodPrice;
        this.goodImg = goodImg;
        this.goodState = goodState;
        this.goodStock = goodStock;
    }


    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Good() {
    }

}
