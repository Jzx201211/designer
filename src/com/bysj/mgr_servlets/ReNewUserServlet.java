package com.bysj.mgr_servlets;

import com.bysj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReNewUserServlet")
public class ReNewUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        UserService userService = new UserService();
        int i = userService.banUser(0,userId);
        if(i==1){
            request.setAttribute("mtips","设置成功");
        }else {
            request.setAttribute("mtips","设置失败");
        }
        request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
    }
}
