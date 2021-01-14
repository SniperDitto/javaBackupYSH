
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="insert.jsp" method="post">
	아이디:<input type="text" name="ID"><br>
	비밀번호:<input type="password" name="PW"><br>
	이메일:<input type="text" name="EMAIL"><br>
	<button type="submit">확인</button>
	<input type="button" value="목록으로" onclick="location.href='select.jsp'">
	</form>
</body>
</html>