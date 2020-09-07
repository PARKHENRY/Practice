<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<ArrayList> list = (ArrayList<ArrayList>) session.getAttribute("list");

	if(list == null) {
		list = new ArrayList<ArrayList>();
		
		session.setAttribute("list", list);
	}
	
	request.setCharacterEncoding("UTF-8");
	
	String bookid = request.getParameter("bookid");
	String bookname = request.getParameter("bookname");
	String publisher = request.getParameter("publisher");
	String price = request.getParameter("price");

	for(ArrayList item : list) {
		if(bookid.equals(item.get(0))) {

			item.set(1, bookname);
			item.set(2, publisher);
			item.set(3, price);
			
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
		변경이 완료 되었습니다. <a href="list.jsp">목록으로</a>
	</div>
</body>
</html>