package org.codegym.bookapp.models;

import org.codegym.bookapp.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserModelTest {

    @Test
    void findUserByAccount() {
        UserModel userModel = new UserModel();
        User expected = new User(1,"Nam","nam123","1234");
        assertEquals(userModel.findUserByAccount("nam123","1234").getName(),expected.getName());
    }

    @Test
    void getAllUsers(){
        List<User> users = new ArrayList<User>();
        UserModel userModel = new UserModel();
        User u1 = new User(1, "Nam", "nam123", "1234");
        User u2 = new User(2, "Quan", "quan34", "1234");
        User u3 = new User(3, "Tien", "tiendepzai", "1234");
        User u4 = new User(4, "Duy", "duy2000", "1234");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        userModel.setAllUser(users);
        assertEquals(users.get(0).getName(),userModel.getAllUser().get(0).getName());
    }
}