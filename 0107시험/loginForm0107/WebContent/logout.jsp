<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
<%
	Cookie c=new Cookie("ID","");
	c.setMaxAge(0);
	response.addCookie(c);

%>
<script>
	alert("로그아웃되었습니다");
	location.href="loginForm.jsp";
</script>
</body>
</html>