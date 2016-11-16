<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <%@include file="taglib_includes.jsp" %>
 <c:set var="pathValue" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" http-equiv="X-UA-Compatible"  content="IT=edge,chrome=IE8,9,10">


<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="author" content="karthik">
<title>:::  Real Estate:::</title>
<!-- <style>
@media screen and (min-width:0\0) {
section#main { background: none repeat scroll 0 0 #FFFFFF; float: right; margin-bottom: 10px;
    margin-top: 0;min-height: 555px !important;width: 100%;}

@media screen and (-webkit-min-device-pixel-ratio:0) {

 section#main { min-height: 555px !important;  position:relative; bottom:0;}
}

 body { margin:0;padding:0 ;background:#FBF9F9; }
 footer {	 width:100%;	bottom:0;	left:0; }
 </style>
 -->
 <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="${pathValue}/resources/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="${pathValue}/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pathValue}/resources/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="${pathValue}/resources/dist/css/skins/_all-skins.min.css">
</head>
<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />
</body>

<!-- jQuery 2.2.3 -->
<script src="${pathValue}/resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${pathValue}/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="${pathValue}/resources/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${pathValue}/resources/dist/js/app.min.js"></script>
<!-- Sparkline -->
<script src="${pathValue}/resources/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${pathValue}/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pathValue}/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="${pathValue}/resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- ChartJS 1.0.1 -->
<script src="${pathValue}/resources/plugins/chartjs/Chart.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pathValue}/resources/dist/js/pages/dashboard2.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pathValue}/resources/dist/js/demo.js"></script>

</html>
