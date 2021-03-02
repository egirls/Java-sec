<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/useJS.js"></script>
<script language = "javascript">
	</script>
</head>
<body>
	<%
		String username = (String) request.getSession().getAttribute(
				"username");
				
	%>
	<form action="servlet/r_message_servlet" method="Post">
		&解密页面&
		<br>
		密文信息内容:
		<br>
		<textarea rows="5" cols="30" name="message"
			id="message"></textarea>
		<br> 我的私钥 :
		<input type="text" name="privatekey" id="privatekey">
		<br>
		<input type="submit" value="解密密文" id="btn"
			 />
		<a href="message.jsp"> 去加密</a>
	</form>

</body>
</html>