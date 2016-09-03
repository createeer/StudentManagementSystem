package com.stumanage.service;

import java.util.List;

import com.test.entity.Student;

public interface StudentDAO {
    // 查询所有学生
    public List<Student> queryAllStudent();

    // 根据学生编号查询
    public Student queryById(int id);

    // 添加数据
    public boolean addStudent(Student stu);

    // 删除学生数据
    public boolean delStudent(int id);

    // 修改
    public boolean editStudent(Student stu);

}
