<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
</head>
<body>
reply_view
<form action="reply.do" method="post">
<input type="hidden" name="bId" value="${reply_view.bId }">
<input type="hidden" name="bGroup" value="${reply_view.bGroup }">
<input type="hidden" name="bStep" value="${reply_view.bStep }">
<input type="hidden" name="bIndent" value="${reply_view.bIndent }">
<table width="500" border="1">
  <tr>
    <td>원글 번호</td>
    <td>${reply_view.bId }</td>
  </tr>
  <tr>
    <td>이름</td>
    <td><input type="text" name="bName" size="50" value="${reply_view.bName}"></td>
  </tr>
  <tr>
    <td>제목</td>
    <td><input type="text" name="bTitle" size="50" value="${reply_view.bTitle}"></td>
  </tr>
  <tr>
    <td>내용</td>
    <td><textarea name="bContent" rows="10" ${reply_view.bContent}></textarea></td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" value="작성">&nbsp;&nbsp;
    <a href="list.do">목록으로</a></td>
  </tr>
</table>
</form>
</body>
</html>