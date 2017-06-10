<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>猜字游戏</title>
</head>
<body>
<center>
	<%
		String message = (String) session.getAttribute("message");
	%>
		<table border=2 style="font-size:20px;border-color:red;margin-top:30px ">
			<form action="showGuessNumber" method=post>
				<tr>
					<td>输入你的猜测:</td>
					<td><input type=text name=clientGuess size=4> <input
						type=submit value="提交"></td>
				</tr>
				<td>提示信息:</td>
				<td><%=message%></td>
			</form>
		</table>
	</center>
</body>
</html>