<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<div>
		<c:choose>
			<c:when test="${list.size() > 0}">
				<c:forEach var="item" items="${list}">
					<tr>
						<td>${item.bookid}</td>
						<td>${item.bookname}</td>
						<td>${item.publisher}</td>
						<td>${item.price}</td>
						<td><a href="update?bookid=${item.bookid}">변경</a> <a
							href="delete?bookid=${item.bookid}">삭제</a></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">등록 된 도서가 없습니다</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>