package com.xiaoli.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        req.setAttribute("name", name);
        req.setAttribute("age", age);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
//        System.out.println(name + age);
//        PrintWriter out = resp.getWriter();
//        out.write(name);
//        out.write("\n");
//        out.write(age);
//        out.close();
    }
}
