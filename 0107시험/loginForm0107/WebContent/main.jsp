<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	
<%
//쿠키에서 name와 value를 얻어와서 비교
Cookie cookie[]=request.getCookies();
String str=null;
//클라이언트로부터 쿠키 얻어오기
if(cookie!=null){
	//쿠키 name과 username 비교해서 일치하면
	//쿠키의 값을 출력
	for(Cookie c:cookie){
		str=URLDecoder.decode(c.getValue(),"UTF-8");
	}
	out.print(str);
	%>
	님으로 로그인<br>
	asdfsadfsdfsdf<br>
		<form method="post" action="logout.jsp">
			<input type="submit" value="로그아웃">
		</form>
	<%
	}else{
		%>
		<h2>로그인 실패</h2>
		<p><a href="loginForm.jsp">로그인 페이지로</a></p>
		<%
	}
%>
	
</body>
</html>