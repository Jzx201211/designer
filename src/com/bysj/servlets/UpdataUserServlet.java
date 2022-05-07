package com.bysj.servlets;

import com.bysj.dto.User;
import com.bysj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/UpdataUserServlet")
public class UpdataUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("userName");
        int userId = Integer.parseInt(request.getParameter("userId"));
        String userPwd = request.getParameter("userPwd");
        System.out.println(userPwd);
        UserService userService = new UserService();
        User user = userService.updataUser(userId, userName, userPwd);
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        request.setAttribute("tips","更改成功");
        request.getRequestDispatcher("tips.jsp").forward(request,response);
    }
}
