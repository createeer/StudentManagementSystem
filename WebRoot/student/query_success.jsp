<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix  = "s" uri = "/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'query_success.jsp' starting page</title>
    
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
    This is my JSP page. <br>
    <!-- 以下为查询的信息 -->
    <div>
    <table>
    <s:iterator value = "#session.student_list" var = "stu">
    <tr>
    <td><s:property value = "#stu.name"/></td>
    <td><s:property value = "#stu.gender"/></td>
    <td><s:property value = "#stu.stuId"/></td>
    <td><s:property value = "#stu.major"/></td>
    <td><s:property value = "#stu.email"/></td>
    <td><a href= "<%=path%>/student/Student_delete?stuId=<s:property value = "#stu.stuId"/>" onclick ="javascript:return confim('是否删除？');">删除</a></td>
    </tr>
    </s:iterator>
    </table>
    </div>
  </body>
</html>
