package com.bysj.dto;

public class Cq {
    private String goodName;
    private String cqName;
    private String cqDiZhi;
    private String cqTel;
    private int userId;

    @Override
    public String toString() {
        return "Cq{" +
                "goodName='" + goodName + '\'' +
                ", cqName='" + cqName + '\'' +
                ", cqDiZhi='" + cqDiZhi + '\'' +
                ", cqTel='" + cqTel + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Cq() {
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getCqName() {
        return cqName;
    }

    public void setCqName(String cqName) {
        this.cqName = cqName;
    }

    public String getCqDiZhi() {
        return cqDiZhi;
    }

    public void setCqDiZhi(String cqDiZhi) {
        this.cqDiZhi = cqDiZhi;
    }

    public String getCqTel() {
        return cqTel;
    }

    public void setCqTel(String cqTel) {
        this.cqTel = cqTel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Cq(String goodName, String cqName, String cqDiZhi, String cqTel, int userId) {
        this.goodName = goodName;
        this.cqName = cqName;
        this.cqDiZhi = cqDiZhi;
        this.cqTel = cqTel;
        this.userId = userId;
    }
}