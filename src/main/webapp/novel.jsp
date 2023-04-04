<%@ page import="com.jui.bookLion.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<jsp:include page="/layout/header.jsp" />

<style>
.flex-item-child{
	flex-wrap: wrap;
}
.book-info{
	display:flex;
	width: 20vw;
}
.book-info-wrap{
	display: flex;
	flex-direction: column;
	justify-content: center;
}
</style>
<section>
	<div class="flex-container">
		<div class="flex-item">
			<div class="flex-item-child">

				<c:forEach var="booklist" items="${list}">


					<div class="book-info">
						<div class="img-wrap">
							<img src ="image/${booklist.img}.jpg">
						</div>
						
						<div class="book-info-wrap">
							<div class="title">${booklist.title}</div>
							<div class="info">${booklist.author} · ${booklist.publisher} · ${booklist.pubdate}</div>
							<div class="price">${booklist.price}</div>
						</div>
					</div>





				</c:forEach>


			</div>
		</div>
	</div>
</section>








<jsp:include page="/layout/footer.jsp" />