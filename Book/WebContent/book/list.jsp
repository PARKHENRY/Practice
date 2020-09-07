<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<ArrayList> list = (ArrayList<ArrayList>) session.getAttribute("list");

	if(list == null) {
		list = new ArrayList<ArrayList>();
		
		session.setAttribute("list", list);
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>도서관리</h1>
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
		<% if(list.size() > 0) {
			for(ArrayList item : list) {
			%><tr>
				<td><%= item.get(0) %></td>
				<td><%= item.get(1) %></td>
				<td><%= item.get(2) %></td>
				<td><%= item.get(3) %></td>
				<td><a href="update.jsp?bookid=<%= item.get(0) %>">변경</a> <a href="delete.jsp?bookid=<%= item.get(0) %>">삭제</a>
			</tr>
		<% }
			} else { %>
			<tr> 
				<td colspan="5">등록 된 도서가 없습니다.</td>
			</tr>
			<%}  %>
		</tbody>
	</table>
	<div>
		<a href="add.jsp">등록</a>
	</div>
</body>
</html>