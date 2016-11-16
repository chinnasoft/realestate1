<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<link href="styles/css/jquery-ui.css" rel="stylesheet" type="text/css" />


<link rel="apple-touch-icon-precomposed" sizes="152x152" href="styles/images/fevicon.ico" />
<link rel="icon" type="image/x-icon" href="styles/images/fevicon1.ico" sizes="32x32" />
<link rel="shortcut icon" href="styles/images/fevicon1.ico" />


<link href="styles/css/font-awesome.css" rel="stylesheet"
	type="text/css" />
<link href="styles/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="styles/css/animate.css" rel="stylesheet" type="text/css" />
<link href="styles/css/admin.css" rel="stylesheet" type="text/css" />
<link href="styles/css/jquerysctipttop.css" rel="stylesheet"
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
	<link href="styles/plugins/tree-view/jquery.treeview.css"
	rel="stylesheet" type="text/css" />
<link href="styles/plugins/timedropper-master/timedropper.css"
	rel="stylesheet" type="text/css" />
	<link href="styles/plugins/clockpicker/clockpicker.css" rel="stylesheet"
	type="text/css" />

<link href="styles/plugins/looading-progress/loading-bar.css"
	rel="stylesheet" type="text/css" />
	
<link href="styles/plugins/Scroll-To-Top/css/style.css"
	rel="stylesheet" type="text/css" />

<link href="styles/css/timezone.css" rel="stylesheet" type="text/css" />
	


<!--

 <link href="styles/plugins/advanced-datatable/css/demo_table.css"
	rel="stylesheet" />
<link href="styles/plugins/advanced-datatable/css/demo_page.css"
	rel="stylesheet" />

 -->

<link rel="stylesheet" type="text/css"
	href="styles/css/jquery.classycontextmenu.min.css" />


<style type="text/css">
@
-moz-keyframes blink { 0%{
	opacity: 1;
}

50%{
opacity
:
0;
}
100%{
opacity
:
1;
}
} /* Firefox */
@
-webkit-keyframes blink { 0%{
	opacity: 1;
}

50%{
opacity
:
0;
}
100%{
opacity
:
1;
}
} /* Webkit */
@
-ms-keyframes blink { 0%{
	opacity: 1;
}

50%{
opacity
:
0;
}
100%{
opacity
:
1;
}
} /* IE */
@
keyframes blink { 0%{
	opacity: 1;
}

50%{
opacity
:
0;
}
100%{
opacity
:
1;
}
} /* Opera and prob css3 final iteration */
.imgBlink {
	-moz-transition: all 1s ease-in-out;
	-webkit-transition: all 1s ease-in-out;
	-o-transition: all 1s ease-in-out;
	-ms-transition: all 1s ease-in-out;
	transition: all 1s ease-in-out;
	/* order: name, direction, duration, iteration-count, timing-function */
	-moz-animation: blink normal 1s infinite ease-in-out; /* Firefox */
	-webkit-animation: blink normal 1s infinite ease-in-out; /* Webkit */
	-ms-animation: blink normal 1s infinite ease-in-out; /* IE */
	animation: blink normal 1s infinite ease-in-out;
	/* Opera and prob css3 final iteration */
}
?
</style>


</head>
<body class="light_theme  fixed_header left_nav_fixed"
	onload=display_ct();>
	
	
	
	<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<div class="inner">

			<div class="left_nav">
				<tiles:insertAttribute name="menu" />
			</div>

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
	

	<script type="text/javascript" src="styles/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="styles/js/bootbox.js"></script>
	<script type="text/javascript" src="styles/js/common-script.js"></script>
	<script type="text/javascript" src="styles/js/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="styles/plugins/toggle-switch/toggles.min.js"></script>
	<script type="text/javascript" src="styles/plugins/checkbox/zepto.js"></script>
	<script type="text/javascript" src="styles/plugins/checkbox/icheck.js"></script>
	<script type="text/javascript" src="styles/js/icheck-init.js"></script>
	<script type="text/javascript" src="styles/js/icheck.js"></script>


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
	<script type="text/javascript" src="styles/jss/stock.js"></script>
	
	<script type="text/javascript" src="styles/jss/dc.js"></script>
	
	<script type="text/javascript" src="styles/jss/purchase.js"></script>
	
	<script type="text/javascript" src="styles/jss/odc.js"></script>

	<!-- 	<script src="styles/jss/word/jquery.min.js"></script>  -->

	<script type="text/javascript" src="styles/jss/word/FileSaver.js"></script>
	<script type="text/javascript"
		src="styles/jss/word/jquery.wordexport.js"></script>
	<script type="text/javascript"
		src="styles/plugins/data-tables/jquery.dataTables.js"></script>
	<script type="text/javascript"
		src="styles/plugins/data-tables/DT_bootstrap.js"></script>
	<script type="text/javascript"
		src="styles/plugins/data-tables/dynamic_table_init.js"></script>
	<script type="text/javascript"
		src="styles/plugins/edit-table/edit-table.js"></script>
	<script type="text/javascript" src="styles/js/js/jquery.hoverintent.js"></script>
	<script type="text/javascript"
		src="styles/js/js/jquery.classycontextmenu.min.js"></script>

	<script type="text/javascript" src="styles/js/js/canvas2image.js"></script>
	<script type="text/javascript" src="styles/jss/pdf/pdf.js"></script>
	
	<script src="styles/plugins/timedropper-master/timedropper.js"></script>
	<script src="styles/plugins/clockpicker/clockpicker.js"></script>


	<script src="styles/plugins/looading-progress/angular.min.js"></script>
	<script src="styles/plugins/looading-progress/angular-animate.min.js"></script>
	<script src="styles/plugins/looading-progress/loading-bar.js"></script>
	<script src="styles/plugins/looading-progress/app.js"></script>
	
	<script src="styles/plugins/Scroll-To-Top/js/jquery.scrollToTop.min.js"></script>
