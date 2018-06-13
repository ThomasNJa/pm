<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>计划管理系统</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/Lightweight-Chart/cssCharts.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/materialize/css/materialize.min.css" media="screen,projection" />
<link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/assets/css/font-awesome.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/assets/css/custom-styles.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
	<div id="wrapper">
		<jsp:include page="top.jsp" />
		<jsp:include page="leftside.jsp" />
		<jsp:include page="main.jsp" />
	</div>
	
	<!-- javascript -->
	<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/materialize/js/materialize.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.metisMenu.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/morris/raphael-2.1.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/morris/morris.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/easypiechart.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/easypiechart-data.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/Lightweight-Chart/jquery.chart.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/custom-scripts.js"></script>
</body>
</html>