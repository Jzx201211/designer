package com.bysj.servlets;

import com.bysj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");
        UserService userService = new UserService();
        int i = userService.registerUser(userName, userPwd);
        if(i==1){
            request.setAttribute("tips","注册成功");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        else {
            request.setAttribute("tips","注册失败，请重新输入");
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }
}
