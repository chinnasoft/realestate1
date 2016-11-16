<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <%@include file="taglib_includes.jsp" %>
 <c:set var="pathValue" value="${pageContext.request.contextPath}" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Serveplus for Justcart CRM</title>

<link href="${pathValue}/resources/css/main/jquery-ui.css" rel="stylesheet" type="text/css" />
<link href="styles/images/fevicon.ico" rel='icon' type='image/x-icon' />
<link href="${pathValue}/resources/css/main/font-awesome.css" rel="stylesheet"
	type="text/css" />
<link href="${pathValue}/resources/css/main/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="${pathValue}/resources/css/main/animate.css" rel="stylesheet" type="text/css" />
<link href="${pathValue}/resources/css/main/admin.css" rel="stylesheet" type="text/css" />
<link href="${pathValue}/resources/css/main/jquerysctipttop.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/kalendar/kalendar.css" rel="stylesheet" />
<link rel="stylesheet" href="styles/plugins/scroll/nanoscroller.css" />
<link href="styles/plugins/morris/morris.css" rel="stylesheet" />
<link href="styles/plugins/toggle-switch/toggles.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/icheck.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/blue.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/green.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/grey.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/orange.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/pink.css" rel="stylesheet"
	type="text/css" />
<link href="styles/plugins/checkbox/minimal/purple.css" rel="stylesheet"
	type="text/css" />
<link
	href="styles/plugins/bootstrap-fileupload/bootstrap-fileupload.min.css"
	rel="stylesheet" />
<link href="styles/plugins/dropzone/dropzone.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="styles/plugins/bootstrap-datepicker/css/datepicker.css" />
<link rel="stylesheet" type="text/css"
	href="styles/plugins/bootstrap-timepicker/compiled/timepicker.css" />
<link rel="stylesheet" type="text/css"
	href="styles/plugins/bootstrap-colorpicker/css/colorpicker.css" />
<link href="styles/plugins/data-tables/DT_bootstrap.css"
	rel="stylesheet" />


<link href="styles/plugins/looading-progress/loading-bar.css" rel="stylesheet" type="text/css" />


<!--

 <link href="styles/plugins/advanced-datatable/css/demo_table.css"
	rel="stylesheet" />
<link href="styles/plugins/advanced-datatable/css/demo_page.css"
	rel="stylesheet" />

 -->

<link rel="stylesheet" type="text/css"
	href="styles/css/jquery.classycontextmenu.min.css" />

</head>
<body class="light_theme  fixed_header left_nav_fixed"
	onload=display_ct();>
	
	<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<div class="inner">

			<%-- <div class="left_nav">
				<tiles:insertAttribute name="menu" />
			</div> --%>

			<div class="contentpanel">
			
			<div id="overlay">
    <img src="styles/images/loader.gif" alt="Loading" /><br/>
    Loading...
