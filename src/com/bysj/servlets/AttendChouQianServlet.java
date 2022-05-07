package com.bysj.servlets;

import com.bysj.dto.Cq;
import com.bysj.dto.User;
import com.bysj.service.GoodService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AttendChouQianServlet")
public class AttendChouQianServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String goodName = request.getParameter("goodName");
        String cqName = request.getParameter("cqName");
        String cqDiZhi = request.getParameter("cqDiZhi");
        String cqTel = request.getParameter("cqTel");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int userId = user.getUserId();
        Cq cq = new Cq(goodName, cqName, cqDiZhi, cqTel, userId);
        GoodService goodService = new GoodService();
        int i = goodService.attendChouQian(cq);
        if(i==1){
            request.setAttribute("tips","参与抽签成功");
        }else {
            request.setAttribute("tips","已经参与过抽签");
        }
        request.getRequestDispatcher("tips.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
