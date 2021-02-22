<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<script>
$(function(){
	$("#myBtn").click(function(){
		$.ajax({
			url:"./test.txt",
			type:"get",
			data:"",
			timeout:30000,
			cache:false,
			success:function(data){
				$(".console").html(data);
			}
		})
	})
})

</script>
<input type="button" value="가져오기" id="myBtn">
<div class="console"></div>
</body>
</html>