<%@ page import="com.jui.bookLion.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
// 세션을 꺼내는 방법 확인
String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");
String password = (String) session.getAttribute("password");
String phone = (String) session.getAttribute("phone");
String email = (String) session.getAttribute("email");
if (id == null) {
	response.sendRedirect("loginForm.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<link rel="shortcut icon" sizes="76x76" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/7384/7384395.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Gowun Dodum', sans-serif;
	flex-direction: column;
	height: 100%;
}

.wrap {
	margin: 0;
	padding: 0;
	display: flex;
	align-items: center;
	min-height: 100%;
	position: relative;
	padding-bottom: 160px;
	flex-direction: column;
}



header {
	flex: 1 0 160px;
	display: flex;
	flex-direction: column;
	align-items: center;
	margin: 0;
	padding: 20px 20px;
}

.service-wrap {
	display: flex;
	flex-direction: column;
	align-items: flex-end;

}

.service-wrap .user-service {
	display: flex;
	align-items: flex-end;
	flex-direction: column;

}

header .header-inner {
	padding: 5px 0;
	width: 100px;
}

.content {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding-bottom: 160px;
}

h1 {
	padding: 50px;
	display: flex;
	flex-direction: column;
	align-items: center;
}

.content form {
	display: flex;
	flex-direction: column;
}

form .user-info {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: flex-end;
	padding: 30px;
}

.user-info label {
	margin: 10px;
}

footer {
	/* footer를 aside위에 올리기 위해 사용(부유객체) */
	position: absolute;
	width: 100%;
	line-height: 60px;
	color: #ccc;
	background-color: #030;
	justify-content: center;
	align-items: center;
	text-align: center;
	flex-direction: column;
	bottom: 0;
}
</style>
</head>
<body>
	<div class="wrap">
		<header>
			<div class="service-wrap">
				<div class="user-service">
					<p>책사자 <b><%=name%></b></p>
					<a href="/bookLion/logout.jsp"><p>로그아웃</p></a>
				</div>
				<div class="header-inner">
					<div class="logo_box">
						<a href="/bookLion/welcome.jsp"><img alt="" src="image/main.jpg"></a>
					</div>
				</div>
			</div>
		</header>
		<div class="content">
			<section>
				<h1>회원 정보</h1>
				<form action="/bookLion/userTest?action=update" method="post">
					<div class="user-info">
						
						<label for="username">이름 <input type="text" name="name" value="<%=name%>" readonly="readonly"></label>
						<label for="userid">아이디 <input type="text"  name="id" value="<%=id%>" readonly="readonly"></label>
						<label for="password">비밀번호 <input type="password" name="password" value="<%=password%>"></label>
						<label for="phone">전화번호 <input type="text" name="phone" value="<%=phone%>"></label>
						<label for="email">이메일 <input type="email" name="email" value="<%=email%>"></label>
						
					</div>
					<input type="submit" value="수정">
				</form>
			</section>
		</div>
		<footer>
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