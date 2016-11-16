
<%@include file="taglib_includes.jsp"%>
<c:set var="pathValue" value="${pageContext.request.contextPath}" />


<header id="header">
	<hgroup>
		
			

		<h1 class="site_title">
				<a href="#"><img src="${pathValue}/resources/images/logo.png" style="margin-top: 4px;"></span></a>
			</h1>
	
		 <c:choose>
		 <c:when test="${! empty  sessionScope.headerFilePath1}">
		  <h1 class="site_title">
				<a href="#"><img src="${sessionScope.headerFilePath1}"  style="border:none; border: medium none; width: 135px; height: 45px;"/></a>
			</h1>
		 </c:when>
		 <c:otherwise>
		 </c:otherwise>
		 </c:choose>
		
 
      <nav class="menu cl-effect-16">
      
      
      <!-- Level 1 Menus Display Starts -->
      
       <%-- <c:if test="${sessionScope.userName ne 'admin'}"> --%>
<%--      <c:if test="${sessionScope.userTypeId == 4}">  --%>
      <ul id="menu">
      <c:set var="repeatGroup" value="0" />
      <%-- <c:out value="${sessionScope.userTypeId }"></c:out> --%>
      
      <c:forEach var="Level1Menus" items="${sessionScope.menus}">
      <c:forEach var="mainmenus" items="${sessionScope.mainmenus}">
      
      <c:if test="${  Level1Menus.value.menuId.groupHead eq mainmenus.menuId and Level1Menus.value.menuId.groupHead ne repeatGroup  and Level1Menus.value.menuId.statusId.statusId eq '1' }">
      <li>
       
      <a href="${mainmenus.link}" data-hover="${mainmenus.menuName}">
     
     

    
    <span class="hightop-feed">	<img src="${pathValue}/${mainmenus.menuUrlName}"/>		</span>
     
     
      ${mainmenus.menuName}
      </a>
      <!-- Level 2 Menus Display Start -->
      <ul>
      <c:set var="repeatSubGroup" value="0" />
      <c:forEach var="Level2Menus" items="${sessionScope.menus}">
      <c:choose>
      <c:when test="${! empty Level2Menus.value.menuId.menuName and Level2Menus.value.menuId.menuType == 'sub1'  and  Level2Menus.value.menuId.groupHead == mainmenus.menuId and Level2Menus.value.menuId.statusId.statusId eq '1'}">
      <li>
      <a href="${Level2Menus.value.menuId.link}" >
      ${Level2Menus.value.menuId.menuName}
      </a>
      </li>
      </c:when>
      <c:when test="${! empty Level2Menus.value.menuId.menuName and Level2Menus.value.menuId.menuType == 'sub2'  and  Level2Menus.value.menuId.groupHead == mainmenus.menuId  and repeatSubGroup ne Level2Menus.value.menuId.subGroupHead and Level2Menus.value.menuId.statusId.statusId eq '1'}">
      <c:forEach var="Level2mainmenus" items="${sessionScope.mainmenus}">
      <c:if test="${Level2Menus.value.menuId.subGroupHead eq Level2mainmenus.menuId }">
      <li>
      <a href="${Level2mainmenus.link}" >
      ${Level2mainmenus.menuName}
      </a>
      <!-- Level 3 Menus Display Starts -->
      <ul>
      <c:forEach var="Level3Menus" items="${sessionScope.menus}">
      <c:if test="${Level2Menus.value.menuId.subGroupHead eq Level3Menus.value.menuId.subGroupHead }">
      <li>
      <a href="${Level3Menus.value.menuId.link}" >
      ${Level3Menus.value.menuId.menuName}
      </a>
      </li>
      
      </c:if>
      </c:forEach>
      </ul> 
      <!-- Level 3 Menus Display Ends -->
      </li>
      </c:if>
      </c:forEach>
      <c:set var="repeatSubGroup" value="${Level2Menus.value.menuId.subGroupHead}" />
      </c:when>
      </c:choose>
      
      </c:forEach>
      </ul>
      <!-- Level 2 Menus Display Ends -->
      </li>
      </c:if>
      
      </c:forEach>
      <c:set var="repeatGroup" value="${Level1Menus.value.menuId.groupHead}" />
      </c:forEach>
      </ul>
