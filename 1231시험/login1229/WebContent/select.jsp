<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select</title>
<style>
table{
	border-collapse:collapse;
}
th{
	background-color:yellow;
	border:1px solid black;
}
td{
	text-align:center;
	border:1px solid black;
}
</style>
</head>
<body>
	<h1>회원 목록</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>비밀번호</th>
			<th>이메일</th>
		</tr>
<%
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
Class.forName("oracle.jdbc.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		"hr", "hr");

String sql="select * from ACCOUNTS";
ps=con.prepareStatement(sql);
rs=ps.executeQuery();

while(rs.next()){
	String ID=rs.getString(1);
	String PW=rs.getString(2);
	String EMAIL=rs.getString(3);
%>
		<tr>
			<td><%=ID %></td>
			<td><%=PW %></td>
			<td><%=EMAIL %></td>
		</tr><%} %>
	</table>
	<input type="button" value="회원 추가" onclick="location.href='insertForm.jsp'">
	<input type="button" value="회원정보 수정" onclick="location.href='updateForm.jsp'">
	<input type="button" value="회원 삭제" onclick="location.href='deleteForm.jsp'">
<%
rs.close();
ps.close();
con.close();

%>
</body>
</html>