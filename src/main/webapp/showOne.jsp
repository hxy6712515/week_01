<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	英雄：<input type="text" name="name" value="${hero.name }"><br>
	价格：<input type="text" name="price" value="${hero.price }"><br>
	阵营：<select name="cid" id="cid">
			<option value="">请选择</option>
		</select><br>
	上线时间：<input type="text" name="uptime" value="${hero.uptime }">
	
	<script type="text/javascript">
		(function(){
			
			$.post("queryCamp",function(num){
				var str="";
				for ( var i in num) {
					str+="<option value='"+num[i].cid+"'>"+num[i].cname+"</option>";
				}
				$("#cid").append(str);
				$("#cid").val("${hero.cid}");
			});
			
		})
		
	</script>

</body>
</html>