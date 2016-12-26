<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

<body>
	<table border="0" width="330">
	<tr>
				
				<th></th>
			</tr>
		<c:forEach var="ui" items="${list}">
			<tr>
				<td>${ui.id} ${ui.content}</td>
			</tr>

			<tr>
			<td><input type = "radio" name="${ui.id}radio">${ui.qa}</td>
			</tr>
			
			<tr>
			<td><input type = "radio" name="${ui.id}radio">${ui.qb}</td>
			</tr>
			
			<tr>
			<td><input type = "radio" name="${ui.id}radio">${ui.qc}</td>
			</tr>
			
			<tr>
			<td><input type = "radio" name="${ui.id}radio">${ui.qd}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>