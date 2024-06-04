package org.codegym.bookapp.services;

import org.codegym.bookapp.entity.Admin;
import org.codegym.bookapp.models.AdminModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminService {
    private AdminModel adminModel;


    public AdminService() {
        adminModel = new AdminModel();
    }


    public void renderPageLogin(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher out = request.getRequestDispatcher("/views/admin/adminLogin.jsp");
        try {
            out.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = getUsername(request);
        String password = getPassword(request);
        Admin adminLogin = getByAccount(username, password);
        boolean isAdminExist = adminLogin != null;
        System.out.println(isAdminExist);
        if(isAdminExist) {
            HttpSession session = request.getSession();
            session.setAttribute("adminLogin", adminLogin.getName());
            response.sendRedirect("/user/list");
        } else {
            response.sendRedirect("/admin/login");
        }
    }

    private Admin getByAccount(String username, String password) {
        return this.adminModel.findByAccount(username, password);
    }

    private static String getPassword(HttpServletRequest request) {
        return request.getParameter("password");
    }

    private static String getUsername(HttpServletRequest request) {
        return request.getParameter("username");
    }

}
