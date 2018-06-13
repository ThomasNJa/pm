<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>注册</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/login/regist.css">
</head>
<body class="login_bj" >
<div class="zhuce_body">
    <div class="zhuce_kong">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>欢迎注册</h3>
       	  	  <form action="/regist"  method="post">
       	  	  	<input name="account" type="text" class="kuang_txt phone" placeholder="用户名">
       	  	  	<input name="password" type="text" class="kuang_txt possword" placeholder="密码">
       	  	  	<input name="email" type="text" class="kuang_txt email" placeholder="邮箱">
                <input name="telephone" type="text" class="kuang_txt yanzm" placeholder="手机号">
                <input name="address" type="text" class="kuang_txt yanzm" placeholder="住址">
                <input name="username" type="text" class="kuang_txt yanzm" placeholder="真实姓名">
                <input name="idcard" type="text" class="kuang_txt yanzm" placeholder="身份证号码">
                <input name="regist" type="submit" class="btn_zhuce" value="注册">
                </form>
            </div>
        	<div class="bj_right">
            	<p>使用以下账号直接登录</p>
                <a href="#" class="zhuce_qq">QQ注册</a>
                <a href="#" class="zhuce_wb">微博注册</a>
                <a href="#" class="zhuce_wx">微信注册</a>
                <p>已有账号？<a href="/login">立即登录</a></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>