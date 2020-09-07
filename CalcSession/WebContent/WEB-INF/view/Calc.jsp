<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
* {
	font-size : 30px;
	text-decoration: none;
	color : white;
}
#display {
	height : 50px;
	line-height : 50px;
	background-color : black;
	text-align : right;
	width : 96%;
	border-radius : 5px;
	margin-bottom : 5px;
	padding-right : 20px;
	}
	
	span {
	height : 50px;
	line-height : 50px;
	background-color : gray;
	width : 24%;
	display : inline-block;
	text-align : center;
	border-radius : 5px;
	margin-bottom : 5px;
	}
</style>
</head>
<body>

	<div>
	<div id="display">${display}</div>
	<div>
	<span><a href="?button=7">7</a></span>
	<span><a href="?button=8">8</a></span>
	<span><a href="?button=9">9</a></span>
	<span><a href="?button=div">/</a></span>
	</div>
	<div>
	<span><a href="?button=4">4</a></span>
	<span><a href="?button=5">5</a></span>
	<span><a href="?button=6">6</a></span>
	<span><a href="?button=mul">*</a></span>
	</div>
	<div>
	<span><a href="?button=1">1</a></span>
	<span><a href="?button=2">2</a></span>
	<span><a href="?button=3">3</a></span>
	<span><a href="?button=min">-</a></span>
	</div>
	<div>
	<span><a href="?button=0">0</a></span>
	<span><a href="?button=clear">C</a></span>
	<span><a href="?button=calc">=</a></span>
	<span><a href="?button=pls">+</a></span>
	</div>
	</div>

</body>
</html>