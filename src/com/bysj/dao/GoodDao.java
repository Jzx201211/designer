package com.bysj.dao;

import com.bysj.dto.Brand;
import com.bysj.dto.Good;
import com.bysj.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class GoodDao {
    //查询所有品牌信息
    public List<Brand> brandList(){
        List<Brand> brandList = null;
        try {
            String sql = "select brand_id brandId,brand_name brandName from tb_brand";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            brandList = queryRunner.query(sql,new BeanListHandler<Brand>(Brand.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brandList;
    }

    //查询所有商品信息
    public List<Good> GoodList(){
        List<Good> goodList = null;
        try {
            String sql = "select good_stock goodStock,good_state goodState,bid bId,good_id goodId,good_name goodName,good_desc goodDesc,good_price goodPrice,good_img goodImg from tb_good";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            goodList=queryRunner.query(sql,new BeanListHandler<Good>(Good.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goodList;
    }
    //更据品牌查询商品
    public List<Good> selectGoodByBrandId(int bId){
        List<Good> goodList = null;
        try {
            String sql = "select good_stock goodStock,good_state goodState,bid bId,good_id goodId,good_name goodName,good_desc goodDesc,good_price goodPrice,good_img goodImg from tb_good where bid=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            goodList=queryRunner.query(sql,new BeanListHandler<Good>(Good.class),bId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goodList;
    }

    //更据商品Id查询商品
    public Good selectGoodByGoodId(int goodId){
        Good good = null;
        try {
            String sql = "select good_stock goodStock,good_state goodState,bid bId,good_id goodId,good_name goodName,good_desc goodDesc,good_price goodPrice,good_img goodImg from tb_good where good_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            good = queryRunner.query(sql,new BeanHandler<Good>(Good.class),goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return good;
    }

    //查询商品的总数
    public long goodGetCount(){
        long i = 0;
        try {
            String sql = "select count(1) from tb_good";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //查询品牌总数
    public long brandGetCount(){
        long i = 0;
        try {
            String sql ="select count(1) from tb_brand";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            ScalarHandler<Long> integerScalarHandler = new ScalarHandler<>();
            i = queryRunner.query(sql,integerScalarHandler);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //更据商品ID删除商品
    public int deleteGood(int goodId){
        int i = 0;
        try {
            String sql="delete from tb_good where good_id = ?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    //更据Id查品牌
    public Brand selectBrandByBrandId(int bId){
        Brand brand =null;
        try {
            String sql = "select brand_id brandId,brand_name brandName from tb_brand where brand_id =?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            brand = queryRunner.query(sql,new BeanHandler<Brand>(Brand.class),bId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brand;
    }
    //根据品牌名查询品牌信息
    public Brand selectBrandByBrandName(String brandName){
        Brand brand = null;
        try{
            String sql ="select brand_id brandId,brand_name brandName from tb_brand where brand_name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            brand = queryRunner.query(sql,new BeanHandler<Brand>(Brand.class),brandName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brand;
    }

    //增加新的品牌
    public int insertBrand(String brandName){
        int i = 0;
        try {
            String sql = "insert into tb_brand(brand_name) values(?)";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,brandName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public int insertGood(int bid,String goodName,String goodDesc,double goodPrice,String goodImg,int goodStock){
        int i = 0;
        try {
            String sql = "insert into tb_good(bid,good_name,good_desc,good_price,good_img,good_state,good_stock) values(?,?,?,?,?,0,?)";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,bid,goodName,goodDesc,goodPrice,goodImg,goodStock);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public int updataGood(int bId,String goodName,String goodDesc,double goodPrice,String goodImg,int goodStock,int goodId){
        int i = 0;
        try {
            String sql ="update tb_good set bid=?,good_name=?,good_desc=?,good_price=?,good_img=?,good_stock=? where good_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,bId,goodName,goodDesc,goodPrice,goodImg,goodStock,goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public int updataGoodStateOf1(int goodId){
        int i =0;
        try {
            String sql ="update tb_good set good_state=1 where good_id=? ";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i=queryRunner.update(sql,goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public int updataGoodStateOf2(int goodId){
        int i =0;
        try {
            String sql ="update tb_good set good_state=2 where good_id=? ";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i=queryRunner.update(sql,goodId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
