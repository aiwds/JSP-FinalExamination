<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<center>
		<img src="image/1.jpg" height="180" width="400">
		<form action="Login" method="post">
			<div style="margin-top: 30px;">
				<label>用户名称：</label> <input type="text" id="name" name="name" />
			</div>
			<div style="margin-top: 20px;">
				<label>用户密码：</label> <input type="password" id="password" name="password" />
			</div>
			
			<input type="submit" value="登录" / style="margin-top: 18px;margin-left: 150px;">&nbsp;&nbsp;&nbsp;
			<input type="submit" value="重置" / style="margin-top: 18px;">
			
		</form>
	</center>
</body>
</html>