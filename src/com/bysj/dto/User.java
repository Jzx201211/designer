package com.bysj.dto;

public class User {
    private int userId;
    private String userName;
    private String userPwd;
    private int userState;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userState=" + userState +
                '}';
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public User(int userId, String userName, String userPwd, int userState) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userState = userState;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public User() {
    }
}
