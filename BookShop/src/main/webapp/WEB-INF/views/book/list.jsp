<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>북샵</title>

<style>
* {
text-decoration: none;
}
	.active {
	background-color: red;
	display: inline-block;
	}
	div > a  {
	display: inline-block;
	}
</style>

</head>
<body>
	<div>
	<div>
	<!-- get은 기본값이라 안써줘도되고 액션도 안써줘도됨 자기자신 같은 url로 보낼거라서 -->
		<form method="get" action="">
			<span>
				<select name="search">
					<option value="0">선택</option>
					<option value="1" ${pager.search == 1 ? 'selected' : ''}>도서번호</option>
					<option value="2" ${pager.search == 2 ? 'selected' : ''}>도서명</option>
					<option value="3" ${pager.search == 3 ? 'selected' : ''}>출판사</option>
					<option value="4" ${pager.search == 4 ? 'selected' : ''}>가격</option>
				</select>
			</span>	
			<span>
				<input type="text" name="keyword" placeholder="검색어를 입력해 주세요." 
				value="${pager.keyword}">
			</span>
			<span>
				<input type="submit" value="검색">
			</span>
		</form>
	</div>
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
			</tbody>
		</table>
		<div>
		<div><a href="?page=1&${pager.query}">처음</a></div>
		<div><a href="?page=${pager.prev}&${pager.query}">이전</a></div>
		<ul>
			<c:forEach var="page" items="${pager.list}">
				<li class="${page == pager.page ? 'active' : ' '}"><a href="?page=${page}&${pager.query}">${page}</a></li>
			</c:forEach>
			</ul>
			<div><a href="?page=${pager.next}&${pager.query}">다음</a></div>
			<div><a href="?page=${pager.last}&${pager.query}">마지막</a></div>
		</div>
	</div>
	<div>
		<a href="add">등록</a>
	</div>
	<div>
		<a href="dummy">대량등록</a>
	</div>
	<div>
		<a href="init">초기화</a>
	</div>
</body>
</html>