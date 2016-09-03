<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login_success.jsp' starting page</title>

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
	<div id="top">
		<h1>学生信息管理</h1><hr>
	</div>

	
	<div>
		<p>
			欢迎${sessionScope.loginUserName } <br> <a
				href="<%=path%>/User_logout">安全退出</a>
		</p>
	</div>
	<!-- 选择菜单 -->
	<ul>
		<li><a href="/student/query_success.jsp">查询</a></li>
		<li><a href="/student/delete.jsp">删除</a></li>
		<li><a href="/student/query_success.jsp">查询</a></li>

	</ul>
	<div></div>
</body>
</html>
