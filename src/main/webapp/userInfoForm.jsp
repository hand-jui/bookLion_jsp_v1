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
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.header_wrap {
	width: 100%;
	margin: 0;
	padding: 20px 0;
}

.service_wrap {
	display: flex;
	flex-direction: column;
	text-align: right;
	align-items: flex-end;
	padding-right: 50px;
}

.name_tag {
	display: flex;
	flex-direction: row;
}

.customer_service_box a {
	display: flex;
	flex-direction: column;
	justify-content: flex-end;
	align-items: flex-end;
	text-decoration: none;
	color: black;
}

.header_inner {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding: 10px;
}

.section_wrap {
	width: 100%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.content_container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding-bottom: 80px;
}

h1 {
	padding: 30px;
}

form {
	display: flex;
	flex-direction: column;
}

.user_info {
	display: flex;
	flex-direction: column;
	align-items: flex-end;
	justify-content: flex-end;
}

.user_info label {
	margin: 10px;
}


input[type="text"], input[type="password"], [type="tel"], input[type="submit"], input[type="email"]
	{
	padding: 8px;
	border-radius: 5px;
	border: 1px solid #ccc;
	margin-bottom: 10px;
}

input[type=submit] {
	margin: 10px;
	background-color: #030;
	color: #fff;
	border: none;
	cursor: pointer;
}

.form-container input[type=submit]:hover {
	background-color: #298421;
}

.footer_wrap {
	background-color: #030;
	color: #fff;
	display: flex;
	align-items: center;
	text-align: center;
	justify-content: center;
	width: 100%;
	height: 160px;
}

.footer_content_wrap p {
	margin: 10px;
}
</style>
</head>
<body>
	<header class="header_wrap">
		<div class="service_wrap">
				<div class="customer_service_box">
					<div class="name_tag">
						<img src="https://cdn-icons-png.flaticon.com/512/7384/7384395.png" style="width:20px; height:20px;">
						&nbsp; 책사자 &nbsp; <b><%=name%></b>
					</div>
					<a href="/bookLion/logout.jsp"><p>로그아웃</p></a>
				</div>
		</div>
		<div class="header_inner">
			<div class="logo_box">
				<a href="/bookLion/welcome.jsp">
					<img alt="" src="image/main.jpg" style="width: 800px;">
				</a>
			</div>
		</div>
	</header>	
	
	<section class="section_wrap">
		<div class="content_container">
			<h1>회원 정보</h1>
			<form action="/bookLion/userTest?action=update" method="post">
				<div class="user_info">
						
					<label for="username">이름 &nbsp; &nbsp; <input type="text" name="name" value="<%=name%>" readonly="readonly"></label>
					<label for="userid">아이디 &nbsp;  <input type="text"  name="id" value="<%=id%>" readonly="readonly"></label>
					<label for="password">비밀번호 <input type="password" name="password" value="<%=password%>"></label>
					<label for="phone">전화번호 <input type="text" name="phone" value="<%=phone%>"></label>
					<label for="email">이메일 &nbsp; <input type="email" name="email" value="<%=email%>"></label>
						
				</div>
				<input type="submit" value="수정">
			</form>
		</div>
	</section>
	
	
<jsp:include page="/layout/footer.jsp" />