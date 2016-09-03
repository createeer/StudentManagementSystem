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

    // 用户动作
    public String login() {
        UserDAOimpl udao = new UserDAOimpl();

        if (udao.userLogin(user)) {
            // 在Session中保存用户名
            session.setAttribute("loginUserName", user.getUserName());
            return "login_success";
        } else {
            return "login_fail";
        }
    }

    // 注销方法
    @SkipValidation // 注销时不进行表单验证
    public String logout() {
        if (session.getAttribute("loginUserName") != null) {
            session.removeAttribute("loginUserName");
        }
        return "logout_success";
    }

    // 表单验证方法
    @Override
    public void validate() {
        // 用户名是否为空
        if ("".equals(user.getUserName().trim())) {// trim()去掉string两边空格
            this.addFieldError("usernameError", "用户名为空");
        }
        // 密码长度
        if (user.getUserPwd().length() < 6) {
            this.addFieldError("passwordError", "密码小于6位");
        }

    }

    @Override
    public User getModel() {
        // TODO Auto-generated method stub
        return this.user;
    }

}
