<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    用户登录 <br>
    <hr>
    <div>
    <form name = "loginform"  action ="<%=path %>/User_login"  method = "post">
        用户名：<input type = "text" name = "userName"><br>
        密  码：<input type ="password" name = "userPwd" ><br>
        <input type = "submit" value = "提交"><br>
        <s:fielderror></s:fielderror><!-- 显示出错信息，下回用js -->
    </form>
    </div>
  </body>
</html>
