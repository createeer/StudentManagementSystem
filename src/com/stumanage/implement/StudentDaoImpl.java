package com.stumanage.implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stumanage.hibernate.HibernateSessionFactory;
import com.stumanage.service.StudentDAO;
import com.test.entity.Student;

public class StudentDaoImpl implements StudentDAO {

    public StudentDaoImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Student> queryAllStudent() {
        // TODO Auto-generated method stub
        // 事务
        Transaction tx = null;
        List<Student> list = null;
        String hql = "";
        try {
            // 获得一个回话
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            hql = "from Student";
            Query query = session.createQuery(hql);
            list = query.list();
            tx.commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
            return list;
        } finally {
            if (tx != null) {

                tx = null;
            }

        }
    }

    @Override
    public Student queryById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addStudent(Student stu) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delStudent(int stuId) {
        Transaction tx = null;

        try {
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            // 通过Session删除
            Student stu = session.get(Student.class, stuId);
            session.delete(stu);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
            return false;
        } finally {
            if (tx != null)
                tx = null;
        }

    }

    @Override
    public boolean editStudent(Student stu) {
        // TODO Auto-generated method stub
        return false;
    }

}
