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

<title>鸡腿鸡腿鸡腿</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
p {
	font-size: 20px;
	font-family: "微软雅黑";
}

.box {
	margin: 0 auto;
	width: 800px;
}
</style>
</head>
<body>
	
	<div class="box">
		<p>
			给作者加个鸡腿吧！<br> 谢谢！
		</p>
		<div>
			<img alt="支付宝" src="./img/AliPay.JPG">
		</div>
	</div>
</body>
</html>
