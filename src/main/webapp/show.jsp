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
<c:forEach items="${chaxun}" var="c">
	编号<input type="text" value="${c.hid}"><br>
	<input type="text" value="${c.name}"><br>
	<input type="text" value="${c.price}"><br>
	<input type="text" value="${c.uptime}"><br>
	<input type="text" value="${c.status}"><br>
	<input type="text" value="${c.cid}"><br>
</c:forEach>
</body>
</html>