<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&family=Noto+Sans+Mono:wght@600&display=swap"
	rel="stylesheet">
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

.login-container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

h1 {
	padding: 50px;
	display: flex;
	flex-direction: column;
	align-items: center;
}

.form-container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: flex-end;
	padding: 30px;
}

.form-container label {
	margin: 10px;
}

.btn-wrap {
	display: flex;
	margin: 0 30px;
	align-items: center;
	justify-content: center;
}

.btn-wrap input{
	padding: 10px;
}

input[type="text"], input[type="password"], input[type="submit"] {
	padding: 8px;
	border-radius: 5px;
	border: 1px solid #ccc;
	margin-bottom: 10px;
}

input[type=submit] {
	background-color: #030;
	color : #fff;
	border: none;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #063812;
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
	<div class="login-container">
		<h1>LogIn</h1>
			<form action="/bookLion/userTest?action=select" method="post">
			<div class="form-container">
				<label> 아이디 &nbsp; <input type="text" id="userid" name="userid" required="required"></label>
				<label> 비밀번호 &nbsp; <input type="password" id="password" name="password" required="required"></label>
			</div>
			<div class="btn-wrap">
				<input type="submit" value="로그인">
				<input type="submit" value="회원가입" onclick="goJoinUsForm()">
			</div>
			</form>

			<%if (session.getAttribute("userid") != null) { %>
			<p>
				현재 로그인 상태입니다. 사용자 아이디 :
				<%=session.getAttribute("userid")%>
			</p>
			<%} %>
		</div>
	<jsp:include page="/layout/footer.jsp" />