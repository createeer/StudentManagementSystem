package com.stumanage.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ModelDriven;
import com.stumanage.implement.UserDAOimpl;
import com.test.entity.User;

public class UserAction extends SuperAction implements ModelDriven<User> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private User user = new User();

    // �û�����
    public String login() {
        UserDAOimpl udao = new UserDAOimpl();

        if (udao.userLogin(user)) {
            // ��Session�б����û���
            session.setAttribute("loginUserName", user.getUserName());
            return "login_success";
        } else {
            return "login_fail";
        }
    }

    // ע������
    @SkipValidation // ע��ʱ�����б���֤
    public String logout() {
        if (session.getAttribute("loginUserName") != null) {
            session.removeAttribute("loginUserName");
        }
        return "logout_success";
    }

    // ����֤����
    @Override
    public void validate() {
        // �û����Ƿ�Ϊ��
        if ("".equals(user.getUserName().trim())) {// trim()ȥ��string���߿ո�
            this.addFieldError("usernameError", "�û���Ϊ��");
        }
        // ���볤��
        if (user.getUserPwd().length() < 6) {
            this.addFieldError("passwordError", "����С��6λ");
        }

    }

    @Override
    public User getModel() {
        // TODO Auto-generated method stub
        return this.user;
    }

}
