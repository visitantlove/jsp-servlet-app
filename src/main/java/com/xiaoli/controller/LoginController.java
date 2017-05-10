package com.xiaoli.controller;

import com.xiaoli.entity.User;
import com.xiaoli.service.LoginService;
import com.xiaoli.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("user_id"));
        String password = req.getParameter("password");
        User user = loginService.getUserInfoById(id);
        String correctPassword = user.getPassword();
        if (password.equals(correctPassword)) {
            req.setAttribute("name", user.getUserName());
            req.getRequestDispatcher("WEB-INF/login/home.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("WEB-INF/login/error.jsp").forward(req, resp);
        }
    }
}
