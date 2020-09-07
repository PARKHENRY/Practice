<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<ArrayList> list = (ArrayList<ArrayList>) session.getAttribute("list");

	if(list == null) {
		list = new ArrayList<ArrayList>();
		
		session.setAttribute("list", list);
	}
	
	String bookid = request.getParameter("bookid");
	
	ArrayList book = null;
	
	for(ArrayList item : list) {
		if(bookid.equals(item.get(0))) {
			book = item;
			break;
		}
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>도서변경</h1>
	<div>
		<form method="post" action="add_apply.jsp">
			<div>
				<label>도서번호:</label>
				<input type="number" name="bookid" value="<%= book.get(0) %>" READONLY>
			</div>
			<div>
				<label>도서명:</label>
				<input type="text" name="bookname" value="<%= book.get(1) %>">
			</div>
			<div>
				<label>출판사:</label>
				<input type="text" name="publisher" value="<%= book.get(2) %>">
			</div>
			<div>
				<label>가격:</label>
				<input type="number" name="price" value="<%= book.get(3) %>">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>
		</form>
	</div>
</body>
</html>