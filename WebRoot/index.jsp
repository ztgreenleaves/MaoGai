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

<title>开始答题</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="./css/style.css">
<style type="text/css">
body {
	background-image: url("./img/bk2.jpg");
	background-repeat: no-repeat;
	filter: alpha(Opacity =   80);
	-moz-opacity: 0.8;
	opacity: 0.8;
	filter: alpha(Opacity =   80);
}

div {
	height: 240;
}

label {
	font-size: 20px;
	font-family: "微软雅黑";
}
</style>
</head>

<body>
	<br>
	<label>作者:张腾、郑伟</label>
	<form action="getnumber">
		<div></div>
		<a class="btn-3" href="getnumber!getsuccess"><span>开始答题</span> </a>
	</form>
</body>
</html>
