<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="itemBean" class="com.missions.javabeans.ItemBean"/>
<jsp:setProperty property="*" name="itemBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보</title>
</head>
<body>
<h1>상품정보</h1>
<table>
	<tr>
		<td><h5>상품명</h5></td>
		<td><jsp:getProperty property="name" name="itemBean"/></td>
	</tr>
	<tr>
		<td><h5>가격</h5></td>
		<td><jsp:getProperty property="price" name="itemBean"/></td>
	</tr>
	<tr>
		<td><h5>내용</h5></td>
		<td><jsp:getProperty property="content" name="itemBean"/></td>
	</tr>
</table>
</body>
</html>