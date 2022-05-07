package com.bysj.servlets;

import com.bysj.dto.Good;
import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserSelectGoodByGoodIdServlet")
public class UserSelectGoodByGoodIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int goodId = Integer.parseInt(request.getParameter("goodId"));
        GoodService goodService = new GoodService();
        Good good = goodService.selectGoodById(goodId);
        request.setAttribute("good",good);
        request.getRequestDispatcher("good.jsp").forward(request,response);
    }
}
