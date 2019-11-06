<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<link rel="stylesheet" href="css/css.css" type="text/css"></link>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>名称</td>
			<td>导演</td>
			<td>票价</td>
			<td><a href="javascript:query('uptime')">上映时间</a></td>
			<td><a href="javascript:query('longtime')">时间长度</a></td>
			<td>类型</td>
			<td><a href="javascript:query('year')">年代</a></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${pg.list }" var="m">

			<tr>
				<td>${m.name }</td>
				<td>${m.actor }</td>
				<td>${m.price }</td>
				<td>${m.uptime }</td>
				<td>${m.longtime }</td>
				<td>${m.type }</td>
				<td>${m.year }</td>
				<td>${m.area }</td>
				<td>${m.status }</td>
				<td></td>
				
			</tr>


		</c:forEach>
		

	</table>
	<script type="text/javascript">
	var orderMethod ='${movieVO.orderMethod=='asc'?'desc':'asc'}';

	function query(orderField){
		
		
		location.href="/selects?orderField="+orderField+"&orderMethod="+orderMethod
		
		
	}
	</script>
</body>
</html>