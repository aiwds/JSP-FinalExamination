<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<style>
a:hover{color:#F00;text-decoration:underline;font-size:25px }
</style>
</head>
<body>
	<span style="font-size: 30px;color:red;"><%=request.getAttribute("names")%></span>&nbsp;&nbsp;<span style="font-size:20px">欢迎您的来到~</span>
	<br>
	<br>
	<br> 单击以下任意一项即可进入相应界面！
	<p>
	<ul>
		<li>
			<%
				session.setAttribute("message", "请你猜数字");
				int randomNumber = (int) (Math.random() * 100) + 1;
				session.setAttribute("savedNumber", new Integer(randomNumber));
			%> <a href="InputNumber.jsp">猜数字</a>
		</li>
		<p>
		<li><a href="2048.jsp">2048小游戏</a></li>
		<p>
		<li><a href="Calculator.jsp">简易计算器</a></li>
		<p>
		<li><a href="showEnglishAlphabet">英文字母表</a></li>
		<p>
		<li><a href="showGreekAlphabet">希腊字母表</a></li>
		<p>
		<li><a href="showRussianAlphabet">俄文字母表</a></li>
		<p>
		<li><a href="showIPAddress">获取本机名及IP地址</a></li>		
	</ul>
</body>
</html>