<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="sadd" method="post">
		英雄：<input type="text" name="name">
		价格：<input type="text" name="price">
		阵营：<select id="a1" name="cid">
			</select>
		状态：<select name="stauts">
				<option value="0">未拥有</option>
				<option value="1">已拥有</option>
			</select>
			<input type="submit" value="提交">
	</form>
	
	<script type="text/javascript">
		$.post("clist",function(obj){
			for(var x in obj){
				$("#a1").append("<option value='"+obj[x].cid+"'>"+obj[x].cname+"</option>")
			}
		},"json");
	</script>
</body>
</html>