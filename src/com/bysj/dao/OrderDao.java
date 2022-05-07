package com.bysj.dao;

import com.bysj.dto.Order;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class OrderDao {
    public long orderGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_order";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //待处理订单数order_state = 0
    public long orderPendingGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_order where order_state=0";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //已完成订单数order_state = 1
    public long orderDoneGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_order where order_state=1";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //已取消订单数order_state = 2
    public long orderCancelledGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_order where order_state=2";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public List<Order> orderList(){
        List<Order> orderList = null;
        try {
            String sql = "select order_id orderId,order_user orderUser,order_dizhi orderDiZhi,order_tel orderTel,order_time orderTime,order_state orderState,order_good orderGood from tb_order";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            orderList = queryRunner.query(sql,new BeanListHandler<Order>(Order.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public int updataOrderState(int orderId){
        int i =0;
        try {
            String sql ="update tb_order set order_state = 1 where order_id =?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,orderId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
