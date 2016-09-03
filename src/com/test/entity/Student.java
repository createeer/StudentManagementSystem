package com.test.entity;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Student() {
    }

    /** minimal constructor */
    public Student(String name, String gender, Integer stuId) {
        super(name, gender, stuId);
    }

    /** full constructor */
    public Student(String name, String gender, String email, Integer stuId, String major) {
        super(name, gender, email, stuId, major);
    }

}
