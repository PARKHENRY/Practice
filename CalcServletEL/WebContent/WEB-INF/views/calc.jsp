<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 계산기 EL</title>
</head>
<body>

	<div>
		<form action="" method="post">
			<input type="nember" name="left"> <select name="op">
				<option value="pls">더하기</option>
				<option value="min">빼기</option>
				<option value="mul">곱하기</option>
				<option value="div">나누기</option>
			</select> <input type="number" name="right"> <input type="submit"
				value="확인">
		</form>
	</div>

</body>
</html>