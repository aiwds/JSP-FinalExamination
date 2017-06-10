<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简易计算器</title>
<style>
.aaa td{ width:50px;height:50px}
</style>
</head>
<body>
<center>
<table  class="aaa" border="1" style="border-color:black;background: #AAAAAA; color: white; font-size:30px;" width="500" height="500" id="js" onclick="js();">
<tr style="background:#FF8888;">
	<td colspan="5" id="jsdata"></td>
</tr>
<tr>
	<td>1</td>
	<td>2</td>
	<td>3</td>
 	<td>+</td>
	<td>c</td>
</tr>
<tr>
	<td>4</td>
	<td>5</td>
	<td>6</td>
	<td>-</td>
	<td rowspan="3">=</td>
</tr>
<tr>
	<td>7</td>
	<td>8</td>
	<td>9</td>
	<td>*</td>
</tr>
<tr>
	<td>+/-</td>
	<td>0</td>
	<td>.</td>
	<td>/</td>
</tr>
</table>
</center>

<script type="text/javascript">
	var result="";
	var jsresult="";
	function js(){
		var events = event.srcElement.innerText;
		if("=" == events){
			if(null != result || "" != result){
				jsresult = eval(result);
				document.getElementById('jsdata').innerText = jsresult;
			}	
			return;
		}
		if("c" == events){  
			document.getElementById('jsdata').innerText = "0";
			result="";
			return;
		}

		if("0" == result){     
			result = events;
		}else{
			result += events;
		}
		document.getElementById('jsdata').innerText = result;
	}
</script>

</body>
</html>