<script type="text/javascript">
            $(function() {
                $("#toTop").scrollToTop(1000);
            });
        </script>

	<script type="text/javascript">
	
	jQuery(window).load(function(){
	    jQuery('#overlay').fadeOut();
	    });
	
	function GetDynamicTextBox(value) {
	    return '<div class="form-group">'+
	                '<label class="col-sm-4 control-label">SLNO' + value + '</label>'+
	                '<div class="col-md-4">'+
	    		'<input name = "SLNO' + value + '" id = "SLNO' + value + '" class="form-control" type="text" value = "" /> '+
	    		'</div></div>' 
	            
	}
	
	function GetDynamicTextBoxODC(value, value1) {
	    return '<div class="form-group">'+
	                '<label class="col-sm-4 control-label">SLNO' + value + '</label>'+
	                '<div class="col-md-2">'+
	    		'<input name = "SLNO' + value + '" id = "SLNO' + value + '" readonly class="form-control" type="text" value = "'+ value1 +'" /> '+
	    		'</div><div class="col-md-2"><input type="checkbox" name = "CHK' + value + '" id = "CHK' + value + '" ></div></div>' 
	            
	}
	
	function GetDynamicTextBoxODC1(value, value1) {
	    return '<div class="form-group">'+
	                '<label class="col-sm-4 control-label">SLNO' + value + '</label>'+
	                '<div class="col-md-2">'+
	    		'<input name = "SLNO' + value + '" id = "SLNO' + value + '" readonly class="form-control" type="text" value = "'+ value1 +'" /> '+
	    		'</div><div class="col-md-2"><input type="checkbox" checked name = "CHK' + value + '" id = "CHK' + value + '" ></div></div>' 
	            
	}
	
	
	function GetDynamicTextBox1(value) {
	    return '<div class="form-group">'+
	                '<label class="col-sm-3 control-label"></label>'+
	                '<div class="col-md-4">'+
	                '<div class="bs-example">'+
	                '<div class="alert alert-warning fade in">'+
	                '<button aria-hidden="true" class="close" type="button" value="'+ value  +'" ></button> '+
	                '<strong>'+ value  +'</strong></div></div>'+
	    			'</div>'+ 
	    		'</div></div>' 	            
	}
	
		$(document)
				.ready(
						function() {
							
						
							   var h=$(window).height();
						       $('div.left_nav_slidebar').css('max-height', h-200);
						       
						       $('#errorMsg1').fadeIn("fast", function(){        
						           $("#errorMsg1").fadeOut(10000);
						       });
						       
						       
						       $('#addAuth').click(function(event) {
									var $sid = $("input#sid").val();
									
									if($sid == ""){
										
										bootbox.alert("Click Employee id to above Employee List table.....")
										
									}else{
									
									$('#addAuth').val("gi2");
									
									var tableData = new Array(); // we will store rows'
									// data into this array
									$("#addAuthorization") // select table by id
									.find(".tableRow").each(function() { // for each
										
										var tableRow = {};
										var jRow = $(this);
										
										if (jRow.find('td.act').find('input:checkbox').is(':checked')) {
										
										tableRow.sid = $sid;
										
										tableRow.mid = jRow.find('td.mid').text();
										
										if (jRow.find('td.act').find('input:checkbox').is(':checked')) {
											tableRow.act = 1;
										} else {
											tableRow.act = 0;
										}
										if (jRow.find('td.add').find('input:checkbox').is(':checked')) {
											tableRow.add1 = 1;
										} else {
											tableRow.add1 = 0;
										}
										if (jRow.find('td.edt').find('input:checkbox').is(':checked')) {
											tableRow.edt = 1;
										} else {
											tableRow.edt = 0;
										}
										if (jRow.find('td.upd').find('input:checkbox').is(':checked')) {
											tableRow.upd = 1;
										} else {
											tableRow.upd = 0;
										}
										if (jRow.find('td.del').find('input:checkbox').is(':checked')) {
											tableRow.del = 1;
										} else {
											tableRow.del = 0;
										}
										if (jRow.find('td.list').find('input:checkbox').is(':checked')) {
											tableRow.list = 1;
										} else {
											tableRow.list = 0;
										}
										
										if (jRow.find('td.prw').find('input:checkbox').is(':checked')) {
											tableRow.prw = 1;
										} else {
											tableRow.prw = 0;
										}
										tableData.push(tableRow);
										
										}
										
										

									});

									jQuery.ajax({
										url : "AddActive",
										data : JSON.stringify(tableData),
										success : function() {
											console.log(JSON.stringify(tableData));
											// alert(JSON.stringify(tableData));
										},
										error : function(data) {
											console.log("Error: ", data);
										},
										type : "post",
										timeout : 30000
									});
								//	alert($sid);
									$('#myform').submit();
									//alert($sid);
									$('#process').modal('show');
									
									
									
									}
									
								});
								
								
							
								$('#addAuthorization').find('tr').click( function(){
									
									if ( ( $(this).find('td.add').find('input:checkbox').is(':checked')) || ( $(this).find('td.upd').find('input:checkbox').is(':checked'))
											|| ( $(this).find('td.edt').find('input:checkbox').is(':checked')) || ( $(this).find('td.del').find('input:checkbox').is(':checked'))
											|| ( $(this).find('td.list').find('input:checkbox').is(':checked')) || ( $(this).find('td.prw').find('input:checkbox').is(':checked')))  {
										 $(this).find('td.act').find('input:checkbox').prop("checked", true);
									} else{
										 $(this).find('td.act').find('input:checkbox').removeAttr('checked');
									}
								
									
								});
								
							$('#atype').click(
										function(event) {
											$("select#atype option:first").attr('hidden','hidden');
										});
						    
						    
						    $('#empnameWise').click(
										function(event) {
											$("select#empnameWise option:first").attr('hidden','hidden');
										});
						    
						    $('#cs').click(
										function(event) {
											$("select#cs option:first").attr('hidden','hidden');
										});
							 
						    
						    
							 
							 $('#btn').click(
										function(event) {
											$('#myModal1').modal('hide');
											$('#myModal2').modal('hide');
											$('#myModal22').modal('hide');
											$('#myModal77').modal('hide');
											$('#process').modal('show');
										});
							 
							 
								$("#mb1").click(
										function() {
											if ($('#mb1').is(':checked')) {
												$("#txtmb1").attr("disabled", false);
											} else {
												$("#txtmb1").attr("disabled", true);

											}

											var e = document.getElementById("mbmsg");
											e.style.display = (e.style.display == 'block') ? 'none'
													: 'block';

										});

								$("#d1").button().click(function() {
									var e = document.getElementById("tincst");
									e.style.display = 'block';
								});

								$("#c1").button().click(function() {
									var e = document.getElementById("tincst");
									e.style.display = 'none';
								});

								$("#da").click(
										function() {
											
											var e = document.getElementById("daddrs");
											e.style.display = (e.style.display == 'block') ? 'none'
													: 'block';
										});	
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								var $sum = 0;
								var $sno = 0;
								var $tag = 0;
								var $oa = 0;
								var h = 0;
								
								var qtyNo = "";
								var $oqty = 0;
								var $oidno = 0;
								
								$('select#saao').on('change', function() {
									var $dc = $(this).find(":selected").val();			    
								    $.get('GetCmpByODCID', {
								    	a1 : $dc
									}, function(responseJson) {
										$.each(responseJson, function(key, value) {								   
											$("#cstcmpname1").val(value);
											 $("#cstcmpid").val(key);
										});
									});
								    
								});

								$('.saanotherOne')
										.click(
												function(event) {
												
													$sno = $("input#sanp").val();
													$sum = $("input#sasum").val();

													if ($sno == "") {
														$sno = 0;
													}

													var $dc = $("select#saao").val();
													var $d_id = $("input#cstcmpid").val();

													if ($dc == null) {
														bootbox.alert("Enter Correct ODC Number");
													} else {
														if ($d_id == "") {
															bootbox.alert("Select Customer Name");
														} else {

															$
																	.get(
																			'GetProductODCWise',
																			{
																				a1 : $dc,
																				a2 : $d_id
																			},
																			function(
																					responseJson) {

																				if (responseJson != null) {
																					
																					$(
																							"#saao option[value='"
																									+ $dc + "']")
																							.remove();

																					var line = "";
																					var div = $("<div>");
																					line = line
																							+ GetDynamicTextBox1($dc);
																					div
																							.html(line);
																					$(
																							"#saanotherOneDetails")
																							.append(
																									div);

																					// $("#editable-sample").find("tr:gt(0)").remove();

																					var table1 = $("#saproductadd1");

																					$
																							.each(
																									responseJson,
																									function(
																											key,
																											value) {

																										

																										var $r4 = value['total'];

																										$sno = ($sno * 1) + 1;
																										$sum = ($sum * 1)
																												+ ($r4 * 1);
																										
																										h =($sno * 1) + 100;

																										var rowNew = $("<tr class='tableRow'><td style='display: none;' class='sasno' >"
																												+ h
																												+ "</td>"
																												+ "<td class='sapname'></td>"
																												+ "<td style='display: none;' class='sapcode'></td>"
																												+ "<td class='sappq'></td>"
																												+ "<td class='saqty'></td>"
																												+ "<td class='saamt'></td>"
																												+ "<td class='satax'></td>"
																												+ "<td class='sataxamt'></td>"
																												+ "<td class='sanetamt'></td>"
																												+ "<td><button type='button' class='btn btn-info' id='saeditProduct'><i class='fa fa-edit'></i></button></td>"
																												+ "<td></td>"
																												+ "<td class='saslnos' ></td><td class='padcid' ></td>"
																												+ "<td class='id' ></td></tr>");

																										rowNew
																												.children()
																												.eq(
																														1)
																												.text(
																														value['prodid']);
																										rowNew
																												.children()
																												.eq(
																														2)
																												.text(
																														value['pname']);
																										rowNew
																												.children()
																												.eq(
																														3)
																												.text(
																														value['price']);
																										rowNew
																												.children()
																												.eq(
																														4)
																												.text(
																														value['quantity']);
																										rowNew
																												.children()
																												.eq(
																														5)
																												.text(
																														value['amount']);
																										rowNew
																												.children()
																												.eq(
																														6)
																												.text(
																														value['tax']);
																										rowNew
																												.children()
																												.eq(
																														7)
																												.text(
																														value['taxamount']);
																										rowNew
																												.children()
																												.eq(
																														8)
																												.text(
																														value['total']);
																										rowNew
																												.children()
																												.eq(
																														11)
																												.text(
																														value['slnos']);
																										rowNew
																												.children()
																												.eq(
																														12)
																												.text(
																														value['qid']);

																										rowNew
																												.children()
																												.eq(
																														13)
																												.text(
																														value['id']);

																										rowNew
																												.appendTo(table1);

																									});

																					$(
																							"input#sasum")
																							.val(
																									$sum
																											.toFixed(2));
																					$(
																							"input#satot")
																							.val(
																									$sum
																											.toFixed(2));
																					$(
																							"input#sanp")
																							.val(
																									$sno);

																				} else {
																						bootbox.alert("Enter Correct Customer Name..")
																				}

																			});
														}

													}

												});

								$('#saquan').click(function(event) {
									
									$("#TextBoxContainer").css("display", "block");	
								});

								$("#saquan").on('keypress', function(event) {
									if (event.which === 13) {
										$("#TextBoxContainer").css("display", "block");
										var $a3 = $("input#saquan").val();
										var $a4 = $("input#saamount").val();
										if (!($.isNumeric($a3))) {
											// bootbox.alert("Enter valid values");
											$("input#saquan").val("");
											$("input#satax").val("");
											$("input#sat1").val("");
											$("input#sat2").val("");
											$("input#sat3").val("");
											$('#TextBoxContainer div').empty();

										} else {
											
											var $stock = $("#stk").val();
											
											$("#TextBoxContainer").css("display", "block");
											
											if($stock*1 < $a3*1){
												bootbox.alert("Stock is avaliable only... "+$stock);
												$("input#saquan").val("");
											}else{
											
											
											if($oqty !=$a3){
												$oidno = "";
											}										
											}											
											
											var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
											$("input#sat1").val($r1);
											$("input#sat3").val($r1);
											
										}
									}else {
										var $a3 = $("input#saquan").val();
										var $stock = $("#stk").val();
										$("#TextBoxContainer").css("display", "none");
										if (!($.isNumeric($a3))) {
											// bootbox.alert("Enter valid values");
											$("input#saquan").val("");						

										} else {

											if($stock*1 <$a3*1){
												bootbox.alert("Stock is avaliable only "+$stock);
												$("input#saquan").val("");
											}else{
											
										
										}
									}
									}
								});

								

								$("#saquan").keyup(function(e) {
									var $stock = $("#stk").val();
									var $a3 = $("input#saquan").val();
									var $a4 = $("input#saamount").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#saquan").val("");
										$("input#satax").val("");
										$("input#sat1").val("");
										$("input#sat2").val("");
										$("input#sat3").val("");

									} else {
										
										if($stock*1 < $a3*1){
											$("input#saquan").val("");
											bootbox.alert("Stock is avaliable only "+$stock);
										}else{
											
											$("#TextBoxContainer").empty();
										
										var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
										$("input#sat1").val($r1);
										$("input#sat3").val($r1);
										
										
										var qty = $("#stk").val();
										var ids = $("#ids").val();
										var slnos =$("#slnos").val();
										
										var id = ids.split(",");
										var slno = slnos.split(",");

										var i;
										var line = "";
										var div = $("<div>");
										for (i = 0; i < qty; i++) {
												line = line + GetDynamicTextBoxODC(id[i], slno[i]);							
										}

										div.html(line);
										$("#TextBoxContainer").append(div);
										}
										
									}

								});

								$("#saamount").keyup(function(e) {
									var $a3 = $("input#saamount").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#saamount").val("");
									}

								});

								$("#satax").keyup(function(e) {
									$("#TextBoxContainer").css("display", "none");
									var $a3 = $("input#satax").val();
									var $a4 = $("input#sat1").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#satax").val("");
										$("input#sat2").val("");
										var $a1 = $("input#saquan").val();
										var $a2 = $("input#saamount").val();
										var $r1 = (($a1 * 1) * ($a2 * 1)).toFixed(2);
										$("input#sat1").val($r1);
										$("input#sat3").val($r1);

									} else {

										var $r3 = (($a4 * $a3) / 100).toFixed(2);
										var $r4 = (($a4 * 1) + ($r3 * 1)).toFixed(2);
										$("input#sat2").val($r3);
										$("input#sat3").val($r4);
									}

								});

								$("#sadis").keyup(function(e) {
									var $a3 = $("input#sadis").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#sadis").val("");
									}

								});

								$("#sadis1").keyup(function(e) {
									var $a3 = $("input#sadis1").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#sadis1").val("");
									}

								});

								$('#sadis').keyup(function(event) {

									var $b1 = $("input#sasum").val();
									var $b2 = $("input#sadis").val();
									var $r2 = 0;
									var $r1 = 0;

									$("input#sadis1").val("");

									if ($b1 == "") {
										bootbox.alert("Add Product first.....");
										$("input#sadis").val("");
									} else {

										if ($.isNumeric($b2)) {
											$r2 = (($b1 * $b2) / 100).toFixed(2);

											$("input#sadis1").val($r2);

										} else {

										}

									}
									$r1 = (($b1 * 1) - ($r2 * 1)).toFixed(2);

									$("input#satot").val($r1);

								});

								$('#padis1').keyup(function(event) {

									var $b1 = $("input#sasum").val();
									var $b2 = $("input#sadis1").val();
									var $r2 = 0;
									var $r1 = 0;

									$("input#sadis").val("");

									if ($b1 == "") {
										bootbox.alert("Add Product first.....");
										$("input#sadis1").val("");

									} else {

										if ($.isNumeric($b2)) {

											$r1 = (($b1 * 1) - ($b2 * 1)).toFixed(2);

											$r2 = (($b2 / $b1) * 100).toFixed(2);

											$("input#sadis").val($r2);

										} else {
											$r1 = $b1;
										}

									}

									$("input#satot").val($r1);

								});

								$('#saplus')
										.click(
												function(event) {
													$("#TextBoxContainer").css("display",
															"none");
													var $qid = $("input#said").val();
													var $code = $("input#satt").val();
													var $a1 = $("input#itemname").val();
													var $a2 = $("input#pid").val();
													var $a3 = $("input#saquan").val();
													var $a4 = $("input#saamount").val();
													var $a6 = $("input#satax").val();

													var $id = $("input#id").val();

													var ids = "";
													
													var qty = $("#stk").val();
													var idvalues = $("#ids").val();
													
													var idvalue = idvalues.split(",");
													
													for (i = 0; i < qty; i++) {
														
														if($('#CHK'+idvalue[i]).is(':checked')) {
															
															ids = ids
															+ idvalue[i]
															+ ",";
														} else {
															
														}					
												}
													
													if (ids == "") {
														for (i = 0; i < qty; i++) {
															ids = ids												
															+ ",";
														}
													} 

													$a4 = ($a4 * 1).toFixed(2);
													$a6 = ($a6 * 1).toFixed(2);

													if ($qid == "") {
														bootbox.alert("Enter Id..");
													} else {

														if (!($.isNumeric($a3))
																|| !($.isNumeric($a4))) {
															// bootbox.alert("Valid values are
															// required1.");

															if ($a2 == "" || $a4 == ""
																	|| $a3 == "") {
																// bootbox.alert("Valid values are
																// required.");
															}

														} else {

															if ($a2 == "" || $a4 == ""
																	|| $a3 == "") {
																bootbox.alert("Valid values are required.");
															} else {

																var $r1, $r2 = 0, $r3, $r4;

																$a4 = ($a4 * 1).toFixed(2);

																$r1 = (($a4 * 1) * ($a3 * 1))
																		.toFixed(2);

																/*
																 * if ($a5 == "") { $r2 = 0;
																 * $a5 = 0; } else { if
																 * ($.isNumeric($a5)) { $r2 =
																 * (($r1 * $a5) /
																 * 100).toFixed(2); } else {
																 * bootbox.alert("Valid values are
																 * required."); } }
																 */

																if ($a6 == "") {
																	$r3 = 0;
																	$a6 = 0;
																} else {
																	if ($.isNumeric($a6)) {
																		$r3 = (($r1 * $a6) / 100)
																				.toFixed(2);
																	} else {
																		bootbox.alert("Valid values are required.");
																	}

																}

																$r4 = (($r1 * 1) + ($r3 * 1))
																		.toFixed(2);

																$sum = ($sum * 1)
																		+ ($r4 * 1);

																if ($tag == 0) {

																	
																		$sno = ($sno * 1) + 1;
																		var $val = ($sno * 1) + 100;

																		var newRowContent = "<tr class='tableRow'><td style='display: none;' class='sasno'>"
																				+ $val
																				+ "</td><td class='sapname'>"
																				+ $a1
																				+ "</td><td style='display: none;' class='sapcode'>"
																				+ $a2
																				+ "</td><td class='sappq'>"
																				+ $a4
																				+ "</td><td class='saqty'>"
																				+ $a3
																				+ "</td><td class='saamt'>"
																				+ $r1
																				// +
																				// "</td><td>"
																				// +
																				// $a5
																				// +
																				// "</td><td>"
																				// +
																				// $r2
																				+ "</td><td class='satax'>"
																				+ $a6
																				+ "</td><td class='sataxamt'>"
																				+ $r3
																				+ "</td><td class='sanetamt'>"
																				+ $r4
																				+ "</td>"
																				+ "<td><button type='button' class='btn btn-info tooltips' id='saeditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																				+ "<td><button type='button' class='btn btn-danger tooltips' id='sadelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='paslnos' >"
																				+ ids
																				+ "</td><td class='sadcid' >"
																				+ $qid
																				+ "</td><td class='id' >"
																				+ $id
																				+ "</td></tr>";
																		$(
																				"#saproductadd1 tbody")
																				.append(
																						newRowContent);
																	
																} else {

																	var $rows = $(
																			"#saproductadd1")
																			.find(
																					"td:contains('"
																							+ $tag
																							+ "')")
																			.closest('tr');

																	var $columns = $($rows)
																			.find("td");

																	$sum = ($sum * 1)
																			- ($oa * 1);

																	$("input#sasum")
																			.val(
																					$sum
																							.toFixed(2));
																	$("input#satot")
																			.val(
																					$sum
																							.toFixed(2));

																	$($columns[1])
																			.text($a1);
																	$($columns[2])
																			.text($a2);
																	$($columns[3])
																			.text($a4);
																	$($columns[4])
																			.text($a3);
																	$($columns[5])
																			.text($r1);
																	$($columns[6])
																			.text($a6);
																	$($columns[7])
																			.text($r3);
																	$($columns[8])
																			.text($r4);
																	$($columns[11]).text(
																			ids);

																}

																$("input#sasum").val(
																		$sum.toFixed(2));
																$("input#satot").val(
																		$sum.toFixed(2));

																$("input#itemname").val("");
																$("input#saquan").val("");
																$("input#pid").val("");
																$("input#saamount").val("");
																$("input#sadis").val("");
																$("input#sadis1").val("");
																$("input#satax").val("");
																$("input#satt").val("");
																$("input#sat1").val("");
																$("input#sat2").val("");
																$("input#sat3").val("");
																$('input#itemname').focus();
																$("textarea#sadesc")
																		.val("");
																$("input#sauom").val("");
																$('#saslnos').html("");
																$("input#sadcid").val("");
																$("input#id").val("");

																$("#saquan").prop(
																		"disabled", false);

																$("input#sanp").val($sno);
																$tag = 0;

															}
														}
													}

												});

								$('#saplus11')
										.click(
												function(event) {
													$("#TextBoxContainer").css("display",
															"none");
													$sno = $("input#sanp").val();
													$sum = $("input#sasum").val();

													var $qid = $("input#said").val();
													var $code = $("input#satt").val();
													var $a1 = $("input#itemname").val();
													var $a2 = $("input#pid").val();
													var $a3 = $("input#saquan").val();
													var $a4 = $("input#saamount").val();
													var $a6 = $("input#satax").val();

													var $id = $("input#id").val();

													var ids = "";
															
															var qty = $("#stk").val();
															var idvalues = $("#ids").val();
															
															var idvalue = idvalues.split(",");
															
															for (i = 0; i < qty; i++) {
																
																if($('#CHK'+idvalue[i]).is(':checked')) {
																	
																	ids = ids
																	+ idvalue[i]
																	+ ",";
																} else {
																	
																}					
														}
															
															if (ids == "") {
																for (i = 0; i < qty; i++) {
																	ids = ids												
																	+ ",";
																}
															} 
															
															
													$a4 = ($a4 * 1).toFixed(2);
													$a6 = ($a6 * 1).toFixed(2);

													if ($qid == "") {
														bootbox.alert("Enter Id..");
													} else {

														if (!($.isNumeric($a3))
																|| !($.isNumeric($a4))) {
															// bootbox.alert("Valid values are
															// required1.");

															if ($a2 == "" || $a4 == ""
																	|| $a3 == "") {
																bootbox.alert("Valid values are required."
																		+ $a2
																		+ "          "
																		+ $a4
																		+ "          "
																		+ $a3
																		+ "          ");
															}

														} else {

															if ($a2 == "" || $a4 == ""
																	|| $a3 == "") {
																bootbox.alert("Valid values are required.");
															} else {

																var $r1, $r2 = 0, $r3, $r4;

																$a4 = ($a4 * 1).toFixed(2);

																$r1 = (($a4 * 1) * ($a3 * 1))
																		.toFixed(2);

																/*
																 * if ($a5 == "") { $r2 = 0;
																 * $a5 = 0; } else { if
																 * ($.isNumeric($a5)) { $r2 =
																 * (($r1 * $a5) /
																 * 100).toFixed(2); } else {
																 * bootbox.alert("Valid values are
																 * required."); } }
																 */

																if ($a6 == "") {
																	$r3 = 0;
																	$a6 = 0;
																} else {
																	if ($.isNumeric($a6)) {
																		$r3 = (($r1 * $a6) / 100)
																				.toFixed(2);
																	} else {
																		bootbox.alert("Valid values are required.");
																	}

																}

																$r4 = (($r1 * 1) + ($r3 * 1))
																		.toFixed(2);

																
																$sum = ($sum * 1)
																		+ ($r4 * 1);
																
																if ($tag == 0) {

																	

																		$sno = ($sno * 1) + 1;
																		var $val = ($sno * 1) + 100;

																		var newRowContent = "<tr class='tableRow'><td style='display: none;' class='sasno'>"
																				+ $val
																				+ "</td><td class='sapname'>"
																				+ $a1
																				+ "</td><td style='display: none;' class='sapcode'>"
																				+ $a2
																				+ "</td><td class='sappq'>"
																				+ $a4
																				+ "</td><td class='saqty'>"
																				+ $a3
																				+ "</td><td class='saamt'>"
																				+ $r1
																				// +
																				// "</td><td>"
																				// +
																				// $a5
																				// +
																				// "</td><td>"
																				// +
																				// $r2
																				+ "</td><td class='satax'>"
																				+ $a6
																				+ "</td><td class='sataxamt'>"
																				+ $r3
																				+ "</td><td class='sanetamt'>"
																				+ $r4
																				+ "</td>"
																				+ "<td><button type='button' class='btn btn-info tooltips' id='saeditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																				+ "<td><button type='button' class='btn btn-danger tooltips' id='sadelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='saslnos' >"
																				+ ids
																				+ "</td><td class='sadcid' >"
																				+ $qid
																				+ "</td><td class='id' >"
																				+ $id
																				+ "</td></tr>";
																		$(
																				"#saproductadd1 tbody")
																				.append(
																						newRowContent);
																	
																} else {

																	var $rows = $(
																			"#saproductadd1")
																			.find(
																					"td:contains('"
																							+ $tag
																							+ "')")
																			.closest('tr');

																	var $columns = $($rows)
																			.find("td");

																	$sum = ($sum * 1)
																			- ($oa * 1);

																	$("input#sasum")
																			.val(
																					$sum
																							.toFixed(2));
																	$("input#satot")
																			.val(
																					$sum
																							.toFixed(2));

																	$($columns[1])
																			.text($a1);
																	$($columns[2])
																			.text($a2);
																	$($columns[3])
																			.text($a4);
																	$($columns[4])
																			.text($a3);
																	$($columns[5])
																			.text($r1);
																	$($columns[6])
																			.text($a6);
																	$($columns[7])
																			.text($r3);
																	$($columns[8])
																			.text($r4);
																	$($columns[11]).text(
																			ids);

																}

																$("input#sasum").val(
																		$sum.toFixed(2));
																$("input#satot").val(
																		$sum.toFixed(2));

																$("input#itemname").val("");
																$("input#saquan").val("");
																$("input#pid").val("");
																$("input#saamount").val("");
																$("input#sadis").val("");
																$("input#sadis1").val("");
																$("input#satax").val("");
																$("input#satt").val("");
																$("input#sat1").val("");
																$("input#sat2").val("");
																$("input#sat3").val("");
																$('input#itemname').focus();
																$("textarea#padesc")
																		.val("");
																$("input#sauom").val("");
																$('#saslnos').html("");
																$("input#sadcid").val("");
																$("input#id").val("");

																$("#saquan").prop(
																		"disabled", false);

																$("input#sanp").val($sno);
																$tag = 0;

															}
														}
													}

												});

								$(document).on("click", "#saclear", function() {
									$("#TextBoxContainer").css("display", "none");
									$("input#satt").val("");
									$("input#itemname").val("");
									$("input#pid").val("");
									$("input#saquan").val("");
									$("input#saamount").val("");
									$("input#satax").val("");
									$("input#satt").val("");
									$("input#sat1").val("");
									$("input#sat2").val("");
									$("input#sat3").val("");
									$("textarea#sadesc").val("");
									$("input#sauom").val("");
									$('#paslnos').html("");
									$("input#sadcid").val("");
									$("input#id").val("");
									$('input#itemname').focus();
									$tag = 0;

								});

								$(document).on(
										"click",
										"#saeditProduct",
										function() {

											$sno = $("input#sanp").val();
											$sum = $("input#sasum").val();

											$tag = $(this).closest('tr').find('td:first')
													.text()

											$("input#itemname").val(
													$(this).closest('tr').find('td:first')
															.next().text());
											$("input#pid").val(
													$(this).closest('tr').find('td:first')
															.next().next().text());
											$("input#saquan").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.text());
											$("input#sat1").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().text());
											$("input#saamount").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().text());

											$("input#satax").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().next().text());
											$("input#sat2").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().next().next().text());
											$("input#sat3").val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().next().next().next()
															.text());
											$('#saslnos').html(
													$(this).closest('tr').find('td:first')

													.next().next().next().next().next()
															.next().next().next().next()
															.next().next().text());
											$('input#sadcid').val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().next().next().next()
															.next().next().next().next()
															.text());
											$('input#id').val(
													$(this).closest('tr').find('td:first')
															.next().next().next().next()
															.next().next().next().next()
															.next().next().next().next()
															.next().text());

											var $dcid = $(this).closest('tr').find('td:first')
											.next().next().next().next()
											.next().next().next().next()
											.next().next().next().next()
											.text();

											if ($dcid == "") {
												$("#saquan").prop("disabled", false);
											} else {
												$("#saquan").prop("disabled", true);
											}

											
											
											var qty = $(this).closest('tr')
											.find('td:first').next().next().next()
											.text();
									
									var $odc_id= $("input#odcqid").val();

									var $itemname = $("input#itemname").val();
									$.get('GetItemDetails', {
										itemname : $itemname,
										odc_id : $odc_id
									}, function(responseJson) {
										$.each(responseJson, function(key11, value11) {
											$('#pid').val(value11[0]);
											$('#desc').val(value11[1]);
											$('#uom').val(value11[2]);
											$('#amount').val(value11[4]);
											$('#stk').val(value11[8]);
											$('#ids').val(value11[6]);
											$('#slnos').val(value11[7]);
											
											$("#TextBoxContainer").empty();
											
											var qty1 = $("#stk").val();
											var ids = $("#ids").val();
											var slnos =$("#slnos").val();
											
											var odcslnos =$("input#odcslnos").val();
											var odcslno = odcslnos.split(",");
											
											var id = ids.split(",");
											var slno = slnos.split(",");
											
											var i;
											var line = "";
											var div = $("<div>");
											var found = false;
											
											for (i = 0; i < qty1; i++) {
												
												for (var j = 0; j < odcslno.length && !found; j++) {
												  if (odcslno[j] === id[i]) {
												    found = true;
												  }
												}
												
												if(found){
													line = line + GetDynamicTextBoxODC1(id[i], slno[i]);
												}else{
													line = line + GetDynamicTextBoxODC(id[i], slno[i]);
												}
												found = false;							
											}

											div.html(line);
											$("#TextBoxContainer").append(div);
											
											$("#TextBoxContainer").css("display",
											"none");
											
											
										});
									});
									
											
											

											$('input#itemname').focus();

											$oa = $("input#sat3").val();
											$sno = $("input#sanp").val();
											$sum = $("input#sasum").val();

										});

								$(document).on(
										"click",
										"#sadelproducts",
										function() {
											$("#TextBoxContainer").css("display", "none");
											$sum = $("input#sasum").val();
											$sno = $("input#sanp").val();

											var $row = $(this).closest("tr");
											var $v5 = $row.find('td:first').next().next()
													.next().next().next().next().next()
													.next().text();
											$sum = ($sum * 1) - ($v5 * 1);

											if ($sum == "-0.00") {
												$("input#sasum").val("");
												$("input#satot").val("");
											} else {
												$("input#sasum").val($sum.toFixed(2));
												$("input#satot").val($sum.toFixed(2));
											}

											var $qid = $row.find('td:first').text();

											$row.remove();

											$sno = ($sno * 1) - 1;

											$("input#sanp").val($sno);

											$("input#itemname").val("");
											$("input#saquan").val("");
											$("input#pid").val("");
											$("input#saamount").val("");
											$("input#sadis").val("");
											$("input#sadis1").val("");
											$("input#satax").val("");
											$("input#satt").val("");
											$("input#sat1").val("");
											$("input#sat2").val("");
											$("input#sat3").val("");
											$('input#itemname').focus();
											$("textarea#sadesc").val("");
											$("input#sauom").val("");
											$('#saslnos').html("");
											$("input#sadcid").val("");
											$("input#id").val("");
											$tag = 0;

										});

								$('#btn6').click(function(event) {
									$('#btnid').val("addP");
									var $qid = $("input#paid").val();

									var tableData = new Array(); // we will store rows'
									// data into this array
									$("#saproductadd1") // select table by id
									.find(".tableRow").each(function() { // for each
										// selected row
										// extract data
										var tableRow = {};
										var jRow = $(this);
										tableRow.qid = $qid;
										tableRow.pname = jRow.find('td.sapname').text();
										tableRow.pcode = jRow.find('td.sapcode').text();
										tableRow.ppq = jRow.find('td.sappq').text();
										tableRow.qty = jRow.find('td.saqty').text();
										tableRow.amt = jRow.find('td.saamt').text();
										tableRow.tax = jRow.find('td.satax').text();
										tableRow.taxamt = jRow.find('td.sataxamt').text();
										tableRow.netamt = jRow.find('td.sanetamt').text();
										tableRow.slnos = jRow.find('td.saslnos').text();
										tableRow.dcid = jRow.find('td.sadcid').text();
										tableRow.id = jRow.find('td.id').text();
										tableData.push(tableRow);

									});

									jQuery.ajax({
										url : "AddSalesProducts",
										data : JSON.stringify(tableData),
										success : function() {
											console.log(JSON.stringify(tableData));
											// alert(JSON.stringify(tableData));
										},
										error : function(data) {
											console.log("Error: ", data);
										},
										type : "post",
										timeout : 30000
									});

								//	$('#myform').submit();
									$('#process').modal('show');
								});

								$('#btn61').click(function(event) {
									$('#btnid').val("updateP");
									var $qid = $("input#paid").val();
									var tableData = new Array(); // we will store rows'
									// data into this array
									$("#saproductadd1") // select table by id
									.find(".tableRow").each(function() { // for each
										// selected row
										// extract data
										var tableRow = {};
										var jRow = $(this);
										tableRow.qid = $qid;
										tableRow.pname = jRow.find('td.sapname').text();
										tableRow.pcode = jRow.find('td.sapcode').text();
										tableRow.ppq = jRow.find('td.sappq').text();
										tableRow.qty = jRow.find('td.saqty').text();
										tableRow.amt = jRow.find('td.saamt').text();
										tableRow.tax = jRow.find('td.satax').text();
										tableRow.taxamt = jRow.find('td.sataxamt').text();
										tableRow.netamt = jRow.find('td.sanetamt').text();
										tableRow.slnos = jRow.find('td.saslnos').text();
										tableRow.dcid = jRow.find('td.sadcid').text();
										tableRow.id = jRow.find('td.id').text();
										tableData.push(tableRow);

									});

									jQuery.ajax({
										url : "AddSalesProducts",
										data : JSON.stringify(tableData),
										success : function() {
											console.log(JSON.stringify(tableData));
											// alert(JSON.stringify(tableData));
										},
										error : function(data) {
											console.log("Error: ", data);
										},
										type : "post",
										timeout : 30000
									});

									$('#myform').submit();
									$('#myModal1').modal('hide');
									$('#process').modal('show');
								});

								$('#btn62').click(function(event) {
									$('#btnid').val("deleteP");
									$('#myform').submit();
									$('#myModal2').modal('hide');
									$('#process').modal('show');
								});
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
													
						});
	</script>

	<script type="text/javascript">
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

	<script type="text/javascript" >
	jQuery(document).ready(function() { EditableTable.init(); }); </script> 
	<script	src="styles/plugins/morris/morris.min.js" type="text/javascript"></script>
	<script src="styles/plugins/morris/raphael-min.js" type="text/javascript"></script>
	<script src="styles/plugins/title/jquery.mfancytitle-0.4.1.min.js" type="text/javascript"> 
	
	<script type="text/javascript">
	$(document).ready(function() {
	
		$.mFancyTitle({
			mftTitleMarqueeDelay: [500, 1000] // the document title will wait 500 msec after every movement in visible state and 1 sec in hidden state
		});
		
	});
	</script>

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
		
	</script> <script LANGUAGE="JavaScript">
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
	</script> 
	
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

}


</script>
	

<script type="text/javascript" src="styles/jss/pdf.js"></script> <script
		type="text/javascript" src="styles/js/js/html2canvas.min.js"></script>
	<script type="text/javascript" src="styles/js/js/jspdf.debug.js"></script>
	
	
</body>
</html>
