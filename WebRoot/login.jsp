<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<SCRIPT TYPE="text/javascript">

</SCRIPT>
<head>
<script language = "javascript">
		function send(){
		window.open("index.jsp", "index");
		}
		function error(){
		
		}
	</script>
<meta  http-equiv="Content-Type" content="text/html ; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="servlet/login_servlet" method="Post" >
		账号 :
		<input type="text" name="name" id="name"/>
		<br>  密码  :
		<input type="password" name="pword" id="pword"/>
		<br>
		<input type="submit" value="登录" />
		
		<input name="input" type="button" value="注册" onclick="send()"/>
		<br>
		
	</form>
</body>
</html>