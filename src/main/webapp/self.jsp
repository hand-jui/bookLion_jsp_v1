<%@ page import="com.jui.bookLion.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="/layout/header.jsp" />

<section class="section_wrap">
	<div class="content_container">
		<div class="content">
			<c:forEach var="booklist" items="${list}">
				<div class="book_info">
					<div class="img_wrap">
						<img src="image/${booklist.img}.jpg">
					</div>
					<div class="book_info_wrap">
						<div class="title"><b>${booklist.title}</b></div>
						<div class="info"><b>${booklist.author}</b> · ${booklist.publisher} · ${booklist.pubdate}</div>
						<div class="price"><b>${booklist.price}</b> 원</div>
						<div class="order_wrap">
							<a href="#">
								<img alt="구매하기" src="https://cdn-icons-png.flaticon.com/128/8447/8447133.png" style="width:50px; height:50px;">
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</section>

<jsp:include page="/layout/footer.jsp" />