<%--    </c:if> 
     --%>
     
     
      
      
   
      <!-- Level 1 Menus Display Ends -->
      </nav>
		<style>
		/* Menu CSS */#cssmenu,
#cssmenu > ul {
  padding-bottom: 3px;
  font-family: 'Open Sans', sans-serif;
  font-weight: 600;
  float: left;
}
#cssmenu:before,
#cssmenu:after,
#cssmenu > ul:before,
#cssmenu > ul:after {
  content: "";
  display: table;
}
#cssmenu:after,
#cssmenu > ul:after {
  clear: both;
}
#cssmenu {
  width: auto;
  zoom: 1;
}
#cssmenu > ul {

  margin: 0;
  padding: 0;
  position: relative;
}
#cssmenu > ul li {
  margin: 0;
  padding: 0;
  list-style: none;
}
#cssmenu > ul > li {
  position: relative;
  display: inline-block;
text-align: center;
}
#cssmenu > ul > li > a {
padding: 3px 17px 7px;
display: block;
color: #363636;
text-decoration: none;
line-height: 20px;
margin-top: 8px;
margin-right: 2px;
width: 83px;
font-weight: normal;
font-size: 14px;
}
#cssmenu > ul > li:hover > a {
  color: #06254D !important;
  border-radius: 2px 2px 0px 0px !important;
}
#cssmenu > ul > li > a > span {
  line-height: 18px;
}
#cssmenu > ul > li.active > a,
#cssmenu > ul > li > a:active {
  background: #fff;
}
/* Childs */
#cssmenu > ul ul {
  opacity: 0;
  visibility: hidden;
  
  list-style: outside none none;
margin: 0px;
position: absolute;
top: 55px;
left: -55px;
z-index: 99999;
box-shadow: 0px 1px 2px rgba(0, 0, 0, 0.2);
background: #FFF none repeat scroll 0% 0%;
border: 1px solid #DDD;
padding: 0px;
min-width: 120px;
max-width: 300px;

}
#cssmenu > ul li:hover ul {
    opacity: 1;
    visibility: visible;
    margin: 0px 0px 0px -23px;
    color: #000;
    z-index: 999;
    top: 65px;
	left: -10px;
	text-align: left;
    
}
#cssmenu > ul ul:before {
  position: absolute;
  top: -10px;
  width: auto;
  height: 20px;
  background: red;
}
#cssmenu > ul ul li {
  list-style: none;
  padding: 0;
  margin: 0;
  width: 100%;
}

#cssmenu > ul ul li a {
 padding: 6px 3px;
display: block;
color: #06254D !important;
text-decoration: none;
width: 120px;
font-weight: normal;
float: left;
margin-left: 14px;
font-weight: noraml !important;
border-bottom: 1px solid #E2E2E2;

}
#cssmenu > ul ul li:hover {

  background: linear-gradient(#fff, #fff) repeat scroll 0% 0% transparent;
  border-bottom-color: #007AFF;
color: #007AFF;}


#cssmenu > ul ul li a:hover {
  background: linear-gradient(#fff, #fff) repeat scroll 0% 0% transparent;
  border-bottom-color: #007AFF;
color: #007AFF;


}
#cssmenu > ul ul li a:active {
  background: url(images/menu-bg.png) repeat;
}
		
		
		
		
		</style>
		
		<div id="cssmenu" class="profile_details">
<ul>
  
   <li class='has-sub'><a href="#"><!-- <span class="viaff" style="margin-top: 7px;
padding-top: 3px;
float: right;
font: 400 14px/16px Arial,Helvetica;"> -->

