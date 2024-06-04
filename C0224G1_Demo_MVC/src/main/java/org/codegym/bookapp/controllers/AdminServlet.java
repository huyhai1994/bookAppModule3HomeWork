package org.codegym.bookapp.controllers;

import org.codegym.bookapp.services.AdminService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdminServlet",urlPatterns = "/admin/*")
public class AdminServlet  extends HttpServlet {
    private AdminService adminService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.adminService = new AdminService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
        switch (url) {
            case "/login":
                this.adminService.login(req, resp);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
        switch (url) {
            case "/login":
                this.adminService.renderPageLogin(req, resp);
                break;
        }

    }
}
