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
			url:"./05.json",
			type:"get",
			data:"",
			dataType:"json",
			timeout:30000,
			cache:false,
			success:function(data){
				
				var subject=data.school.subject;
				for(var i=0;i<subject.length;i++){
				
				var div=$("<div>");
				var p1=$("<p>").html(subject[i].title);
				var p2=$("<p>").html(subject[i].time);
				var p3=$("<p>").html(subject[i].teacher);
					
				div.append(p1).append(p2).append(p3);
					
				$(".console").append(div);
				}
			},
			error: function(xhr, textStatus, errorThrown) {
				$("div").html("<div>" + textStatus + " (HTTP-" + xhr.status + " / " + errorThrown + ")</div>" );
			}
		})
	})
})

</script>
<input type="button" value="가져오기" id="myBtn">
<div class="console"></div>
</body>
</html>