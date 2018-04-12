<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>富卫运维大平台</title> 
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/style.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/font/iconfont.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/page.css">
</head>
<body>
	<script src="${ctx}/resources/js/common/jquery-3.2.1.min.js"></script>
	<script src="${ctx}/resources/js/common.js"></script>
	<div class="wrapper">
		<jsp:include page="index_top.jsp"></jsp:include>
		<jsp:include page="index_left.jsp"></jsp:include>
		<div class="wrap-content">
			<sitemesh:write property='body' />
		</div>
	</div>
	
</body>

</html>