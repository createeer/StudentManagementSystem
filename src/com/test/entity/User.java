package com.test.entity;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(String userName, String userPwd) {
        super(userName, userPwd);
    }

    /** full constructor */
    public User(String userName, String userPwd, Date userDate) {
        super(userName, userPwd, userDate);
    }

}
