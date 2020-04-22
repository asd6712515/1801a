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
	<form action="slist" method="post">
		<select id="a1" name="cid">
		<c:forEach items="${plist.list}" var="h">
			<option>${h.t_camp.cname}</option>
		</c:forEach>
		</select>
		<select id="a2" name="status">
		<c:forEach items="${plist.list}" var="y">
			<option value="">${y.status}</option>
		</c:forEach>
		</select>
		价格区间:<input type="text" name="price1">~<input type="text" name="price2">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>ID</td>
			<td>英雄</td>
			<td>阵营</td>
			<td>价格</td>
			<td>状态</td>
			<td>上线时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${plist.list}" var="tt">
			<tr>
				<td>${tt.hid}</td>
				<td>${tt.name}</td>
				<td>${tt.t_camp.cname}</td>
				<td>${tt.price}</td>
				<td>${tt.status}</td>
				<td>${tt.uptime}</td>
				<td>
				<a href="xiangqing?hid='${tt.hid}'">详情</a>
				<a href="xiugai.jsp?hid='${tt.hid}'">购买</a>
				
				</td>
			</tr>
			<tr>
				<td colspan="1">
					<a href="slist?pageNum=1">首页</a>
					<a href="slist?pageNum+=1">上一页</a>
					<a href="slist?pageNum-=1">下一页</a>
					<a href="slist?pageNum=${tt.pages}">末页</a>
				</td>
			</tr>
		</c:forEach>
	</table>
<script type="text/javascript">
	
	
</script>
</body>
</html>