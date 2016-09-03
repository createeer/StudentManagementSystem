package com.stumanage.service;

import java.util.List;

import com.test.entity.Student;

public interface StudentDAO {
    // ��ѯ����ѧ��
    public List<Student> queryAllStudent();

    // ����ѧ����Ų�ѯ
    public Student queryById(int id);

    // �������
    public boolean addStudent(Student stu);

    // ɾ��ѧ������
    public boolean delStudent(int id);

    // �޸�
    public boolean editStudent(Student stu);

}
