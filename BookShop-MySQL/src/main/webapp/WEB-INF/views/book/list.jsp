<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
</head>
<body>
	<div>
		<div>
			<h1>도서목록</h1>
		</div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>도서번호</th>
						<th>도서명</th>
						<th>출판사</th>
						<th>가격</th>
						<th>관리</th>
					</tr>
				</thead>
				<tbody>
					<!-- 이름 베리어블    리스트 -->
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.bookid}</td>
							<td>${item.bookname}</td>
							<td>${item.publisher}</td>
							<td>${item.price}</td>
							<td><a href="${item.bookid}/delete">삭제</a> <a
								href="${item.bookid}/update">변경</a></td>
						</tr>
					</c:forEach>

					<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">등록 된 도서가 없습니다.</td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
	</div>
		<div>
		<a href="add">등록</a>
	</div>
</body>
</html>