<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
function fun(a){
	var x=document.getElementById(a).value;
	var y=document.getElementById(a).name;
	if (x!=y){
		return false;
	}
	else
	return true;
}
</script>
</head>

<body>
<c:forEach var="ui" items="${list}">
<form>
<fieldset>
<p>${ui.id} ${ui.content}</p>
<input type="hidden" id = "${ui.id}" value="${ui.answer}">
<input type="radio" name="${ui.id}" value="A" onclick="fun(${ui.id})" />A.${ui.qa}<br />
<input type="radio" name="${ui.id}" value="B" onclick="fun(${ui.id})" />B.${ui.qb}<br />
<input type="radio" name="${ui.id}" value="C" onclick="fun(${ui.id})" />C.${ui.qc}<br />
<input type="radio" name="${ui.id}" value="D" onclick="fun(${ui.id})" />D.${ui.qd}<br />
</fieldset>
</c:forEach>
</form>
</body>
</html>