package com.bysj.mgr_servlets;

import com.bysj.dto.Manager;
import com.bysj.service.ManagerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ManagerLoginServlet")
public class ManagerLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginName = request.getParameter("loginName");
        String loginPwd = request.getParameter("loginPwd");
        System.out.println(loginName);
        ManagerService managerService = new ManagerService();
        Manager manager = managerService.checkLogin(loginName, loginPwd);
        if(manager==null){
            request.setAttribute("tips","管理员登录失败，用户名或密码错误！");
            request.getRequestDispatcher("manager_login.jsp").forward(request,response);
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("manager",manager);
            response.sendRedirect("manager_index.jsp");
        }
    }
}
