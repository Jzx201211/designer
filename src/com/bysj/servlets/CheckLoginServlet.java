package com.bysj.servlets;

import com.bysj.dto.Brand;
import com.bysj.dto.User;
import com.bysj.service.GoodService;
import com.bysj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
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
        User user = userService.checkLogin(userName, userPwd);
        GoodService goodService = new GoodService();
        List<Brand> brandList = goodService.brandList();
        if(user==null){
            request.setAttribute("tips","登录失败，用户名或密码错误！");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            session.setAttribute("brandList",brandList);
            response.sendRedirect("index.jsp");
        }
    }
}