</div>
				<tiles:insertAttribute name="body" />
			</div>

		<!-- 	<div >
				<tiles:insertAttribute name="footer" />
			</div>   -->  
			
			

			
		</div>
	</div>

	<script src="styles/js/jquery-2.1.0.js"></script>

	<script src="styles/js/jquery-ui.min_auto.js" type="text/javascript"></script>

	<script type="text/javascript" src="styles/js/autocompleter.js"></script>


	<script src="styles/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="styles/js/bootbox.js"></script>
	<script src="styles/js/common-script.js"></script>
	<script src="styles/js/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="styles/plugins/toggle-switch/toggles.min.js"></script>
	<script src="styles/plugins/checkbox/zepto.js"></script>
	<script src="styles/plugins/checkbox/icheck.js"></script>
	<script src="styles/js/icheck-init.js"></script>
	<script src="styles/js/icheck.js"></script>


	<script type="text/javascript"
		src="styles/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript"
		src="styles/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="styles/plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.js"></script>
	<script type="text/javascript"
		src="styles/plugins/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
	<script type="text/javascript" src="styles/js/form-components.js"></script>
	<script type="text/javascript"
		src="styles/plugins/input-mask/jquery.inputmask.min.js"></script>
	<script type="text/javascript"
		src="styles/plugins/input-mask/demo-mask.js"></script>
	<script type="text/javascript"
		src="styles/plugins/bootstrap-fileupload/bootstrap-fileupload.min.js"></script>
	<script type="text/javascript"
		src="styles/plugins/dropzone/dropzone.min.js"></script>
	<script src="styles/plugins/validation/parsley.min.js"></script>
	<script type="text/javascript"
		src="styles/plugins/ckeditor/ckeditor.js"></script>


	<script src="styles/js/jPushMenu.js"></script>
	<script src="styles/js/side-chats.js"></script>


	<script>
		/*==Porlets Actions==*/
		$('.minimize').click(function(e) {
			var h = $(this).parents(".header");
			var c = h.next('.porlets-content');
			var p = h.parent();

			c.slideToggle();

			p.toggleClass('closed');

			e.preventDefault();
		});

		$('.refresh')
				.click(
						function(e) {
							var h = $(this).parents(".header");
							var p = h.parent();
							var loading = $('&lt;div class="loading"&gt;&lt;i class="fa fa-refresh fa-spin"&gt;&lt;/i&gt;&lt;/div&gt;');

							loading.appendTo(p);
							loading.fadeIn();
							setTimeout(function() {
								loading.fadeOut();
							}, 1000);

							e.preventDefault();
						});

		$('.close-down').click(function(e) {
			var h = $(this).parents(".header");
			var p = h.parent();

			p.fadeOut(function() {
				$(this).remove();
			});
			e.preventDefault();
		});
	</script>
	
	
	
	<script type="text/javascript" src="styles/jss/idset.js"></script>
	<script type="text/javascript" src="styles/jss/tblclk.js"></script>
	<script type="text/javascript" src="styles/jss/mail.js"></script>
	<script type="text/javascript" src="styles/jss/running.js"></script>
	<script type="text/javascript" src="styles/jss/quotation_product1.js"></script>
	<script type="text/javascript" src="styles/jss/getid.js"></script>
	<script type="text/javascript" src="styles/jss/delete.js"></script>
	<script type="text/javascript" src="styles/jss/sales.js"></script>
	<script type="text/javascript" src="styles/jss/justcart.js"></script>

	<!-- 	<script src="styles/jss/word/jquery.min.js"></script>  -->


	<script src="styles/jss/word/FileSaver.js"></script>
	<script src="styles/jss/word/jquery.wordexport.js"></script>

	<script src="styles/plugins/data-tables/jquery.dataTables.js"></script>
	<script src="styles/plugins/data-tables/DT_bootstrap.js"></script>
	<script src="styles/plugins/data-tables/dynamic_table_init.js"></script>
	<script src="styles/plugins/edit-table/edit-table.js"></script>
	<script src="styles/js/js/jquery.hoverintent.js"></script>
	<script src="styles/js/js/jquery.classycontextmenu.min.js"></script>

	<script src="styles/js/js/canvas2image.js"></script>


	<script src="styles/jss/pdf/pdf.js"></script>


