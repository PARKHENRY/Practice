<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 계산기 EL</title>
</head>
<body>

	<div>
		<label>좌향:</label>${param.left}
		<label>연산자:</label>${param.op}
		<label>우향:</label>${param.right}
		<label>연산결과:</label>${result}
	</div>
	<div>
	<a href="CalcServlet">처음으로</a>
	</div>

</body>
</html>