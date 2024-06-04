package org.codegym.bookapp.models;

import org.codegym.bookapp.entity.Admin;

public class AdminModel {
    private Admin admin;
    public AdminModel(){
        admin = new Admin();
    }

    public Admin findByAccount(String username, String password) {
            return admin.getName().equals(username) && admin.getPassword().equals(password)? admin : null;
    }
}

