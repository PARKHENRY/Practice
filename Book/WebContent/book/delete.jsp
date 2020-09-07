<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<ArrayList> list = (ArrayList<ArrayList>) session.getAttribute("list");

	if(list == null) {
		list = new ArrayList<ArrayList>();
		
		session.setAttribute("list", list);
	}
	
	String bookid = request.getParameter("bookid");
	
	int index = -1;
	for(ArrayList item : list) {
	if(bookid.equals(item.get(0)))
		index = list.indexOf (item);
	}
	
	if(index != -1)
		list.remove(index);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>도서 삭제</h1>
	<div>
	요청하신 도서를 삭제 하였습니다. <a href="list.jsp">목록으로</a>
	</div>
</body>
</html>