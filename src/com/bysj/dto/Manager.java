package com.bysj.dto;

import java.util.Date;

//管理员信息实体类
public class Manager {
    private int mgrId;
    private String loginName;
    private String loginPwd;
    private String mgrName;
    private String mgrGender;
    private Date createTime;

    public Manager(int mgrId, String loginName, String loginPwd, String mgrName, String mgrGender, Date createTime) {
        this.mgrId = mgrId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.mgrName = mgrName;
        this.mgrGender = mgrGender;
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "mgrId='" + mgrId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", mgrName='" + mgrName + '\'' +
                ", mgrGender='" + mgrGender + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public int getMgrId() {
        return mgrId;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getMgrGender() {
        return mgrGender;
    }

    public void setMgrGender(String mgrGender) {
        this.mgrGender = mgrGender;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Manager() {
    }

}
