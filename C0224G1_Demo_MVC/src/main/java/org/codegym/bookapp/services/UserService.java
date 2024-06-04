package org.codegym.bookapp.services;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.codegym.bookapp.entity.User;
import org.codegym.bookapp.models.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserService {
    private UserModel userModel;

    public UserService(){
        this.userModel = new UserModel();
    }
    public void renderPageListUser(HttpServletRequest req, HttpServletResponse resp) {
        List<User> users = this.userModel.getAllUser();
        req.setAttribute("users", users);
        RequestDispatcher out = req.getRequestDispatcher("/views/users/list.jsp");
        try {
            out.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
