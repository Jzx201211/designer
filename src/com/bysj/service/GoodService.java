package com.bysj.service;

import com.bysj.dao.CqDao;
import com.bysj.dao.GoodDao;
import com.bysj.dao.UserDao;
import com.bysj.dto.Brand;
import com.bysj.dto.Cq;
import com.bysj.dto.Good;

import java.util.List;

public class GoodService {
    public List<Brand> brandList(){
        GoodDao goodDao = new GoodDao();
        List<Brand> brandList = goodDao.brandList();
        return brandList;
    }

    public List<Good> selectGoodByBrandId(int bid){
        GoodDao goodDao = new GoodDao();
        List<Good> goodList = goodDao.selectGoodByBrandId(bid);
        return goodList;
    }

    //商品总数
    public long goodNumber(){
        GoodDao goodDao = new GoodDao();
        long l = goodDao.goodGetCount();
        return l;
    }
    //品牌总数
    public long brandNumber(){
        GoodDao goodDao = new GoodDao();
        long l = goodDao.brandGetCount();
        return l;
    }

    //得到所有商品的数据
    public List<Good> goodList(){
        GoodDao goodDao = new GoodDao();
        List<Good> goodList = goodDao.GoodList();
        return goodList;
    }

    //删除商品
    public int deleteGood(int goodId){
        GoodDao goodDao = new GoodDao();
        int i = goodDao.deleteGood(goodId);
        return i;
    }
    //查询商品通过商品ID
    public Good selectGoodById(int goodId){
        GoodDao goodDao = new GoodDao();
        Good good = goodDao.selectGoodByGoodId(goodId);
        return good;
    }
    //通过ID查询品牌
    public Brand selectBrandById(int brandId){
        GoodDao goodDao = new GoodDao();
        Brand brand = goodDao.selectBrandByBrandId(brandId);
        return brand;
    }

    public int checkOrInsertBrand(String brandName){
        GoodDao goodDao = new GoodDao();
        Brand brand1 = goodDao.selectBrandByBrandName(brandName);
        if(brand1==null){
            int i = goodDao.insertBrand(brandName);
            Brand brand2 = goodDao.selectBrandByBrandName(brandName);
            return brand2.getBrandId();
        }else {
            return brand1.getBrandId();
        }
    }
    public int insertGood(int bid,String goodName,String goodDesc,double goodPrice,String goodImg,int goodStock){
        int i =0;
        GoodDao goodDao = new GoodDao();
        i = goodDao.insertGood(bid,goodName,goodDesc,goodPrice,goodImg,goodStock);
        return i;
    }

    public int updataGood(int bId,String goodName,String goodDesc,double goodPrice,String goodImg,int goodStock,int goodId){
        int i = 0;
        GoodDao goodDao = new GoodDao();
        i = goodDao.updataGood(bId,goodName,goodDesc,goodPrice,goodImg,goodStock,goodId);
        return i;
    }

    public int actionCQ(int goodId){
        GoodDao goodDao = new GoodDao();
        int i = goodDao.updataGoodStateOf1(goodId);
        return i;
    }
    public int endCQ(int goodId){
        GoodDao goodDao = new GoodDao();
        int i = goodDao.updataGoodStateOf2(goodId);
        return i;
    }

    public int attendChouQian(Cq cq){
        int i =0;
        CqDao cqDao = new CqDao();
        i = cqDao.insertCq(cq);
        return i;
    }

}

