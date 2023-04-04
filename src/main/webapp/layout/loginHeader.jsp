<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 세션을 꺼내는 방법 확인
String id = (String) session.getAttribute("id");
String name = (String) session.getAttribute("name");
if (id == null) {
	response.sendRedirect("loginForm.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책사자 얘두라</title>
<link rel="shortcut icon" sizes="76x76" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/7384/7384395.png">
<link rel="stylesheet" href="/bookLion/css/welcome.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
	<div class="wrapper">
		<header class="header-wrap">
			<div class="service_wrap">
				<div class="customer_service_box">
					<p>책사자 <b><%=name %></b>
					<a href="/bookLion/logout.jsp"><p>로그아웃</p></a>
					<a href="/bookLion/userInfoForm.jsp">회원 정보</a>
				</div>
			</div>
			<div class="header_inner">
				<div class="logo_box">
					<a href="/bookLion/welcome.jsp">
					<img alt="" src="image/main.jpg">
					</a>
				</div>
				<div class="header-bottom">
					<div class="menu">
						<ul>
							<li><a href="/bookLion/new.jsp">새로나온 책</a></li>
							<li><a href="/bookLion/novel.jsp">소설</a></li>
							<li><a href="/bookLion/essay.jsp">에세이</a></li>
							<li><a href="/bookLion/self.jsp">교육 교재</a></li>
						</ul>
					</div>
				</div>
			</div>
		</header>