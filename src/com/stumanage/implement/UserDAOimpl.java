package com.stumanage.implement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.stumanage.hibernate.HibernateSessionFactory;
import com.stumanage.service.UserDAO;
import com.test.entity.User;

public class UserDAOimpl implements UserDAO {

    public UserDAOimpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean userLogin(User user) {
        // TODO Auto-generated method stub
        // 事务对象
        Transaction transaction = null;
        String hql = "";
        System.out.println("this is userLogin start");
        System.out.println("^^^^^^^^^^^6666666666………………………………………………");
        try {
            Session session = HibernateSessionFactory.getSessionFactory().getCurrentSession();
            transaction = (Transaction) session.beginTransaction();
            hql = "from User u where u.userName=? and u.userPwd=?";
            Query query = session.createQuery(hql);
            query.setParameter(0, user.getUserName());
            System.out.println(user.getUserName() + "+++++++++++++++++++++++++");
            query.setParameter(1, user.getUserPwd());
            System.out.println(user.getUserPwd() + "----------------------------------");
            List list = query.list();

            transaction.commit();
            if (list.size() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        } finally {
            System.out.println("this is finally");
            if (transaction != null) {
                // transaction.commit();
                transaction = null;
            }
        }

    }

}
