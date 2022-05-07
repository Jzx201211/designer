package com.bysj.mgr_servlets;

import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdataGoodServlet")
public class UpdataGoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int goodId = Integer.parseInt(request.getParameter("goodId"));
        String brandName = request.getParameter("brandName");
        String goodName = request.getParameter("goodName");
        String goodDesc = request.getParameter("goodDesc");
        double goodPrice = Double.parseDouble(request.getParameter("goodPrice"));
        String goodImg = request.getParameter("goodImg");
        int goodStock = Integer.parseInt(request.getParameter("goodStock"));
        GoodService goodService = new GoodService();
        int i = goodService.checkOrInsertBrand(brandName);
        int i1 = goodService.updataGood(i, goodName, goodDesc, goodPrice, goodImg, goodStock, goodId);
        if(i1==1){
            request.setAttribute("mtips","修改商品成功");
        }else {
            request.setAttribute("mtips","修改商品失败");
        }
        request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
    }
}
