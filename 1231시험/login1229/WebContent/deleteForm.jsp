
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
	<h1>회원 삭제</h1>
	<form action="delete.jsp" method="post">
	누구의 정보를 삭제하겠습니까(ID) :<input type="text" name="ID"><br>

	<button type="submit">삭제</button>
	<input type="button" value="목록으로" onclick="location.href='select.jsp'">
	</form>
</body>
</html>