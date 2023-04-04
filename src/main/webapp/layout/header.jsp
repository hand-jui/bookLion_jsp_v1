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
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">

<link rel="stylesheet" href="/bookLion/css/welcome.css">
</head>
<body>
	<div class="wrapper">
		<header class="header-wrap">
			<div class="service_wrap">
				<%if (id != null) { %>
				<div class="customer_service_box">
					<img src="https://cdn-icons-png.flaticon.com/512/7384/7384395.png" style="width:20px; height:20px;"><p>책사자 <b><%=name%></b></p>
					<a href="/bookLion/logout.jsp"><p>로그아웃</p></a>
					<a href="/bookLion/userInfoForm.jsp"><p>회원 정보</p></a>
				</div>
				<%} else { %>
				<div class="customer_service_box">
					<a href="/bookLion/loginForm.jsp"><p>로그인</p></a>
					<a href="/bookLion/joinUsForm.jsp"><p>회원가입</p></a>
				</div>
				<%} %>

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
							<li><a href="/bookLion/bookTest?category=new">새로나온 책</a></li>
							<li><a href="/bookLion/bookTest?category=novel">소설</a></li>
							<li><a href="/bookLion/bookTest?category=essay">에세이</a></li>
							<li><a href="/bookLion/bookTest?category=self">자기 계발</a></li>
						</ul>
					</div>
				</div>
			</div>
		</header>