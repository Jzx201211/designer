package com.bysj.servlets;

import com.bysj.dto.Zq;
import com.bysj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CheckZQServlet")
public class CheckZQServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        UserService userService = new UserService();
        List<Zq> zqList = userService.selectZq(userId);
        request.setAttribute("zqList",zqList);
        System.out.println(zqList);
        request.getRequestDispatcher("check_zhongqian.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
