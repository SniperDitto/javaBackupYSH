<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
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
<h1>게시판 글 작성</h1>
<form method="post" action="boardWrite.jsp">
<table>
	<tr>
		<td><h5>작성자</h5></td>
		<td><input type="text" name="name" id="name"></td>
	</tr>
	<tr>
		<td><h5>비밀번호</h5></td>
		<td><input type="password" name="pw" id="pw"></td>
	</tr>
	<tr>
		<td><h5>이메일</h5></td>
		<td><input type="text" size="30" name="email" id="email"></td>
	</tr>
	<tr>
		<td><h5>제목</h5></td>
		<td><input type="text" size="30" name="title" id="title"></td>
	</tr>
	<tr>
		<td><h5>내용</h5></td>
		<td><textarea cols="30" rows="10" name="content" id="content"></textarea></td>
	</tr>
</table>
<br>
<input type="submit" value="작성" class="submit">
</form>
</body>
</html>