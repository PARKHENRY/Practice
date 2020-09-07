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
				<label>고객번호 : </label> <input name="custid" type="number">
			</div>
			<div>
				<label>고객명 : </label> <input name="name" type="text">
			</div>
			<div>
				<label>주소 : </label> <input name="address" type="text">
			</div>
			<div>
				<label>전화번호 : </label> <input name="phone" type="text">
			</div>
			<div>
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>