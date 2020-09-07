<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 계산기</title>
</head>
<body>

	<div>
	<form method="post" action="">
	<input type="number" name="left">
	<select name="op">
	<option value="pls">+</option>
	<option value="min">-</option>
	<option value="mul">*</option>
	<option value="div">/</option>
	</select>
	<input type="number" name="right">
	<input type="submit" value="확인">
	</form>
	</div>

</body>
</html>