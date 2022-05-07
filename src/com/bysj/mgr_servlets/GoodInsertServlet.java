package com.bysj.mgr_servlets;

import com.bysj.dto.Good;
import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GoodInsertServlet")
public class GoodInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String brandName = request.getParameter("brandName");
        String goodName = request.getParameter("goodName");
        String goodDesc = request.getParameter("goodDesc");
        double goodPrice = Double.parseDouble(request.getParameter("goodPrice"));
        String goodImg = request.getParameter("goodImg");
        int goodStock = Integer.parseInt(request.getParameter("goodStock"));
        GoodService goodService = new GoodService();
        int i = goodService.checkOrInsertBrand(brandName);
        int i1 = goodService.insertGood(i, goodName, goodDesc, goodPrice, goodImg, goodStock);
        if(i1==0){
            request.setAttribute("mtips","添加商品失败");
        }else {
            request.setAttribute("mtips","添加商品成功");
        }
        request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
    }
}
