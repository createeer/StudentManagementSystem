package com.test.entity;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

    // Fields

    private Integer id;
    private String name;
    private String gender;
    private String email;
    private Integer stuId;
    private String major;

    // Constructors

    /** default constructor */
    public AbstractStudent() {
    }

    /** minimal constructor */
    public AbstractStudent(String name, String gender, Integer stuId) {
        this.name = name;
        this.gender = gender;
        this.stuId = stuId;
    }

    /** full constructor */
    public AbstractStudent(String name, String gender, String email, Integer stuId, String major) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.stuId = stuId;
        this.major = major;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStuId() {
        return this.stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}