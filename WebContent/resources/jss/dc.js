$(document)
		.ready(
				function() {

					var $sno = 0;
					var $tag = 0;
					var qtyNo = "";
					var $oqty = 0;
					var $oidno = 0;

					$('#dcquan').click(function(event) {
						$("#TextBoxContainer").css("display", "block");
						qtyNo =' "#SLNO'+$("input#dcquan").val()+'" ';
						//alert(qtyNo);
					});

					$("#dcquan").on('keypress', function(event) {
						if (event.which === 13) {
							
							$("#TextBoxContainer").css("display", "block");

							var $a3 = $("input#dcquan").val();

							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#dcquan").val("");
								$('#TextBoxContainer div').empty();

							} else {
								
								if($oqty !=$a3){
									$oidno = "";
								}

								$('#TextBoxContainer div').empty();
								
								qtyNo =' "#SLNO'+$("input#dcquan").val()+'" ';
								
								//alert(qtyNo);

								var qty = $("input#dcquan").val();

								var i;
								var line = "";
								var div = $("<div>");
								for (i = 0; i < qty; i++) {
									line = line + GetDynamicTextBox(i + 1);

								}

								div.html(line);
								$("#TextBoxContainer").append(div);

								$('#SLNO1').focus();

							}
						} else {
							var $a3 = $("input#dcquan").val();
							$("#TextBoxContainer").css("display", "none");
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#dcquan").val("");
								$('#TextBoxContainer div').empty();

							} else {
								
								$('#TextBoxContainer div').empty();

								var qty = $("input#dcquan").val();

								var i;
								var line = "";
								var div = $("<div>");
								for (i = 0; i < qty; i++) {
									line = line + GetDynamicTextBox(i + 1);
								}

								div.html(line);
								$("#TextBoxContainer").append(div);

							}
						}
					});
					
					$("#dcquan").keydown(function(e) {
						if (e.which == 9) {		
							
						var $a3 = $("input#dcquan").val();
						$("#TextBoxContainer").css("display", "none");
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#dcquan").val("");
							$('#TextBoxContainer div').empty();

						} else {
							
							$('#TextBoxContainer div').empty();
							var qty = $("input#dcquan").val();

							var i;
							var line = "";
							var div = $("<div>");
							for (i = 0; i < qty; i++) {
								line = line + GetDynamicTextBox(i + 1);
							}

							div.html(line);
							$("#TextBoxContainer").append(div);

						}
						}
				});
					
					
					$("#dcquan").keyup(function(e) {					
							var $a3 = $("input#dcquan").val();							
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#dcquan").val("");								
							} else {
																
							}
						
					});

					$('#dcplus')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
												"none");
										var $qid = $("input#dcqid").val();
										var $code = $("input#dctt").val();
										var $a1 = $("input#itemname").val();
										var $a2 = $("input#pid").val();
										var $a3 = $("input#dcquan").val();
										
										var $id = $("input#id").val();

										var slnos = "";
										
										
										

										for (i = 1; i <= $a3; i++) {
											slnos = slnos
													+ $("input#SLNO" + i).val()
													+ ",";
										}

										if ($qid == "") {
											bootbox.alert("Enter Id..");
										} else {

											if (!($.isNumeric($a3))) {
												bootbox.alert("Valid values are required..");

												if ($a2 == "") {
													// bootbox.alert("Valid values are
													// required.");
												}

											} else {

												if ($a2 == "") {
													bootbox.alert("Valid values are required.");
												} else {
													if ($tag == 0) {
														
														if ($('#dcproductadd1 tr > td:nth-child(3):contains(' + $a2 + ')').length != 0) {
															
															var $rows = $(
															"#dcproductadd1")
															.find(
																	"td:contains('"
																			+ $a2
																			+ "')")
															.closest('tr');

													var $columns = $($rows)
															.find("td");

													$($columns[1])
															.text($a1);
													$($columns[2])
															.text($a2);
													$($columns[3])
															.text($a3);
													$($columns[6]).text(
															slnos);
															
															
														}else{

														$sno = ($sno * 1) + 1;
														var $val = ($sno * 1) + 100;

														var newRowContent = "<tr class='tableRow'><td style='display: none;' class='dcsno'>"
																+ $val
																+ "</td><td class='dcpname'>"
																+ $a1
																+ "</td><td style='display: none;' class='dcpcode'>"
																+ $a2
																+ "</td><td class='dcqty'>"
																+ $a3
																+ "</td>"
																+ "<td><button type='button' class='btn btn-info tooltips' id='dceditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																+ "<td><button type='button' class='btn btn-danger tooltips' id='dcdelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='dcslnos' style='display: none;'>"
																+ slnos
																+ "</td><td class='dcid' style='display: none;'>"
																+ $qid
																+ "</td><td class='id' style='display: none;'>"
																+ $id
																+ "</td></tr>";
														$(
																"#dcproductadd1 tbody")
																.append(
																		newRowContent);
														}
														
													} else {

														var $rows = $(
																"#dcproductadd1")
																.find(
																		"td:contains('"
																				+ $tag
																				+ "')")
																.closest('tr');

														var $columns = $($rows)
																.find("td");

														$($columns[1])
																.text($a1);
														$($columns[2])
																.text($a2);
														$($columns[3])
																.text($a3);
														$($columns[6]).text(
																slnos);
													}

													$("input#itemname").val("");
													$("input#dcquan").val("");
													$("input#pid").val("");
													$("input#dctt").val("");
													$('input#itemname').focus();
													$("textarea#dcdesc")
															.val("");
													$("input#dcuom").val("");
													$('#dcslnos').html("");
													
													$("input#id").val("");

													$("input#dcnp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$('#dcplus11')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
												"none");
										$sno = $("input#dcnp").val();

										var $qid = $("input#dcqid").val();
										var $code = $("input#dctt").val();
										var $a1 = $("input#itemname").val();
										var $a2 = $("input#pid").val();
										var $a3 = $("input#dcquan").val();
										
										var $id = $("input#id").val();
										
										var slnos = "";

										for (i = 1; i <= $a3; i++) {
											slnos = slnos
													+ $("input#SLNO" + i).val()
													+ ",";
										}

										if ($qid == "") {
											bootbox.alert("Enter Id..");
										} else {

											if (!($.isNumeric($a3))) {
												// bootbox.alert("Valid values are
												// required1.");

												if ($a2 == "") {
													bootbox.alert("Valid values are required."
															+ $a2);
												}

											} else {

												if ($a2 == "") {
													bootbox.alert("Valid values are required.");
												} else {

													if ($tag == 0) {
														
														if ($('#dcproductadd1 tr > td:nth-child(3):contains(' + $a2 + ')').length != 0) {
															
															var $rows = $(
															"#dcproductadd1")
															.find(
																	"td:contains('"
																			+ $a2
																			+ "')")
															.closest('tr');

													var $columns = $($rows)
															.find("td");

													$($columns[1])
															.text($a1);
													$($columns[2])
															.text($a2);
													$($columns[3])
															.text($a3);
													$($columns[6]).text(
															slnos);
															
														}else{

														$sno = ($sno * 1) + 1;
														var $val = ($sno * 1) + 100;

														var newRowContent = "<tr class='tableRow'><td style='display: none;' class='dcsno'>"
																+ $val
																+ "</td><td class='dcpname'>"
																+ $a1
																+ "</td><td style='display: none;' class='dcpcode'>"
																+ $a2
																+ "</td><td class='dcqty'>"
																+ $a3
																+ "</td>"
																+ "<td><button type='button' class='btn btn-info tooltips' id='dceditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																+ "<td><button type='button' class='btn btn-danger tooltips' id='dcdelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='dcslnos' style='display: none;'>"
																+ slnos
																+ "</td><td class='dcid' style='display: none;'>"
																+ $qid
																+ "</td><td class='id' style='display: none;'>"
																+ $id
																+ "</td></tr>";
														$(
																"#dcproductadd1 tbody")
																.append(
																		newRowContent);
														}
														
													} else {

														var $rows = $(
																"#dcproductadd1")
																.find(
																		"td:contains('"
																				+ $tag
																				+ "')")
																.closest('tr');

														var $columns = $($rows)
																.find("td");

														$($columns[1])
																.text($a1);
														$($columns[2])
																.text($a2);
														$($columns[3])
																.text($a3);
														$($columns[6]).text(
																slnos);

													}

													$("input#itemname").val("");
													$("input#dcquan").val("");
													$("input#pid").val("");
													$("input#dctt").val("");
													$('input#itemname').focus();
													$("textarea#dcdesc")
															.val("");
													$("input#dcuom").val("");
													$('#dcslnos').html("");
													$("input#id").val("");

													$("input#dcnp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$(document).on("click", "#dcclear", function() {
						$("#TextBoxContainer").css("display", "none");
						$("input#dctt").val("");
						$("input#itemname").val("");
						$("input#pid").val("");
						$("input#dcquan").val("");
						$("input#dctt").val("");
						$("textarea#dcdesc").val("");
						$("input#dcuom").val("");
						$('#dcslnos').html("");
						$("input#id").val("");
						$('input#itemname').focus();
						$tag = 0;

					});

					$(document).on(
							"click",
							"#dceditProduct",
							function() {

								$sno = $("input#dcnp").val();

								$tag = $(this).closest('tr').find('td:first')
										.text()

								$("input#itemname").val(
										$(this).closest('tr').find('td:first')
												.next().text());
								$("input#pid").val(
										$(this).closest('tr').find('td:first')
												.next().next().text());
								$("input#dcquan").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().text());

								$('#dcslnos').html(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().text());
								$('input#id').val(
										$(this).closest('tr').find('td:first')
										.next().next().next().next()
										.next().next().next().next().text());

								$('#TextBoxContainer div').empty();

								var qty = $(this).closest('tr')
										.find('td:first').next().next().next()
										.text();

								var i;
								var line = "";
								var div = $("<div>");
								for (i = 0; i < qty; i++) {
									line = line + GetDynamicTextBox(i + 1);
								}

								div.html(line);
								$("#TextBoxContainer").append(div);

								var sl = $(this).closest('tr').find('td:first')
										.next().next().next().next().next()
										.next().text();

								var res = sl.split(",");

								for (i = 1; i <= res.length; i++) {
									$("input#SLNO" + i).val(res[i - 1]);

								}

								// $('#SLNO1').focus();

								$("#TextBoxContainer").css("display", "none");

								$('input#itemname').focus();

								$sno = $("input#dcnp").val();
								$oqty = $("input#dcquan").val();
								$oidno = $("input#id").val();

							});

					$(document).on("click", "#dcdelproducts", function() {
						$("#TextBoxContainer").css("display", "none");

						$sno = $("input#dcnp").val();

						var $row = $(this).closest("tr");

						var $qid = $row.find('td:first').text();

						$row.remove();

						$sno = ($sno * 1) - 1;

						$("input#dcnp").val($sno);

						$("input#itemname").val("");
						$("input#dcquan").val("");
						$("input#pid").val("");
						$("input#dctt").val("");
						$('input#itemname').focus();
						$("textarea#dcdesc").val("");
						$("input#dcuom").val("");
						$('#dcslnos').html("");
						$("input#id").val("");
						$tag = 0;

					});

					$('#btn4').click(function(event) {
						$('#btnid').val("addP");
						var $qid = $("input#dcqid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#dcproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.dcid = jRow.find('td.dcid').text();
							tableRow.dcpname = jRow.find('td.dcpname').text();
							tableRow.dcpcode = jRow.find('td.dcpcode').text();
							tableRow.dcqty = jRow.find('td.dcqty').text();
							tableRow.dcslnos = jRow.find('td.dcslnos').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);
						});

						jQuery.ajax({
							url : "AddDCProducts",
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

					$('#btn41').click(function(event) {
						$('#btnid').val("updateP");
						var $qid = $("input#dcqid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#dcproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.dcid = jRow.find('td.dcid').text();
							tableRow.dcpname = jRow.find('td.dcpname').text();
							tableRow.dcpcode = jRow.find('td.dcpcode').text();
							tableRow.dcqty = jRow.find('td.dcqty').text();
							tableRow.dcslnos = jRow.find('td.dcslnos').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);
						});

						jQuery.ajax({
							url : "AddDCProducts",
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

					$('#btn42').click(function(event) {
						$('#btnid').val("deleteP");
						$('#myform').submit();
						$('#myModal2').modal('hide');
						$('#process').modal('show');
					});
				});