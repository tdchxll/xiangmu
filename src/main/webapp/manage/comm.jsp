<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/19
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--0.必须加--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="${pageContext.request.contextPath}/images/logo.gif" /></div>
    <div class="help"><a href="${pageContext.request.contextPath}/index.jsp">返回前台页面</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li class="current"><a href="index.jsp">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/QueryUserPage.do">用户</a></li>
            <li><a href="${pageContext.request.contextPath}/manage/blog.jsp">文章</a></li>
            <li><a href="${pageContext.request.contextPath}/manage/guestbook.jsp">留言</a></li>
        </ul>
    </div>
</div>
</body>
</html>
