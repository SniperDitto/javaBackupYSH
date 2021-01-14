
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<form action="update.jsp" method="post">
	누구의 정보를 수정하겠습니까(ID) :<input type="text" name="ID"><br>
	<br>
	새 비밀번호:<input type="password" name="PW"><br>
	새 이메일:<input type="text" name="EMAIL"><br>
	<button type="submit">수정</button>
	<input type="button" value="목록으로" onclick="location.href='select.jsp'">
	</form>
</body>
</html>