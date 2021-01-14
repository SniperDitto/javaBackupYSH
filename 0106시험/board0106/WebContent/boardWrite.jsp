<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boardBean" class="com.missions.javabeans.BoardBean"/>
<jsp:setProperty property="*" name="boardBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>
<h1>게시물</h1>
<table>
	<tr>
		<td><h5>작성자</h5></td>
		<td><jsp:getProperty property="name" name="boardBean"/></td>
	</tr>
	<tr>
		<td><h5>비밀번호</h5></td>
		<td><jsp:getProperty property="pw" name="boardBean"/></td>
	</tr>
	<tr>
		<td><h5>이메일</h5></td>
		<td><jsp:getProperty property="email" name="boardBean"/></td>
	</tr>
	<tr>
		<td><h5>제목</h5></td>
		<td><jsp:getProperty property="title" name="boardBean"/></td>
	</tr>
	<tr>
		<td><h5>내용</h5></td>
		<td><jsp:getProperty property="content" name="boardBean"/></td>
	</tr>
</table>
</body>
</html>