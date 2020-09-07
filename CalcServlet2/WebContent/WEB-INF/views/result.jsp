<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String left = (String) request.getAttribute("left");
	String op = (String) request.getAttribute("op");
	String right = (String) request.getAttribute("right");
	
	int result = (int) request.getAttribute("result");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>

	<div>
		<div>
			<label>좌향:</label>
			<p><%=left%></p>
		</div>
		<div>
			<label>연산자:</label>
			<p><%=op%></p>
		</div>
		<div>
			<label>우향:</label>
			<p><%=right%></p>
		</div>
		<div>
			<label>결과:</label>
			<p><%=result %></p>
		</div>
	</div>
	<div>
	<a href="CalcServlet">처음으로</a>
	</div>

</body>
</html>