<span class="hightop-feed">
<img src="${pathValue}/resources/images/ser.png">
</span>
<span class="g2">
<c:if test="${! empty sessionScope.userName}">
									${sessionScope.userName}
								</c:if>
									
								</span>
								
								</a>
								
								

      <ul>
  <c:if test="${sessionScope.userTypeId == 1 || sessionScope.userTypeId  == 3}">
        <li><a href="addNewHospital.htm">Setup</a></li>
         <li class="divider"></li>
  </c:if> 
<c:if test="${sessionScope.userName == 'sadmin'}">
											
        <li><a href="changeHospital.htm">Change Hospital </a></li> 
        <li class="divider"></li>
</c:if> 
       <li><a href="ChangePassword.htm">Change Password</a></li>
        <li><a href="loginPage.htm">Log Out</a></li>
      </ul>
   </li>
  
</ul>


<%-- <div class="profile_img">
					<a href="javascript:void(0);"> <img alt="" src="${pathValue}/resources/images/common/me.png">
					</a>
				</div> --%>
</div>


		
		
		
		 <%-- div class="profile_details">
			<div id="loginContainer">
				<div class="LoggedName">
					<a href="#"><c:if test="${! empty sessionScope.userName}">
									${sessionScope.userName}
								</c:if></a>
				</div>
				<span id="loginButton">
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav">

							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<!-- <li><a href="#">Change User</a></li> -->
									
									
									 <c:if test="${sessionScope.userType eq sessionScope.userTypeAdmin}">
									
								<li><a href="../SETUP/SetupPage.htm">Setup 
											</a></li>
											<li class="divider"></li>
											</c:if>
											
											
								<li><a href="../SETUP/ChangePassword.htm">Change
											Password</a></li>
								
																
									
									

									<li class="divider"></li>
									<!-- <li class="dropdown-header">Admin Settings</li>
									<li><a href="#">Privacy Settings</a></li> -->
									<li><a href="../Login/loginPage.htm">Log Out</a></li>
								</ul></li>
						</ul>

					</div>
				</span>



				<div class="profile_img">
					<a href="javascript:void(0);"> <img alt=""
						src="${pathValue}/resources/images/common/me.png">
					</a>
				</div>
				<div class="clear"></div>
			</div>
		</div> --%>
	</hgroup>
</header>



<section id="secondary_bar" >

	<div class="breadcrumbs_container">
		<article class="breadcrumbs">
		
		   <c:set var="pathValue" value="${pageContext.request.contextPath}" />
      
      <c:set var="pathValue" value="${pageContext.request.contextPath}" /> 
<c:set var="url" value="${requestScope['javax.servlet.forward.request_uri']}" />
      
      
      <c:set var="dateParts" value="${fn:split(url, '/')}" />

<c:set var="sosize" value="${fn:length(dateParts)}" /> 
 
<input type="hidden" name="day1" value="${dateParts[sosize-1]}" />
<input type="hidden" name="day" value="${dateParts[1]}" />
<c:set var="path" value="${dateParts[sosize-1]}" />
		
  
		
		<c:forEach var="urlNavigation" items="${sessionScope.urlNavigationList}">
    <c:if test="${path eq urlNavigation.url}">
   <section id="secondary_bar" style="width: 100%; border-left-width: 9px; padding-left: 0px; margin-left: 0px;">

	<div class="breadcrumbs_container">
		<article class="breadcrumbs">
			
			<a href="#" class="not-active "><span style="">YOU ARE</span> HERE
			<div class="breadcrumb_divider"><img src="${pathValue}/resources/images/arrow.png"/></div>${urlNavigation.menu}
			<div class="breadcrumb_divider"><img src="${pathValue}/resources/images/arrow.png"/></div>${urlNavigation.navigation}</a>
			<%-- 
		 <%-- 	<a href="#"><span style="">You are</span> here>${urlNavigation.navigation}</a> 
			 --%>
		</article>
	</div>
</section>
    </c:if>
    </c:forEach>  
		
		
			<%-- <a href="#"><span style="">YOU ARE</span> HERE</a>
			<div class="breadcrumb_divider"><img src="${pathValue}/resources/images/arrow.png"/></div>
			 --%>
		</article>
	</div>
</section>   
