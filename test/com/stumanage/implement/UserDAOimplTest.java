package com.stumanage.implement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

import com.test.entity.User;

public class UserDAOimplTest {

    @Test
    public void testUserDAOimpl() {
        fail("Not yet implemented");
    }

    @Test
    public void testUserLogin() {
        Date d = new Date();
        User u = new User("liming", "123456", d);
        UserDAOimpl udao = new UserDAOimpl();
        assertEquals(false, udao.userLogin(u));
    }

}
