<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
	function fun(a) {
		var x = document.getElementById(a).value;
		var y = document.getElementById(a).name;
		if (x != y) {
			return false;
		} else
			return true;
	}
</script>
</head>

<body>

	<form>
		<c:forEach var="ui" items="${list}">
			<fieldset>
				<p>${ui.id} ${ui.QContent}</p>
				<input type="hidden" id="${ui.id}" value="${ui.QAnswer}"> <input
					type="radio" name="${ui.id}" value="A" />A.${ui.QA}<br /> <input
					type="radio" name="${ui.id}" value="B" />B.${ui.QB}<br /> <input
					type="radio" name="${ui.id}" value="C" />C.${ui.QC}<br /> <input
					type="radio" name="${ui.id}" value="D" />D.${ui.QD}<br />
			</fieldset>
		</c:forEach>
	</form>
</body>
</html>