<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	request.setCharacterEncoding("UTF-8");
	ArrayList<ArrayList> list = (ArrayList<ArrayList>) session.getAttribute("list");

	if(list == null) {
		list = new ArrayList<ArrayList>();
		
		session.setAttribute("list", list);
	}
	
	String bookid = request.getParameter("bookid");
	String bookname = request.getParameter("bookname");
	String publisher = request.getParameter("publisher");
	String price = request.getParameter("price");
	
	ArrayList item = new ArrayList();
	
	item.add(bookid);
	item.add(bookname);
	item.add(publisher);
	item.add(price);
	
	list.add(item);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>도서등록</h1>
	<div>
	등록이 완료 되었습니다. 총 <%= list.size() %> 건의 도서가 있습니다. <a href="list.jsp">목록으로</a>
	</div>
</body>
</html>