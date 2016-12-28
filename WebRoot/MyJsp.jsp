<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
	function validateAnswer() {
		var value = "";
		var length = ${t};
		for (var i = 0; i<length;i++){
			value=value+","+getChicked(i+1);
		}
		document.getElementById("str").value = value;
		alert(value);
		document.getElementById("questionForm").action="getnumber!toOtherPage";
		document.getElementById("questionForm").submit();
		
	}
	function getChicked(name) {
		var radio = document.getElementsByName(name);
		var value;
		for ( var i = 0; i < radio.length; i++) {
			if (radio[i].checked == true) {
				value = getAlphabet(i+1);
				break;
			}
		}
		if (i==radio.length){
			return "E";
		}
		else{
			return value;
		}
		
	}
	function getAlphabet(i){
		if (i==1)
			return "A";
		if (i==2)
			return "B";
		if (i==3)
			return "C";
		if (i==4)
			return "D";
		if (i==5)
			return "E";
	}
</script>
</head>

<body>
	<form id="questionForm" action="getnumber!toOtherPage" method="post">
		<c:forEach var="ui" items="${list}" varStatus="status">
			<fieldset>
				<p>${status.count} :${ui.id} ${ui.QContent}</p>
				<input type="hidden" id="${status.count}" value="${ui.QAnswer}">
				<input type="radio" name="${status.count}" value="A" />A.${ui.QA}<br />
				<input type="radio" name="${status.count}" value="B" />B.${ui.QB}<br />
				<input type="radio" name="${status.count}" value="C" />C.${ui.QC}<br />
				<input type="radio" name="${status.count}" value="D" />D.${ui.QD}<br />
			</fieldset>
		</c:forEach>
		<input type="hidden" id="str" name="answerStr"> <input
			type="button" value="提交" onclick="validateAnswer();">
	</form>
</body>
</html>