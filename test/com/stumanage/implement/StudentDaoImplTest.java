package com.stumanage.implement;

import java.util.List;

import org.junit.Test;

import com.test.entity.Student;

public class StudentDaoImplTest {

    @Test
    public void testQueryAllStudent() {
        StudentDaoImpl stu = new StudentDaoImpl();
        List<Student> list = stu.queryAllStudent();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
