<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>100题</title>
<script type="text/javascript">
	var tips; 
	var theTop = 250/*这是默认高度*/; 
	var old = theTop;
	function initFloatTips() {
	  tips = document.getElementById('floatTips');
	  moveTips();
	};
	function moveTips() {
	  var tt=50;
	  if (window.innerHeight) {
	    pos = window.pageYOffset
	  }
	  else if (document.documentElement && document.documentElement.scrollTop) {
	    pos = document.documentElement.scrollTop
	  }
	  else if (document.body) {
	    pos = document.body.scrollTop;
	  }
	  pos=pos-tips.offsetTop+theTop;
	  pos=tips.offsetTop+pos/10;
	  if (pos < theTop) pos = theTop;
	  if (pos != old) {
	    tips.style.top = pos+"px";
	    tt=10;
	  }
	  old = pos;
	  setTimeout(moveTips,tt);
	}
	function validateAnswer() {
		var value = "";
		var length = 100;
		var grade = 0;
		for (var i = 0; i<length;i++){
			var ans = document.getElementById(i+1).value;
			var choice = getChicked(i+1);
			if (choice == "E"){
				alert("第"+(i+1)+"题没做!");
				return false;
			}
			value=value+","+choice;
			if (choice == ans)
				grade = grade + 1;
		}
		document.getElementById("str").value = value;
		document.getElementById("grade").value = grade;
		document.getElementById("questionForm").action="getnumber!toOtherPage";
		document.getElementById("questionForm").submit();
		
	}
	function getChicked(name) {
		var radio = document.getElementsByName(name);
		var value="";
		for ( var i = 0; i < radio.length; i++) {
			if (radio[i].checked == true) {
				value = value+getAlphabet(i+1);	
			}
			if (i==radio.length-1&&value!=""){
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
	
	
	var t = 50*60;
			function GetRTime() {
				if (t != 0)		
					t=t-1;
				else
					t=0;
			
				var m = 0;
				var s = 0;
				if (t >= 0) {
					m = Math.floor(t / 60 % 60);
					s = Math.floor(t  % 60);
				}

				document.getElementById("t_m").innerHTML = m + "分";
				document.getElementById("t_s").innerHTML = s + "秒";
			}
			setInterval(GetRTime, 1000);
</script>
<style type="text/css">
div#floatTips {
	position: absolute;
	border: solid 1px #777;
	padding: 3px;
	top: 250px;
	width: 150px;
	background: #333;
	color: white;
	opacity: 0.5; /*这两句没法通过验证的。。。*/
	filter: alpha(opacity =                           50);
	/*这两句没法通过验证的。。。*/
}

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
	filter: alpha(Opacity =                               50);
	-moz-opacity: 0.5;
	background: #000;
	padding: 5px;
	color: #F00;
	filter: alpha(Opacity =                           40);
	-moz-opacity: 0.2;
	opacity: 0.6;
	color: white;
}

.box {
	margin: 0 auto;
	width: 800px;
}

.btn-wrap {
	text-align: center;
	margin: 50px;
}

.btn {
	position: relative;
	display: inline-block;
	line-height: 25px;
	padding: 5px 15px;
	margin: 10px;
	transition: all .3s ease-out;
	text-transform: uppercase;
	border-radius: 5px;
	border: 1px solid #1e639a;
	color: #fff;
	font-weight: bold;
	cursor: pointer;
	text-shadow: 0 1px 2px rgba(0, 0, 0, .4);
	box-shadow: inset 1px 0 0 #559ad5, inset -1px 0 0 #559ad5, inset 0 1px 0
		#559ad5, inset 0 -1px 0 #559ad5, 0 0 1px rgba(0, 0, 0, 0.5);
	background: #4086c2; /* Old browsers */
	background: -*-linear-gradient(to bottom, #4086c2 0%, #2989d8 100%, #3378b1 100%);
}

.btn:hover {
	background: #3378b1; /* Old browsers */
	background: -*-linear-gradient(to bottom, #3378b1 0%, #2989d8 0%, #4086c2 100%);
}

.btn:active:after {
	content: "";
	display: block;
	width: 2px;
	height: 2px;
	position: absolute;
	border-radius: 2px;
	top: 50%;
	left: 50%;
	margin: -1px 0 0 -1px;
	z-index: 2;
	background: rgba(255, 255, 255, 1);
	box-shadow: 0 0 10px 5px rgba(255, 255, 255, 0.5), 0 0 20px 10px
		rgba(255, 255, 255, 0.5), 0 0 30px 15px rgba(255, 255, 255, 0.4), 0 0
		40px 20px rgba(255, 255, 255, 0.3), 0 0 50px 25px
		rgba(255, 255, 255, 0.3), 0 0 60px 30px rgba(255, 255, 255, 0.3), 0 0
		70px 35px rgba(255, 255, 255, 0.3);
}
&
#8203













 






;
</style>
</head>

<body onload="initFloatTips()">
	<div id="floatTips">
		<div class="time">
			剩余时间:<span id="t_m">50分</span> <span id="t_s">00秒</span>
		</div>
	</div>
	<form id="questionForm" action="getnumber!toOtherPage" method="post">
		<div class="box">
			<label>单选:</label>
			<c:forEach var="ui" items="${list}" varStatus="status">

				<fieldset>

					<p>${status.count} :${ui.QContent}</p>
					<input type="hidden" id="${status.count}" value="${ui.QAnswer}">
					<input type="radio" name="${status.count}" value="A" />A.${ui.QA}<br />
					<input type="radio" name="${status.count}" value="B" />B.${ui.QB}<br />
					<input type="radio" name="${status.count}" value="C" />C.${ui.QC}<br />
					<input type="radio" name="${status.count}" value="D" />D.${ui.QD}<br />

				</fieldset>

			</c:forEach>
			<label>多选:</label><br />
			<c:forEach var="vi" items="${dxlist}" varStatus="statu">
				<div class="box">
					<fieldset>
						<p>${statu.count+80} :${vi.QContent}</p>
						<input type="hidden" id="${statu.count+80}" value="${vi.QAnswer}">
						<input type="checkbox" name="${statu.count+80}" value="A" />A.${vi.QA}<br />
						<input type="checkbox" name="${statu.count+80}" value="B" />B.${vi.QB}<br />
						<input type="checkbox" name="${statu.count+80}" value="C" />C.${vi.QC}<br />
						<input type="checkbox" name="${statu.count+80}" value="D" />D.${vi.QD}<br />
					</fieldset>
				</div>
			</c:forEach>
			<input type="hidden" id="str" name="answerStr"> <input
				type="hidden" id="grade" name="answerGrade"> <input
				type="button" class="btn" value="提交" onclick="validateAnswer();">
		</div>

	</form>

</body>
</html>