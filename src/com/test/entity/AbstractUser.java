package com.test.entity;

import java.util.Date;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

    // Fields

    private Integer userId;
    private String userName;
    private String userPwd;
    private Date userDate;

    // Constructors

    /** default constructor */
    public AbstractUser() {
    }

    /** minimal constructor */
    public AbstractUser(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    /** full constructor */
    public AbstractUser(String userName, String userPwd, Date userDate) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userDate = userDate;
    }

    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return this.userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getUserDate() {
        return this.userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

}