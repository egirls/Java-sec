<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>login page</title>
<script type="text/javascript" src="js/useJS.js"></script>
</head>

<body>

	<form action="servlet/index_servlet" method="GET">
		<ul>
			<li>帐号：<input type="text" name="username" id="username" />
			</li>
			<li>密码：<input type="password" name="password" id="password"/>
			</li>
			<li>公钥：<input type="text" name="publickey" id="publickey"/>
			</li>
			<li>私钥：<input type="password" name="privatekey" id="privatekey"/>
			</li>
			<li><input type="submit" value="提交"  /></li>
		</ul>

	</form>
</body>
</html>