<script src="styles/plugins/looading-progress/angular.min.js"></script>
	<script src="styles/plugins/looading-progress/angular-animate.min.js"></script>
	<script src="styles/plugins/looading-progress/loading-bar.js"></script>
	<script src="styles/plugins/looading-progress/app.js"></script>
	
	<script type="text/javascript">
	
	jQuery(window).load(function(){
	    jQuery('#overlay').fadeOut();
	    });
	
		function showhide(id) {
			var e = document.getElementById(id);
			e.style.display = (e.style.display == 'block') ? 'none' : 'block';
		}
	</script>
	

	<script>
		$(document)
				.ready(
						function() {
							
								 
								 	   var h=$(window).height();
								       $('div.left_nav_slidebar').css('max-height', h-200);
								 										
							 $('#btn').click(
										function(event) {
											$('#process').modal('show');
										});
							 
							 
											
							 $("#b1").click(
										function() {
												
													var e = document
															.getElementById("b2");
													e.style.display = (e.style.display == 'block') ? 'none'
															: 'block';
													});
								
								$("#c1").click(
										function() {
												
													var e = document
															.getElementById("c2");
													e.style.display = (e.style.display == 'block') ? 'none'
															: 'block';
													});
							
								 $("#d1").click(
											function() {
													
														var e = document
																.getElementById("d2");
														e.style.display = (e.style.display == 'block') ? 'none'
																: 'block';
														});
									
								$("#e1").click(
											function() {
													
														var e = document
																.getElementById("e2");
														e.style.display = (e.style.display == 'block') ? 'none'
																: 'block';
														});
								
								$("#f1").click(
										function() {
												
													var e = document
															.getElementById("f2");
													e.style.display = (e.style.display == 'block') ? 'none'
															: 'block';
													});

						});
	</script>

	<script>
function doit() {
	
	iframe = document.getElementById("doodad");
	 
	iframe.contentWindow.onafterprint = function (evt)
	{
	alert('i just printed something');
	};
	iframe.focus();
	iframe.contentWindow.print();
}

</script>

	<script>
		jQuery(document).ready(function() {
			EditableTable.init();
		});
	</script>

	<script src="styles/plugins/morris/morris.min.js"
		type="text/javascript"></script>
	<script src="styles/plugins/morris/raphael-min.js"
		type="text/javascript"></script>


	<script type="">
   var tableToExcel = (function() {
      var uri = 'data:application/vnd.ms-excel;base64,'
        , template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>'
        , base64 = function(s) { return window.btoa(unescape(encodeURIComponent(s))) }
        , format = function(s, c) { return s.replace(/{(\w+)}/g, function(m, p) { return c[p]; }) }
      return function(table, name) {
        if (!table.nodeType) table = document.getElementById(table)
        var ctx = {worksheet: name || 'Worksheet', table: table.innerHTML}
        window.location.href = uri + base64(format(template, ctx))
      }
    })()
