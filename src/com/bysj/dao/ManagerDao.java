package com.bysj.dao;

import com.bysj.dto.Manager;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

//用于完成管理员信息的数据库访问
public class ManagerDao {
    public Manager selectManagerByLoginName(String loginName){
        Manager manager = null;
        try {
            String sql = "select mgr_id mgrId,login_name loginName,login_pwd loginPwd,mgr_name mgrName,mgr_gender mgrGender,create_time createTime from tb_manager where login_name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
             manager = queryRunner.query(sql, new BeanHandler<Manager>(Manager.class),loginName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manager;
    }

    public int updataManager(Manager manager){
        int i=0;
        try {
            String sql ="update tb_manager set login_name=?,login_pwd=?,mgr_name=?,mgr_gender=? where mgr_id=? ";
            Object[] params = {manager.getLoginName(),manager.getLoginPwd(),manager.getMgrName(),manager.getMgrGender(),manager.getMgrId()};
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i=queryRunner.update(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public Manager selectManagerByMgrId(int mgrId){
        Manager manager = null;
        try {
            String sql = "select mgr_id mgrId,login_name loginName,login_pwd loginPwd,mgr_name mgrName,mgr_gender mgrGender,create_time createTime from tb_manager where mgr_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            manager = queryRunner.query(sql, new BeanHandler<Manager>(Manager.class),mgrId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manager;
    }
}
