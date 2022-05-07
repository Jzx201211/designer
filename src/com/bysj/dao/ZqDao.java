package com.bysj.dao;

import com.bysj.dto.Zq;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class ZqDao {
    public List<Zq> selectZqByUserId(int userId){
        List<Zq> zqList =null;
        try {
            String sql ="select user_name userName,user_dizhi userDiZhi,user_tel userTel,good_name goodName,good_price goodPrice,user_id userId from tb_zq where user_id =?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            zqList = queryRunner.query(sql,new BeanListHandler<Zq>(Zq.class),userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return zqList;
    }
}
