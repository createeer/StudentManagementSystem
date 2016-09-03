package com.stumanage.action;

import java.util.List;

import com.stumanage.implement.StudentDaoImpl;
import com.test.entity.Student;

public class StudentAction extends SuperAction {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;// 这是什么？
    // 查询学生

    public String query() {
        StudentDaoImpl stu = new StudentDaoImpl();
        List<Student> list = stu.queryAllStudent();
        if (list.size() > 0) {
            session.setAttribute("stu_list", list);
        }
        return "query_success";
    }

    // 删除信息
    public String delete() {
        StudentDaoImpl stu = new StudentDaoImpl();
        String stuId = request.getParameter("stuId");
        int sid = Integer.valueOf(stuId).intValue();
        stu.delStudent(sid);
        return "del_success";
    }

}
