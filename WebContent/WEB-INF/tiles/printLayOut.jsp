<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@include file="taglib_includes.jsp"%>
<c:set var="pathValue" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>::: Chitra Hospital Management :::</title>
<link href="${pathValue}/resources/css/common/invoiceprint.css"
	rel="stylesheet" type="text/css" />
<script
	src="${pathValue}/resources/script/common/jquery/jquery-1.10.2.min.js"></script>
<script
	src="${pathValue}/resources/script/common/jquery/jquery-migrate-1.2.1.min.js"></script>
	
</head>
<body>
	<div class="ch_pagewrap" style=" width:915px;margin-top:300px;border: none; ">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>