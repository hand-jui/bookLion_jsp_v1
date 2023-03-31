<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: content-box;
}

body {
	height: 100vh;
}

.flex-container {
	height: 100%;
	display: flex;
}

.flex-item {
	flex: 1;
	flex-direction: column;
	display: flex;
}

.flex-item-child {
	margin: 100px;
	padding: 10px;
	width: 100px;
	height: 100px;
	background-color: black;
	color: white;
	flex: 1;
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>
</head>
<body>
	<div class="flex-container">
		<div class="flex-item">
			<div class="flex-item-child">c-item1</div>
			<div class="flex-item-child">c-item2</div>
			<div class="flex-item-child">c-item3</div>
		</div>
		<div class="flex-item">
			<div class="flex-item-child">c-item4</div>
			<div class="flex-item-child">c-item5</div>
			<div class="flex-item-child">c-item6</div>
		</div>
		<div class="flex-item">
			<div class="flex-item-child">c-item7</div>
			<div class="flex-item-child">c-item8</div>
			<div class="flex-item-child">c-item9</div>
		</div>
	</div>
</body>
</html>