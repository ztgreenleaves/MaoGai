<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
        function Href() {
            var divDisp = document.getElementById("di").style.display;
            if (divDisp == "block") {
                document.getElementById("di").style.display = "none";
            } else {
                document.getElementById("di").style.display = "block";
            }
        }
    </script>
<style type="text/css">
body {
	background-image: url("./img/bk3.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: "宋体";
	text-align: left;
}

label {
	font-size: 20px;
	font-family: "微软雅黑";
}

fieldset {
	width: 800;
	margin: 5 0;
	background: #000;
	padding: 5px;
	color: #F00;
	filter: alpha(Opacity =                 50);
	-moz-opacity: 0.5;
	background: #000;
	padding: 5px;
	color: #F00;
	filter: alpha(Opacity =             40);
	-moz-opacity: 0.2;
	opacity: 0.6;
	color: white;
}

.box {
	margin: 0 auto;
	width: 800px;
}

.grade {
	font-size: 60;
	color: red;
}
.donate{
	text-decoration: none;
	font-family: "楷体";
	font-size: 20;
}
.donate:hover{
	color: red;
}
#tip{
	font-family: "微软雅黑";
	font-size: 14;
}
#cuoti{
	text-decoration: none;
	font-family: "微软雅黑";
	color: silver;
}
#cuoti:hover{
	color:black;
}
</style>
</head>

<body>

	<div class="box">
		<label>分数:</label>&nbsp;&nbsp;<span class="grade">${answerGrade}</span><br> <a
			href="donate.jsp" class="donate">打赏作者个鸡腿&lt;--点我</a>
			<p id="tip">提示:绿色为正确答案，红色为错误答案</p>
			<a id="cuoti"onclick="javacript:Href()" href="#">显示/关闭错题</a>
<div id="di" style="display: none">
		<c:forEach var="ui" items="${qwrong}" varStatus="loop">
			<fieldset>
				<p>
					${ui.QContent}<label><font color=green>${ui.QAnswer}</font>
					</label> <label><font color=red>${answerList[loop.count-1]}</font>
					</label>
				</p>
				A.${ui.QA}<br /> B.${ui.QB}<br /> C.${ui.QC}<br /> D.${ui.QD}<br />
			</fieldset>
		</c:forEach>
		多选： <br />
		<c:forEach var="vi" items="${dwrong}" varStatus="loop">
			<fieldset>
				<p>
					${vi.id} ${vi.QContent} <label><font color=green>${vi.QAnswer}</font>
					</label> <label><font color=red>${dxanswerList[loop.count-1]}</font>
					</label>
				</p>
				A.${vi.QA}<br /> B.${vi.QB}<br /> C.${vi.QC}<br /> D.${vi.QD}<br />
			</fieldset>
		</c:forEach>
		</div>
	</div>
</body>
</html>