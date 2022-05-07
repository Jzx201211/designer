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

@WebServlet("/UpdataManagerServlet")
public class UpdataManagerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String loginName = request.getParameter("loginName");
        String loginPwd = request.getParameter("loginPwd");
        String mgrName = request.getParameter("mgrName");
        String mgrGender = request.getParameter("mgrGender");
        HttpSession session = request.getSession();
        Manager manager = (Manager) session.getAttribute("manager");
        Manager manager1 = new Manager(manager.getMgrId(), loginName, loginPwd, mgrName, mgrGender, manager.getCreateTime());
        ManagerService managerService = new ManagerService();
        Manager manager2 = managerService.updataManager(manager1);
        session.setAttribute("manager",manager2);
        request.setAttribute("mtips","修改成功");
        request.getRequestDispatcher("manager_tips.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
