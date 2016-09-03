package com.stumanage.action;

import java.util.List;

import com.stumanage.implement.StudentDaoImpl;
import com.test.entity.Student;

public class StudentAction extends SuperAction {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;// ����ʲô��
    // ��ѯѧ��

    public String query() {
        StudentDaoImpl stu = new StudentDaoImpl();
        List<Student> list = stu.queryAllStudent();
        if (list.size() > 0) {
            session.setAttribute("stu_list", list);
        }
        return "query_success";
    }

    // ɾ����Ϣ
    public String delete() {
        StudentDaoImpl stu = new StudentDaoImpl();
        String stuId = request.getParameter("stuId");
        int sid = Integer.valueOf(stuId).intValue();
        stu.delStudent(sid);
        return "del_success";
    }

}
