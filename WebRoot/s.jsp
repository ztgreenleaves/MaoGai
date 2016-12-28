<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
		<c:forEach var="ui" items="${qwrong}" varStatus="loop">
			<fieldset>
				<p>${ui.id} ${ui.QContent} <label><font color=green>${ui.QAnswer}</font></label>
					<label><font color=red>${answerList[loop.count-1]}</font>
					</label>
				</p>
				A.${ui.QA}<br />
				B.${ui.QB}<br />
				C.${ui.QC}<br />
				D.${ui.QD}<br />
			</fieldset>
		</c:forEach>
</body>
</html>