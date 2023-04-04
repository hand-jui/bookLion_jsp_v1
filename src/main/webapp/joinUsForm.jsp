<%@page import="com.jui.bookLion.dto.UserDTO"%>
<%@page import="com.jui.bookLion.repository.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="shortcut icon" sizes="76x76" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/7384/7384395.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/bookLion/css/noHeader.css"> 
<script type="text/javascript">
	function goWelcome() {
		location.href = "welcome.jsp";
	}
</script>
</head>
<body>
	<div class="form-container">
		<h1>join</h1>
		<form action="/bookLion/userTest?action=insert" method="post" >
			<div class="info-wrap">
				<label for="name">이름 &nbsp; <input type="text" id="name" name="name" placeholder="이름을 입력해주세요"></label>
				<label for="id">아이디 &nbsp; <input type="text" id="id" name="id" placeholder="아이디를 입력해주세요"></label>
				<label for="password">비밀번호 &nbsp; <input type="password" id="password" name="password" placeholder="비밀번호를 입력해주세요"></label>
				<label for="phone">전화번호 &nbsp; <input type="tel" id="phone" name="phone" placeholder="전화번호를 입력해주세요"></label>
				<label for="email">이메일 &nbsp; <input type="email" id="email" name="email" placeholder="이메일을 입력해주세요"></label>
			</div>
			<div class="btn-wrap">
				<input type="submit" value="회원가입">
				<input type="submit" value="취소" onclick="goWelcome()">
			</div>
		</form>
	</div>
	<div class="footer">
		<footer class="footer-wrap">
			<div class="footer-inner">
				<div class="footer-content-wrap">
					<address class="footer-info">
						<p>부산 부산진구 중앙대로 749</p>
						<p>jLion86@bookLion.com</p>
					</address>
				</div>
				<div class="copyright">
					<p>ⓒ BookLion. All rights reserved.</p>
				</div>
			</div>

		</footer>
	</div>

</body>
</html>
