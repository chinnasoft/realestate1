$(document)
		.ready(
				function() {

					    var $sum = 0;
						var $sno = 0;
						var $tag = 0;
						var $oa = 0;						
						
						$("#quan").keyup(function(e) {
							
							var $a3 = $("input#quan").val();
							var $a4 = $("input#amount").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#quan").val("");
								$("input#tax").val("");
								$("input#t1").val("");
								$("input#t2").val("");
								$("input#t3").val("");								
								
							} else {
								var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
								$("input#t1").val($r1);
								$("input#t3").val($r1);
								
								$('#TextBoxContainer div').empty();
								
								var qty = $("input#quan").val();
								
								var i;
								var line="";
								var div = $("<div>");
								for (i = 0; i < qty; i++) {
									
							       // div = div+div.html('<div class="form-group"><label class="col-sm-3 control-label">Quantity</label><div class="col-md-6"><input parsley-type="number" type="text" class="form-control" id="qty" name="qty" parsley-minlength="1" parsley-maxlength="100" placeholder="Enter Quantity"  /></div></div>');										       
							      line=line+GetDynamicTextBox(i+1);
									
								}
								
								div.html(line);
							     $("#TextBoxContainer").append(div);
							   //  $('#SLNO1').focus();
							}

						});

						$("#amount").keyup(function(e) {
							var $a3 = $("input#amount").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#amount").val("");
							}

						});

						$("#tax").keyup(function(e) {
							$("#TextBoxContainer").css("display","none");
							var $a3 = $("input#tax").val();
							var $a4 = $("input#t1").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#tax").val("");
								$("input#t2").val("");
								var $a1 = $("input#quan").val();
								var $a2 = $("input#amount").val();
								var $r1 = (($a1 * 1) * ($a2 * 1)).toFixed(2);
								$("input#t1").val($r1);
								$("input#t3").val($r1);

							} else {

								var $r3 = (($a4 * $a3) / 100).toFixed(2);
								var $r4 = (($a4 * 1) + ($r3 * 1)).toFixed(2);
								$("input#t2").val($r3);
								$("input#t3").val($r4);
							}

						});

						$("#dis").keyup(function(e) {
							var $a3 = $("input#dis").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#dis").val("");
							}

						});

						$("#dis1").keyup(function(e) {
							var $a3 = $("input#dis1").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#dis1").val("");
							}

						});

						$('#dis').keyup(function(event) {

							var $b1 = $("input#sum").val();
							var $b2 = $("input#dis").val();
							var $r2 = 0;
							var $r1 = 0;

							$("input#dis1").val("");

							if ($b1 == "") {
								bootbox.alert("Add Product first.....");
								$("input#dis").val("");
							} else {

								if ($.isNumeric($b2)) {
									$r2 = (($b1 * $b2) / 100).toFixed(2);

									$("input#dis1").val($r2);

								} else {

								}

							}
							$r1 = (($b1 * 1) - ($r2 * 1)).toFixed(2);

							$("input#tot").val($r1);

						});

						$('#dis1').keyup(function(event) {

							var $b1 = $("input#sum").val();
							var $b2 = $("input#dis1").val();
							var $r2 = 0;
							var $r1 = 0;

							$("input#dis").val("");

							if ($b1 == "") {
								bootbox.alert("Add Product first.....");
								$("input#dis1").val("");

							} else {

								if ($.isNumeric($b2)) {

									$r1 = (($b1 * 1) - ($b2 * 1)).toFixed(2);

									$r2 = (($b2 / $b1) * 100).toFixed(2);

									$("input#dis").val($r2);

								} else {
									$r1 = $b1;
								}

							}

							$("input#tot").val($r1);

						});

						$('#plus')
								.click(
										function(event) {
											$("#TextBoxContainer").css("display","none");
											var $qid = $("input#qid").val();
											var $code = $("input#tt").val();
											var $a1 = $("input#itemname").val();
											var $a2 = $("input#pid").val();
											var $a3 = $("input#quan").val();
											var $a4 = $("input#amount").val();
											var $a6 = $("input#tax").val();
											
											var slnos="";
											
											for (i = 1; i <= $a3; i++) {
											    slnos =slnos + $("input#SLNO"+i).val()+",";
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
														
															var newRowContent = "<tr class='tableRow'><td style='display: none;' class='sno'>"
																	+ $val
																	+ "</td><td class='pname'>"
																	+ $a1
																	+ "</td><td style='display: none;' class='pcode'>"
																	+ $a2
																	+ "</td><td class='ppq'>"
																	+ $a4
																	+ "</td><td class='qty'>"
																	+ $a3
																	+ "</td><td class='amt'>"
																	+ $r1
																	// +
																	// "</td><td>"
																	// +
																	// $a5
																	// +
																	// "</td><td>"
																	// +
																	// $r2
																	+ "</td><td class='tax'>"
																	+ $a6
																	+ "</td><td class='taxamt'>"
																	+ $r3
																	+ "</td><td class='netamt'>"
																	+ $r4
																	+ "</td>"
																	+ "<td><button type='button' class='btn btn-info tooltips' id='editProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																	+ "<td><button type='button' class='btn btn-danger tooltips' id='delproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='slnos' style='display: none;'>"+slnos+"</td></tr>";
															$("#productadd1 tbody")
																	.append(
																			newRowContent);
														} else {

															var $rows = $(
																	"#productadd1")
																	.find(
																			"td:contains('"
																					+ $tag
																					+ "')")
																	.closest('tr');

															var $columns = $($rows)
																	.find("td");

															
															$sum = ($sum * 1) - ($oa * 1);

															$("input#sum")
																	.val(
																			$sum
																					.toFixed(2));
															$("input#tot")
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
															$($columns[11])
															.text(slnos);

														}

														$("input#sum").val(
																$sum.toFixed(2));
														$("input#tot").val(
																$sum.toFixed(2));

														$("input#itemname").val("");
														$("input#quan").val("");
														$("input#pid").val("");
														$("input#amount").val("");
														$("input#dis").val("");
														$("input#dis1").val("");
														$("input#tax").val("");
														$("input#tt").val("");
														$("input#t1").val("");
														$("input#t2").val("");
														$("input#t3").val("");
														$('input#itemname').focus();
														$("textarea#desc").val("");
														$("input#uom").val("");
														$('#slnos').html("");
														

														$("input#np").val($sno);
														$tag = 0;

													}
												}
											}

										});

						$('#plus11')
								.click(
										function(event) {
											$("#TextBoxContainer").css("display","none");
											$sno = $("input#np").val();
											$sum = $("input#sum").val();
										
											var $qid = $("input#qid").val();
											var $code = $("input#tt").val();
											var $a1 = $("input#itemname").val();
											var $a2 = $("input#pid").val();
											var $a3 = $("input#quan").val();
											var $a4 = $("input#amount").val();
											var $a6 = $("input#tax").val();
											

											var slnos="";
											
											for (i = 1; i <= $a3; i++) {
											    slnos =slnos + $("input#SLNO"+i).val()+",";
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
														 bootbox.alert("Valid values are required."+$a2+"          "+$a4+"          "+$a3+"          ");
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

															var newRowContent = "<tr class='tableRow'><td style='display: none;' class='sno'>"
																	+ $val
																	+ "</td><td class='pname'>"
																	+ $a1
																	+ "</td><td style='display: none;' class='pcode'>"
																	+ $a2
																	+ "</td><td class='ppq'>"
																	+ $a4
																	+ "</td><td class='qty'>"
																	+ $a3
																	+ "</td><td class='amt'>"
																	+ $r1
																	// +
																	// "</td><td>"
																	// +
																	// $a5
																	// +
																	// "</td><td>"
																	// +
																	// $r2
																	+ "</td><td class='tax'>"
																	+ $a6
																	+ "</td><td class='taxamt'>"
																	+ $r3
																	+ "</td><td class='netamt'>"
																	+ $r4
																	+ "</td>"
																	+ "<td><button type='button' class='btn btn-info tooltips' id='editProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																	+ "<td><button type='button' class='btn btn-danger tooltips' id='delproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='slnos' style='display: none;'>"+slnos+"</td></tr>";
															$("#productadd1 tbody")
																	.append(
																			newRowContent);
														} else {

															var $rows = $(
																	"#productadd1")
																	.find(
																			"td:contains('"
																					+ $tag
																					+ "')")
																	.closest('tr');

															var $columns = $($rows)
																	.find("td");
															
															
															
															$sum = ($sum * 1)
																	- ($oa * 1);
															
															

															$("input#sum")
																	.val(
																			$sum
																					.toFixed(2));
															$("input#tot")
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
															$($columns[11])
															.text(slnos);

														}
														
														

														$("input#sum").val(
																$sum.toFixed(2));
														$("input#tot").val(
																$sum.toFixed(2));

														$("input#itemname").val("");
														$("input#quan").val("");
														$("input#pid").val("");
														$("input#amount").val("");
														$("input#dis").val("");
														$("input#dis1").val("");
														$("input#tax").val("");
														$("input#tt").val("");
														$("input#t1").val("");
														$("input#t2").val("");
														$("input#t3").val("");
														$('input#itemname').focus();
														$("textarea#desc").val("");
														$("input#uom").val("");
														$('#slnos').html("");

														$("input#np").val($sno);
														$tag = 0;

													}
												}
											}

										});

						$(document).on("click", "#clear", function() {
							$("#TextBoxContainer").css("display","none");
							$("input#tt").val("");
							$("input#itemname").val("");
							$("input#pid").val("");
							$("input#quan").val("");
							$("input#amount").val("");
							$("input#tax").val("");
							$("input#tt").val("");
							$("input#t1").val("");
							$("input#t2").val("");
							$("input#t3").val("");
							$("textarea#desc").val("");
							$("input#uom").val("");
							$('#slnos').html("");
							$('input#itemname').focus();
							$tag = 0;

						});

						$(document).on(
								"click",
								"#editProduct",
								function() {

									$sno = $("input#np").val();
									$sum = $("input#sum").val();
									
									$tag = $(this).closest('tr').find('td:first')
											.text()

									$("input#itemname").val(
											$(this).closest('tr').find('td:first')
													.next().text());
									$("input#pid").val(
											$(this).closest('tr').find('td:first')
													.next().next().text());
									$("input#quan").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().next()
													.text());
									$("input#t1").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().next()
													.next().text());
									$("input#amount").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().text());

									$("input#tax").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().next()
													.next().next().text());
									$("input#t2").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().next()
													.next().next().next().text());
									$("input#t3").val(
											$(this).closest('tr').find('td:first')
													.next().next().next().next()
													.next().next().next().next()
													.text());
									$('#slnos').html($(this).closest('tr').find('td:first')
											.next().next().next().next()
											.next().next().next().next()
											.next().next().next()
											.text());
									
									
									$('#TextBoxContainer div').empty();
									
									var qty = $(this).closest('tr').find('td:first').next().next().next().next().text();
									
									var i;
									var line="";
									var div = $("<div>");
									for (i = 0; i < qty; i++) {
										line=line+GetDynamicTextBox(i+1);
									}
									
									div.html(line);
								     $("#TextBoxContainer").append(div);
								     
								     var sl=$(this).closest('tr').find('td:first')
										.next().next().next().next()
										.next().next().next().next()
										.next().next().next()
										.text();
								   
								     var res = sl.split(",");
								    
								     for (i = 1; i <= res.length; i++) {
										    $("input#SLNO"+i).val(res[i-1]);
										   
										}
								     
								     
								   //  $('#SLNO1').focus();
									
									
								     $("#TextBoxContainer").css("display","none"); 
									
									$('input#itemname').focus();
									
									  $oa=$("input#t3").val();
									  $sno = $("input#np").val();
									  $sum = $("input#sum").val();
										
								});

						$(document).on(
								"click",
								"#delproducts",
								function() {
									$("#TextBoxContainer").css("display","none");
									$sum = $("input#sum").val();
									$sno = $("input#np").val();

									var $row = $(this).closest("tr");
									var $v5 = $row.find('td:first').next().next()
											.next().next().next().next().next()
											.next().text();
									$sum = ($sum * 1) - ($v5 * 1);

									if ($sum == "-0.00") {
										$("input#sum").val("");
										$("input#tot").val("");
									} else {
										$("input#sum").val($sum.toFixed(2));
										$("input#tot").val($sum.toFixed(2));
									}

									var $qid = $row.find('td:first').text();

									$row.remove();

									$sno = ($sno * 1) - 1;

									$("input#np").val($sno);

									$("input#itemname").val("");
									$("input#quan").val("");
									$("input#pid").val("");
									$("input#amount").val("");
									$("input#dis").val("");
									$("input#dis1").val("");
									$("input#tax").val("");
									$("input#tt").val("");
									$("input#t1").val("");
									$("input#t2").val("");
									$("input#t3").val("");
									$('input#itemname').focus();
									$("textarea#desc").val("");
									$("input#uom").val("");
									$('#slnos').html("");
									$tag = 0;

								});


					$('#btn1').click(function(event) {
						$('#btnid').val("addP");
						var $qid = $("input#qid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#productadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.pname').text();
							tableRow.pcode = jRow.find('td.pcode').text();
							tableRow.ppq = jRow.find('td.ppq').text();
							tableRow.qty = jRow.find('td.qty').text();
							tableRow.amt = jRow.find('td.amt').text();
							tableRow.tax = jRow.find('td.tax').text();
							tableRow.taxamt = jRow.find('td.taxamt').text();
							tableRow.netamt = jRow.find('td.netamt').text();
							tableData.push(tableRow);

						});

						jQuery.ajax({
							url : "AddQuotationProducts",
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
						$('#process').modal('show');
					});

					$('#btn11').click(function(event) {
						$('#btnid').val("updateP");
						var $qid = $("input#qid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#productadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.pname').text();
							tableRow.pcode = jRow.find('td.pcode').text();
							tableRow.ppq = jRow.find('td.ppq').text();
							tableRow.qty = jRow.find('td.qty').text();
							tableRow.amt = jRow.find('td.amt').text();
							tableRow.tax = jRow.find('td.tax').text();
							tableRow.taxamt = jRow.find('td.taxamt').text();
							tableRow.netamt = jRow.find('td.netamt').text();
							tableData.push(tableRow);

						});

						jQuery.ajax({
							url : "AddQuotationProducts",
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

					$('#btn12').click(function(event) {
						$('#btnid').val("deleteP");
						$('#myform').submit();
						$('#myModal2').modal('hide');
						$('#process').modal('show');
					});

					$('#btn2').click(function(event) {
						$('#btnid').val("addP");
						var $qid = $("input#ino").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#productadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.pname').text();
							tableRow.pcode = jRow.find('td.pcode').text();
							tableRow.ppq = jRow.find('td.ppq').text();
							tableRow.qty = jRow.find('td.qty').text();
							tableRow.amt = jRow.find('td.amt').text();
							tableRow.tax = jRow.find('td.tax').text();
							tableRow.taxamt = jRow.find('td.taxamt').text();
							tableRow.netamt = jRow.find('td.netamt').text();
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
						$('#process').modal('show');
					});

					$('#btn21').click(function(event) {
						$('#btnid').val("updateP");
						var $qid = $("input#ino").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#productadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.pname').text();
							tableRow.pcode = jRow.find('td.pcode').text();
							tableRow.ppq = jRow.find('td.ppq').text();
							tableRow.qty = jRow.find('td.qty').text();
							tableRow.amt = jRow.find('td.amt').text();
							tableRow.tax = jRow.find('td.tax').text();
							tableRow.taxamt = jRow.find('td.taxamt').text();
							tableRow.netamt = jRow.find('td.netamt').text();
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

					$('#btn22').click(function(event) {
						$('#btnid').val("deleteP");
						$('#myform').submit();
						$('#myModal2').modal('hide');
						$('#process').modal('show');
					});

					

				});