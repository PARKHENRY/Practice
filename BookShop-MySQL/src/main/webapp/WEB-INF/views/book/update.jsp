<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<!-- 액션에 아무것도 안쓰는이유는 현재내가 쓰고있는 주소랑 똑같은주소를 쓰겠다는거 -->
		<form method="post" action="">
			<div>
				<label>도서번호</label> <input name="bookid" type="number" value="${item.bookid}" readonly>
			</div>
			<div>
				<label>도서명</label> <input name="bookname" type="text" value="${item.bookname}" >
			</div>
			<div>
				<label>출판사</label> <input name="publisher" type="text" value="${item.publisher}" >
			</div>
			<div>
				<label>가격</label> <input name="price" type="number" value="${item.price}" >
			</div>
			<div>
				<input type="submit" value="변경">
			</div>
		</form>
	</div>
</body>
</html>