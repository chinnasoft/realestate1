<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="taglib_includes.jsp"%>
    <c:set var="pathValue" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

html, body, #wrapper {
   height:100%;
   width: 100%;
   margin: 0;
   padding: 0;
   border: 0;
}
#wrapper td {
   vertical-align: middle;
   text-align: center;
}
</style>
<body>


 <table id="wrapper">
      <tr>
         <td><img  class="displayed" src="${pathValue}/resources/images/487.GIF" style="width:128px;height:80px;" />
</td>
      </tr>
   </table>
<%-- <div id="reload" style="margin:0px auto;margin-top:130px;width:100%; height:100%;">
<img  class="displayed" src="${pathValue}/resources/images/487.GIF" style="width:128px;height:80px;" />
</div> --%>

</body>
</html>