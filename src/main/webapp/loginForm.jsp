<%@page import="com.jui.bookLion.dto.UserDTO"%>
<%@page import="com.jui.bookLion.repository.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String email = request.getParameter("email");
UserDAO dao = new UserDAO(); 
UserDTO dto = dao.logIn(id, password);

if(id != null && password != null) {
	if(id.equals(dto.getId()) && password.equals(dto.getPassword())){
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		session.setAttribute("name", name);
		session.setAttribute("phone", phone);
		session.setAttribute("email", email);
		response.sendRedirect("/bookLion/userTest");
	} else {
		out.println("<script>alert('로그인에 실패했습니다.'); history.back(); </script>");
	}
}
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="shortcut icon" sizes="76x76" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/7384/7384395.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/bookLion/css/noHeader.css"> 
<script type="text/javascript">
	function goJoinUsForm() {
		location.href = "joinUsForm.jsp";
	}
</script>
</head>
<body>
	<div class="form-container">
		<h1>LogIn</h1>
		<form action="/bookLion/userTest?action=select" method="post">
			<div class="info-wrap">
				<label> 아이디 &nbsp; <input type="text" id="id" name="id" required="required"></label>
				<label> 비밀번호 &nbsp; <input type="password" id="password" name="password" required="required"></label>
			</div>
			<div class="btn-wrap">
				<input type="submit" value="로그인">
				<input type="submit" value="회원가입" onclick="goJoinUsForm()">
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