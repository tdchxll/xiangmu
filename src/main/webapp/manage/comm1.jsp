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
<div id="menu-mng" class="lefter">
    <div class="box">
        <dl>
            <dt>用户管理</dt>
            <dd><em><a href="${pageContext.request.contextPath}/manage/user-add.jsp">新增</a></em><a href="${pageContext.request.contextPath}/QueryUserPage.do">用户管理</a></dd>
            <dt>博文管理</dt>
            <dd><em><a href="${pageContext.request.contextPath}/manage/blogClass-add.jsp">新增</a></em><a href="${pageContext.request.contextPath}/manage/blogClass.jsp">分类管理</a></dd>
            <dd><em><a href="${pageContext.request.contextPath}/manage/blog-add.jsp">新增</a></em><a href="${pageContext.request.contextPath}/manage/blog.jsp">文章管理</a></dd>
            <dt>留言管理</dt>
            <dd><a href="${pageContext.request.contextPath}/guestbook.jsp">留言管理</a></dd>
        </dl>
    </div>
</div>
</body>
</html>