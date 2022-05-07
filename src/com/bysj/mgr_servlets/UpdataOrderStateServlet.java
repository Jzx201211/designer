package com.bysj.mgr_servlets;

import com.bysj.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdataOrderStateServlet")
public class UpdataOrderStateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        OrderService orderService = new OrderService();
        int i = orderService.updataOrderState(orderId);
        if(i==1){
            request.setAttribute("mtips","设置成功");
        }else {
            request.setAttribute("mtips","设置失败");
        }
        request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
