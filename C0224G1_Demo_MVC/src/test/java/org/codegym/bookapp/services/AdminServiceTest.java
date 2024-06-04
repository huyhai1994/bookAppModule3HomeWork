package org.codegym.bookapp.services;

import org.codegym.bookapp.entity.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminServiceTest {

    @Test
    public void isGetNameAndPasswordTest(){
        Admin admin = new Admin();
        String nameResult = admin.getName();
        String passwordResult = admin.getPassword();
        String nameExpected = "Hai";
        String passwordExpected = "1234";
        assertEquals(nameExpected, nameResult);
        assertEquals(passwordExpected, passwordResult);
    }
    @Test void isAdminExistTest(){
        Admin admin = new Admin();


    }


}