<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>大学生创新创业管理系统</title>

</head>
<body class="login" mycollectionplug="bind">
<link href="${ctx}/resources/css/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/login_style.css">
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/userpanel.css">
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/jquery.ui.all.css">
	<div class="login_m">
	<div class="login_logo">大学生创新创业管理系统</div>
	<div class="login_boder">
		<div class="login_padding" id="login_model">
		  <h2>USERNAME</h2>
		  <label>
		       <input type="text" id="username" class="txt_input txt_input2" onfocus="if (value ==&#39;Your name&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;Your name&#39;}" value="Your name">
		  </label>
		  	   <h2>PASSWORD</h2>
		  <label>
		   	   <input type="password" name="textfield2" id="userpwd" class="txt_input" onfocus="if (value ==&#39;******&#39;){value =&#39;&#39;}" onblur="if (value ==&#39;&#39;){value=&#39;******&#39;}" value="******">
		  </label>
		  <p class="forgot"><a id="iforget" href="javascript:void(0);">Forgot your password?</a></p>
		  <div class="rem_sub">
			   <div class="rem_sub_l">
				  <input type="checkbox" name="checkbox" id="save_me">
				  <label for="checkbox">Remember me</label>
			   </div>
			      <label>
			      <input type="submit" class="sub_button" name="button" id="button" value="SIGN-IN" style="opacity: 0.7;">
			   </label>
		  </div>
		</div>
	</div>
	</div>
</body>
</html>
