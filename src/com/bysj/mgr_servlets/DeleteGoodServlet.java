package com.bysj.mgr_servlets;

import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteGoodServlet")
public class DeleteGoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int goodId = Integer.parseInt(request.getParameter("goodId"));
        GoodService goodService = new GoodService();
        int i = goodService.deleteGood(goodId);
        if(i==1){
            request.setAttribute("mtips","删除商品成功");
            request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
        }
        else {
            request.setAttribute("mtips","删除商品失败");
            request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
        }
    }
}
