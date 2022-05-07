package com.bysj.dao;

import com.bysj.dto.Cq;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class CqDao {
    public int insertCq(Cq cq){
        int i =0;
        try {
            String sql = "insert into tb_cq(good_name,cq_name,cq_dizhi,cq_tel,user_id) value(?,?,?,?,?)";
            Object[] params ={cq.getGoodName(),cq.getCqName(),cq.getCqDiZhi(),cq.getCqTel(),cq.getUserId()};
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
