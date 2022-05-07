package com.bysj.mgr_servlets;

import com.bysj.dto.Brand;
import com.bysj.dto.Good;
import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SelectGoodByGoodIdServlet")
public class SelectGoodByGoodIdServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int goodId = Integer.parseInt(request.getParameter("goodId"));
        GoodService goodService = new GoodService();
        Good good = goodService.selectGoodById(goodId);
        int brandId = good.getbId();
        Brand brand = goodService.selectBrandById(brandId);
        request.setAttribute("brand",brand);
        request.setAttribute("good",good);
        request.getRequestDispatcher("manager_updatagood.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
