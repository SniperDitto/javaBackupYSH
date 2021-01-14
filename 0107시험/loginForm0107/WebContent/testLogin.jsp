<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//DB연동시키기
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
Class.forName("oracle.jdbc.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		"hr", "hr");

String sql="select * from ACCOUNTS";
ps=con.prepareStatement(sql);
rs=ps.executeQuery();

String ID="";
String PW="";
String EMAIL="";
while(rs.next()){
	ID=rs.getString(1);
	PW=rs.getString(2);
	EMAIL=rs.getString(3);
}

rs.close();
ps.close();
con.close();


if(ID.equals(request.getParameter("id"))&&PW.equals(request.getParameter("pwd"))){
	//id 비번 일치하면 쿠키생성
	Cookie c=new Cookie("ID",URLEncoder.encode(ID,"UTF-8"));
	c.setMaxAge(365*24*60*60);
	response.addCookie(c);
	
		%>
		<h2>로그인성공</h2>
		<p><a href="main.jsp">메인페이지 가기</a>
		<%
	}else{
		%>
		<h2>로그인 실패</h2>
		<p><a href="loginForm.jsp">로그인페이지로</a>
		<%
	}

%>