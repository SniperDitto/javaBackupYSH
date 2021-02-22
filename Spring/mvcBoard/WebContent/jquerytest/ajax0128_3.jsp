<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form>span{
	display:none;
}
</style>
<script src="//ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<script>
$(function(){
	$("#category1").load(
		"./category-data.html #category1-1",
		function(){
			$(this).show();
			
		}		
	)
	$("#category1").change(function(){
		var target=$(this).find("option:selected").attr("data-target");
		$("#category2").load(
				"./category-data.html "+target,
				function(){
					$(this).show();
					$("#category3").hide();
				}		
			)
	$("#category2").change(function(){
		var target=$(this).find("option:selected").attr("data-target");
		$("#category3").load(
				"./category-data.html "+target,
				function(){
					$(this).show();
					
				}		
			)
	})
	})
	
})

</script>
<h1>동적 메뉴</h1>
<div>
  <span id="category1"></span>
  <span id="category2"></span>
  <span id="category3"></span>
</div>
</body>
</html>