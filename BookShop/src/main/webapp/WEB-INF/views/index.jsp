<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마당서점</title>
</head>
<body>
	<div>
		<h1>마당서점</h1>
		<c:if test="${sessionScope.user != null}">
			<div>
				<a href="logout">${sessionScope.user.name} 로그아웃</a>
			</div>
		</c:if>
		<c:if test="${sessionScope.user == null}">
			<div>
				<a href="login">로그인</a>
			</div>
		</c:if>
		<ul>
			<li><a href="book/list">도서관리</a>
			<li><a href="customer/list">고객관리</a>
			<li><a href="orders/list">주문관리</a>
		</ul>
	</div>
</body>
</html>