<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
</head>
<body>
write_view
<form action="modify.do" method="post">
<input type="hidden" name="bId" value="${content_view.bId}">
<table width="500" border="1">
  <tr>
    <td>번호</td>
    <td>${content_view.bId}</td>
  </tr>
  <tr>
    <td>조회수</td>
    <td>${content_view.bHit}</td>
  </tr>
  <tr>
    <td>이름</td>
    <td>${content_view.bName}</td>
  </tr>
  <tr>
    <td>제목</td>
    <td><input type="text" name="bTitle" size="50" value="${content_view.bTitle}"></td>
  </tr>
  <tr>
    <td>내용</td>
    <td><textarea name="bContent" rows="10" ${content_view.bContent}></textarea></td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" value="작성">&nbsp;&nbsp;
    <a href="list.do">목록으로</a></td>
    <a href="delete.do?bId=${content_view.bId}">삭제하기</a></td>
    <a href="reply_view.do?bId=${content_view.bId}">답글달기</a></td>
  </tr>
</table>
</form>
</body>
</html>