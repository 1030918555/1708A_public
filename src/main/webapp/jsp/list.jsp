<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
<script type="text/javascript">

	function fenye(cpage){
		$("[name='cpage']").val(cpage);
		$("form").submit();
	}
	function px(){
		var num=$("[name='status']").val();
		$("[name='num']").val(num);
		$("form").submit();
	}
</script>
</head>
<body>
	<form action="list.do" method="post">
		<input type="hidden" name="cpage" >
		<input type="hidden" name="num" >
		书名：<input type="text" name="mohu1" value="${map.mohu1}">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>书名</td>
			<td>价格
				<button name="status" value="${num}" onclick="px()">ˇ</button>
			</td>
			<td>出版社</td>
			<td>联系电话</td>
		</tr>
		<c:forEach items="${list }" var="b">
			<tr>
				<td>${b.id }</td>
				<td>${b.name }</td>
				<td>${b.price }</td>
				<td>${b.place }</td>
				<td>${b.phone }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<input type="button" value="首页" onclick="fenye(1)">
				<input type="button" value="上一页"  onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage()})">
				<input type="button" value="下页"  onclick="fenye(${pi.isIsLastPage()?pi.getPages():pi.getNextPage()})">
				<input type="button" value="尾页" onclick="fenye(${pi.getPages()})">
				<select name="cc" onchange="fenye1()" >
					<c:forEach items="${pi.getNavigatepageNums()}" var="c">
						<option ${pi.getPageNum()==c?'selected':''} >${c }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
</body>
</html>