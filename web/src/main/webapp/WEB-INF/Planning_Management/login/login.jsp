<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登陆</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/login/style.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/login/selectivizr.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/login/fallback.css" />
<c:if test="${!empty message}">
<script type="text/javascript">
alert("${message}");
</script>
</c:if>
</head>

<body>
	<div id="container">
		<form action="/login" method="post">
			<div class="login">登陆</div>
			<div class="username-text">用户名:</div>
			<div class="password-text">密码:</div>
			<div class="username-field">
				<input type="text" name="account" value="" placeholder="请输入用户名" />
			</div>
			<div class="password-field">
				<input type="password" name="password" value="" placeholder="请输入密码"/>
			</div>
			<input type="checkbox" name="remember-me" id="remember-me" />
			<label for="remember-me">记住我</label>
			<div class="forgot-usr-pwd">
				忘记 <a href="#">用户名</a> 或 <a href="#">密码</a>?<a href="/goRegist">注册</a>
			</div>
			<input type="submit" name="submit" value="GO" />
		</form>
	</div>
	<div id="footer">欢迎来到计划管理系统 <a href="#!" target="_blank" title="计划管理系统"></a></div>
</body>
</html>