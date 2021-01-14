<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보 입력</title>
<style type="text/css">
table{
	border-collapse:collapse;
	width:500px;
}
tr,td{
	border:1px solid black;
	padding:5px;
	text-align:center;
}
.submit{
	position:relative;
}
</style>
</head>
<body>
<h1>상품정보 입력</h1>
<form method="post" action="itemWrite.jsp">
<table>
	<tr>
		<td><h5>상품명</h5></td>
		<td><input type="text" name="name" id="name"></td>
	</tr>
	<tr>
		<td><h5>가격</h5></td>
		<td><input type="text" name="price" id="price"></td>
	</tr>
	<tr>
		<td><h5>내용</h5></td>
		<td><textarea cols="30" rows="10" name="content" id="content"></textarea></td>
	</tr>
</table>
<br>
<input type="submit" value="추가" class="submit">
</form>
</body>
</html>