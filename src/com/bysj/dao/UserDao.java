package com.bysj.dao;

import com.bysj.dto.Cq;
import com.bysj.dto.User;
import com.bysj.dto.Zq;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    public int insertUser(String userName,String userPwd){
        int i = 0;
        try {
            String sql = "insert into tb_user(user_name,user_password,user_state) values(?,?,1)";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,userName,userPwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public User selectUserByUserName(String userName){
        User user = null;
        try {
            String sql = "select user_state userState,user_id userId,user_name userName,user_password userPwd from tb_user where user_name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            user = queryRunner.query(sql,new BeanHandler<User>(User.class),userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Zq checkIsZq(String userName){
        Zq zq = null;
        try {
            String sql="select user_name userName,user_dizhi userDiZhi,user_tel userTel,good_name goodName from tb_zq where user_name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            zq = queryRunner.query(sql, new BeanHandler<Zq>(Zq.class),userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return zq;
    }

    public long userGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_user";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public List<User> userList(){
        List<User> userList = null;
        try{
            String sql ="select user_state userState,user_id userId,user_name userName,user_password userPwd from tb_user";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            userList = queryRunner.query(sql,new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public int updataUserStateOf1(int j,int userId){
        int i = 0;
        try {
            String sql = "update tb_user set user_state=? where user_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,j,userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public int updataUser(int userId,String userName,String userPwd){
        int i =0;
        try{
            String sql ="update tb_user set user_name=?,user_password=? where user_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,userName,userPwd,userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public User selectUserById(int userId){
        User user =null;
        try {
            String sql = "select user_state userState,user_id userId,user_name userName,user_password userPwd from tb_user where user_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            user = queryRunner.query(sql,new BeanHandler<User>(User.class),userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
