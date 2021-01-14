
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

String ID=request.getParameter("ID");
String PW=request.getParameter("PW");
String EMAIL=request.getParameter("EMAIL");

System.out.println(ID+" "+PW+" "+EMAIL);

Connection con=null;
PreparedStatement ps=null;
Class.forName("oracle.jdbc.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		"hr", "hr");

String sql="delete from ACCOUNTS where ID=?";

ps=con.prepareStatement(sql);
ps.setString(1, ID);

ps.executeUpdate();
ps.close();
con.close();

%>
<script type="text/javascript">
alert("삭제됨");
location.href="select.jsp";
</script>
</body>
</html>