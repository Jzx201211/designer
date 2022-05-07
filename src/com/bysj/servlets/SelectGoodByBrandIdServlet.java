package com.bysj.servlets;

import com.bysj.dto.Good;
import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectGoodByBrandIdServlet")
public class SelectGoodByBrandIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int brandId = Integer.parseInt(request.getParameter("brandId"));
        GoodService goodService = new GoodService();
        List<Good> goodList = goodService.selectGoodByBrandId(brandId);
        request.setAttribute("goodList",goodList);
        request.getRequestDispatcher("good_show.jsp").forward(request,response);
    }
}