</script>

	<script type="text/javascript">
		$('#fileID').change(function(e) {
			var fileName = e.target.files[0].name;
			$("input#file").val(fileName);
		});
		
		$('#fileID1').change(function(e) {
			var fileName = e.target.files[0].name;
			$("input#file1").val(fileName);
		});
		
		
		 $('#html2pdf').on('click',function(){
			 var $qid = $("input#qid").val();
			 var $div = $("#p1").html();
			  alert($div);
			 
			 $.get('QuotationPdf', {
					qid : $qid
				}, function(responseJson) {
					$.each(responseJson, function(key66,
							value66) {	
							alert($div);
						});
				});
			 
		 });
		
	</script>

	<SCRIPT LANGUAGE="JavaScript">
		function validate() {
			var extensions = new Array("jpg", "jpeg", "gif", "png", "bmp");

			/*
			 // Alternative way to create the array
			
			 var extensions = new Array();
			
			 extensions[1] = "jpg";
			 extensions[0] = "jpeg";
			 extensions[2] = "gif";
			 extensions[3] = "png";
			 extensions[4] = "bmp";
			 */

			var image_file = document.form.files.value;

			if (image_file == '') {
				return true;
			}

			var image_length = document.form.image_file.value.length;

			var pos = image_file.lastIndexOf('.') + 1;

			var ext = image_file.substring(pos, image_length);

			var final_ext = ext.toLowerCase();

			for (i = 0; i < extensions.length; i++) {
				if (extensions[i] == final_ext) {
					return true;
				}
			}

			bootbox.alert("You must upload an image file with one of the following extensions: "
					+ extensions.join(', ') + ".");
			return false;
		}
	</SCRIPT>

	<script>
		function printPage(id) {
			var disp_setting = "toolbar=yes,location=no,";
			disp_setting += "directories=yes,menubar=yes,";
			disp_setting += "scrollbars=yes,width=650, height=600, left=100, top=25";
			var content_vlue = document.getElementById(id).innerHTML;
			var docprint = window.open("", "", disp_setting);
			docprint.document.open();
			docprint.document
					.write('<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"');
			docprint.document
					.write('"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">');
			docprint.document
					.write('<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">');
			docprint.document.write('<head><title>My Title</title>');
			docprint.document.write('<style type="text/css">body{ margin:0px;');
			docprint.document.write('font-family:verdana,Arial;color:#000;');
			docprint.document
					.write('font-family:Verdana, Geneva, sans-serif; font-size:12px;}');
			docprint.document
					.write('a{color:#000;text-decoration:none;} </style>');

			docprint.document
					.write('<link href="styles/css/bootstrap.min.css" rel="stylesheet" type="text/css" />');
			docprint.document
					.write(' <link href="styles/css/font-awesome.css" rel="stylesheet" type="text/css" />  ');
			docprint.document
					.write(' <link href="styles/css/animate.css" rel="stylesheet" type="text/css" /> ');
			docprint.document
					.write(' <link href="styles/css/admin.css" rel="stylesheet" type="text/css" /> ');
			docprint.document
					.write(' <link href="styles/plugins/toggle-switch/toggles.css" rel="stylesheet" type="text/css" /> ');

			docprint.document.write('</head><body onLoad="self.print()">');
			docprint.document.write(content_vlue);
			docprint.document.write('</center></body></html>');

			docprint.document.close();
			docprint.focus();
		}
	</script>

	<script language="javascript" type="text/javascript">
		function fncSubmit() {

			if (document.ChangePasswordForm.OldPassword.value == "") {
				alert('Please input old password');
				document.ChangePasswordForm.OldPassword.focus();
				return false;
			}

			if (document.ChangePasswordForm.newpassword.value == "") {
				alert('Please input Password');
				document.ChangePasswordForm.newpassword.focus();
				return false;
			}

			if (document.ChangePasswordForm.conpassword.value == "") {
				alert('Please input Confirm Password');
				document.ChangePasswordForm.conpassword.focus();
				return false;
			}

			if (document.ChangePasswordForm.newpassword.value != document.ChangePasswordForm.conpassword.value) {
				alert('Confirm Password Not Match');
				document.ChangePasswordForm.conpassword.focus();
				return false;
			}

			document.ChangePasswordForm.submit();
		}
	</script>

	<script type="text/javascript"> 
function display_c(){
var refresh=1000; // Refresh rate in milli seconds
mytime=setTimeout('display_ct()',refresh)
}

function display_ct() {
var strcount
var x = new Date()
var x1=x.toLocaleString();// changing the display to UTC string

var currentTime = new Date()

var m_names = new Array("Jan", "Feb", "Mar", 
		"Apr", "May", "Jun", "Jul", "Aug", "Sep", 
		"Oct", "Nov", "Dec");

//Date
var month = currentTime.getMonth() ;
if (month < 10){
    month = month;
}
var day = currentTime.getDate();
var year = currentTime.getFullYear();

// Time
var hours = currentTime.getHours();
var minutes = currentTime.getMinutes();
if (minutes < 10){
    minutes = "0" + minutes;
}

if(hours > 11){
    var dateString = day + "-" + m_names[month] + "-" + year + " " + (hours % 12 || 12) + ":" + minutes + " " + "PM";
    test = new Date(dateString);
    x1=dateString ;
} else {
    var dateString = day + "-" + m_names[month] + "-" + year + " " + (hours % 12 || 12) + ":" + minutes + " " + "AM";

    x1=dateString;

}


document.getElementById('ct').innerHTML = x1;
tt=display_c();





</script>


	<script src="styles/jss/pdf.js"></script>
	<script src="styles/js/js/html2canvas.min.js"></script>
	<script src="styles/js/js/jspdf.debug.js"></script>


</body>
</html>

