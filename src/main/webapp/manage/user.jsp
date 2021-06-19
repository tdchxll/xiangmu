<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必须加--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 博客网</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/function-manage.js"></script>
</head>
<body>
<jsp:include page="comm.jsp"></jsp:include>
<div id="childNav">
	<div class="welcome wrap">
		管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
	</div>
</div>
<div id="position" class="wrap">
	您现在的位置：<a href="${pageContext.request.contextPath}/index.jsp">博客网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
<jsp:include page="comm1.jsp"></jsp:include>
	<div class="main">
		<h2>用户管理</h2>
		<div class="manage">
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
					<th>Email</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
				<c:forEach var="li" items="${list}">
					<tr>
						<td class="first w4 c">${li.buUserId}</td>
						<td class="w1 c">${li.buUserName}</td>
						<td class="w2 c">${li.buSex}</td>
						<td>${li.buEmail}</td>
						<td class="w4 c">${li.buMobile}</td>
						<td class="w1 c"><a href="${pageContext.request.contextPath}/manage/user-modify.jsp">修改</a> <a href="${pageContext.request.contextPath}/javascript:Delete(1);">删除</a></td>
					</tr>
				</c:forEach>


			</table>
			<table>
				<tr>
					<td>
						总共&nbsp;&nbsp;${page.totalPageCount}&nbsp;&nbsp;&nbsp;页
						当前&nbsp;&nbsp;${page.pageNo}&nbsp;&nbsp;&nbsp;页
						总共&nbsp;&nbsp;${page.totalCount}&nbsp;&nbsp;&nbsp;条数据
						<c:if test="${page.pageNo>1}">
							<a href="${pageContext.request.contextPath}/QueryUserPage.do?pageNo=1">首页</a>
							<a href="${pageContext.request.contextPath}/QueryUserPage.do?pageNo=${page.pageNo-1}">上一页</a>
						</c:if>
						<c:if test="${page.pageNo<page.totalPageCount}">
							<a href="${pageContext.request.contextPath}/QueryUserPage.do?pageNo=${page.pageNo+1}">下一页</a>
							<a href="${pageContext.request.contextPath}/QueryUserPage.do?pageNo=${page.totalPageCount}">末页</a>
						</c:if>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
