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

		
	$("checkid").click(function(){
		var input_value=$("input[name='user_id']").val();
		if(input_value){
			alert("아이디 입력");
			$("input[name='user_id']").focus();
			return false;
		}

		var url="./idcheck.jsp";
		$.get(url,{
			"user_id":input_value
		},function(data){
			var result_text=$(data).find("result").text();
			var result=eval(result_text);
			if(result){
				$(".console").html("<span style='color:blue'>"+"사용 가능"+"</span>");
			}else{
				$(".console").html("<span style='color:red'>"+"사용 불가"+"</span>");
			}
		})
			
	})



</script>
<h1 class="title">아이디 중복검사</h1>
	<div class="exec">
		<form>
			<input type="text" name="user_id" />
			<input type="button" id="checkid" value="중복검사" />
		</form>
	</div>
<div class="console"></div>
</body>
</html>