package com.bysj.service;

import com.bysj.dao.CqDao;
import com.bysj.dao.UserDao;
import com.bysj.dao.ZqDao;
import com.bysj.dto.Cq;
import com.bysj.dto.User;
import com.bysj.dto.Zq;

import java.util.List;

public class UserService {
    public User checkLogin(String userName,String userPwd){
        UserDao userDao = new UserDao();
        User user = userDao.selectUserByUserName(userName);
        if (user!=null){
            if(!userPwd.equals(user.getUserPwd())){
                return null;
            }
        }
        return user;
    }

    public int userCq(Cq cq){
        CqDao cqDao = new CqDao();
        int i = cqDao.insertCq(cq);
        return i;
    }

    public Zq checkZhongQian(String userName){
        UserDao userDao = new UserDao();
        Zq zq = userDao.checkIsZq(userName);
        return zq;
    }

    public long userNumber(){
        UserDao userDao = new UserDao();
        long l = userDao.userGetCount();
        return l;
    }

    public List<User> userList(){
        UserDao userDao = new UserDao();
        List<User> userList = userDao.userList();
        return userList;
    }

    public int banUser(int j,int userId){
        int i =0;
        UserDao userDao = new UserDao();
        i = userDao.updataUserStateOf1(j,userId);
        return i;
    }
    public User updataUser(int userId,String userName,String userPwd){
        User user = null;
        UserDao userDao = new UserDao();
        userDao.updataUser(userId,userName,userPwd);
        user = userDao.selectUserById(userId);
        return user;
    }

    public List<Zq> selectZq(int userId){
        ZqDao zqDao = new ZqDao();
        List<Zq> zqList = zqDao.selectZqByUserId(userId);
        return zqList;
    }

    public int registerUser(String userName,String userPwd){
        UserDao userDao = new UserDao();
        int i = userDao.insertUser(userName, userPwd);
        return i;
    }
}
