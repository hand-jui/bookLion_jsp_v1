<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/bookLion/css/welcome.css">

<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Gowun Dodum', sans-serif;
	font-family: 'Noto Sans Mono', monospace;
	height: 100%;  	
}

.form-container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;


}

fieldset {
	display: flex;
	border-style: none;
}

.button-section {
	
}

footer {
	height: 160px;
	background-color: #030;
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	color: #ccc;
	flex-direction: column;
}

footer p {
	padding: 10px 0 0 0;
}
</style>
<script type="text/javascript">
	function goJoinUsForm() {
		location.href = "joinUsForm.jsp";
	}
</script>
</head>
<body>

<div class="form-container">

	<form action="/userTest" method="post">
		<label>아이디</label> <input type="text" id="userid" name="userid"
			required="required"> <label>비밀번호</label> <input
			type="password" id="password" name="password" required="required">
		<input type="submit" value="로그인"> <input type="submit"
			value="회원가입">
	</form>

	<%
	if (session.getAttribute("userid") != null) {
	%>

	<p>
		현재 로그인 상태입니다. 사용자 아이디 :
		<%=session.getAttribute("userid")%>
	</p>


	<%
	}
	%>

</div>

	<jsp:include page="/layout/footer.jsp" />