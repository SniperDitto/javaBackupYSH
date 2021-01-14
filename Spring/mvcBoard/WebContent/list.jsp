<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
list.jsp
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td><td>이름</td><td>제목</td><td>작성일</td><td>조회수</td>
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td>${dto.bId }</td>
		<td>${dto.bName }</td>
		<td><c:forEach begin="1" end="${dto.bIndent }">&nbsp;-</c:forEach>
		<c:if test="${dto.bIndent!=0 }">=</c:if>
		<a href="content_view.do?bId=${dto.bId }">${dto.bTitle }</a></td>
		<td>${dto.bDate }</td>
		<td>${dto.bHit }</td>
	</tr>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>제목</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	</c:forEach>
	<tr><td colspan="5"><a href="write_view.do">글쓰기</a></td></tr>
</table>



</body>
</html>