<%@ page import="com.jui.bookLion.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
	
	책 확인하기
	
	</h1>
	<table>
		<tr>
			<th>일련번호</th>
			<th>카테고리</th>
			<th>제목</th>
			<th>작가</th>
			<th>출판사</th>
			<th>출판일</th>
			<th>가격</th>
			<th>판매부수</th>
			<th>재고</th>
		</tr>
		
		<c:forEach var="booklist" items="${list}">
			<tr>
				<td>${booklist.id}</td>
				<td>${booklist.category}</td>
				<td>${booklist.title}</td>
				<td>${booklist.author}</td>
				<td>${booklist.publisher}</td>
				<td>${booklist.pubdate}</td>
				<td>${booklist.price}</td>
				<td>${booklist.sale}</td>
				<td>${booklist.quantity}</td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>