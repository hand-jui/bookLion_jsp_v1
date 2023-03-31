<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&family=Noto+Sans+Mono:wght@600&display=swap"
	rel="stylesheet">
<style>
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

.form-class {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

h1 {
	padding: 50px;
}

form {
	display: flex;
	flex-direction: column;

}

form div {
	display: flex;
	flex-direction: column;
	padding: 50px;

}

form div label {

	padding: 5px;
	

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
</head>
<body>
<div class="form-class">
	<h1>join</h1>
	<form action="/bookLion/userTest?action=insert" method="post">
		<div class="basic-info">
			<label for="userid">아이디</label>
			<input type="text" id="userid" name="userid" placeholder="아이디를 입력해주세요">
			<label for="password">비밀번호</label>
			<input type="password" id="password" name="password" placeholder="비밀번호를 입력해주세요">
			<label for="username">이름</label>
			<input type="text" id="username" name="username" placeholder="이름을 입력해주세요">
			<label for="address">주소</label>
			<input type="text" id="address" name="address" placeholder="주소를 입력해주세요">
			<label for="phone">전화번호</label>
			<input type="text" id="phone" name="phone" placeholder="전화번호를 입력해주세요">
			<label for="email">이메일</label>
			<input type="email" id="email" name="email" placeholder="이메일을 입력해주세요">
		</div>
		<div class="add-info">
			<label for="birth">생일</label> <input type="date" id="birth"
				name="birth"> <br> <label for="account">계좌</label> <input
				type="text" id="account" name="account" placeholder="환불 계좌">
		</div>

		<input type="submit" value="회원가입">

	</form>
	</div>
	<jsp:include page="/layout/footer.jsp" />