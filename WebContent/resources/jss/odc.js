$(document)
		.ready(
				function() {

					var $sno = 0;
					var $tag = 0;
					var qtyNo = "";
					var $oqty = 0;
					var $oidno = 0;

					$('#odcquan').click(function(event) {
						$("#TextBoxContainer").css("display", "block");												
					});

					$("#odcquan").on('keypress', function(event) {
						if (event.which === 13) {
							
							var $stock = $("#stk").val();
							
							$("#TextBoxContainer").css("display", "block");

							var $a3 = $("input#odcquan").val();
							
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#odcquan").val("");
								

							} else {
								
								if($stock*1 < $a3*1){
									bootbox.alert("Stock is avaliable only... "+$stock);
									$("input#odcquan").val("");
								}else{
								
								
								if($oqty !=$a3){
									$oidno = "";
								}

							
								}

							}
						} else {
							var $a3 = $("input#odcquan").val();
							var $stock = $("#stk").val();
							$("#TextBoxContainer").css("display", "none");
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#odcquan").val("");						

							} else {

								if($stock*1 <$a3*1){
									bootbox.alert("Stock is avaliable only "+$stock);
									$("input#odcquan").val("");
								}else{
								
							
							}
						}
						}
					});
					
					
					
					$("#odcquan").keyup(function(e) {
						
						
							var $a3 = $("input#odcquan").val();
							var $stock = $("#stk").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#odcquan").val("");								
							} else {
								
								if($stock*1 < $a3*1){
									$("input#odcquanodcquan").val("");	
									bootbox.alert("Stock is avaliable only "+$stock);
								}else{
									
									$("#TextBoxContainer").empty();
									
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

					$('#odcplus')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
												"none");
										var $qid = $("input#odcqid").val();
										var $code = $("input#odctt").val();
										var $a1 = $("input#itemname").val();
										var $a2 = $("input#pid").val();
										var $a3 = $("input#odcquan").val();
										
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
														
														if ($('#odcproductadd1 tr > td:nth-child(3):contains(' + $a2 + ')').length != 0) {
															
															var $rows = $(
															"#odcproductadd1")
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
															ids);
															
															
														}else{

														$sno = ($sno * 1) + 1;
														var $val = ($sno * 1) + 100;

														var newRowContent = "<tr class='tableRow'><td style='display: none;' class='odcsno'>"
																+ $val
																+ "</td><td class='odcpname'>"
																+ $a1
																+ "</td><td style='display: none;' class='odcpcode'>"
																+ $a2
																+ "</td><td class='odcqty'>"
																+ $a3
																+ "</td>"
																+ "<td><button type='button' class='btn btn-info tooltips' id='odceditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																+ "<td><button type='button' class='btn btn-danger tooltips' id='odcdelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='odcslnos' >"
																+ ids
																+ "</td><td class='odcid' >"
																+ $qid
																+ "</td><td class='id' >"
																+ $id
																+ "</td></tr>";
														$(
																"#odcproductadd1 tbody")
																.append(
																		newRowContent);
														}
														
													} else {

														var $rows = $(
																"#odcproductadd1")
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
																ids);
													}
												
													$("input#itemname").val("");
													$("input#odcquan").val("");
													$("input#pid").val("");
													$("input#odctt").val("");
													$('input#itemname').focus();
													$("textarea#dcdesc")
															.val("");
													$("input#dcuom").val("");
													$("input#slnos").val("");
													$("input#ids").val("");
													$("input#stk").val("");
													//$('#dcslnos').html("");
													
													$("input#id").val("");

													$("input#odcnp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$('#odcplus11')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
										"none");
								var $qid = $("input#odcqid").val();
								var $code = $("input#odctt").val();
								var $a1 = $("input#itemname").val();
								var $a2 = $("input#pid").val();
								var $a3 = $("input#odcquan").val();
								
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
														
														if ($('#odcproductadd1 tr > td:nth-child(3):contains(' + $a2 + ')').length != 0) {
															
															var $rows = $(
															"#odcproductadd1")
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
															 ids);
															
														}else{

														$sno = ($sno * 1) + 1;
														var $val = ($sno * 1) + 100;

														var newRowContent = "<tr class='tableRow'><td style='display: none;' class='odcsno'>"
																+ $val
																+ "</td><td class='odcpname'>"
																+ $a1
																+ "</td><td style='display: none;' class='odcpcode'>"
																+ $a2
																+ "</td><td class='odcqty'>"
																+ $a3
																+ "</td>"
																+ "<td><button type='button' class='btn btn-info tooltips' id='odceditProduct1' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																+ "<td><button type='button' class='btn btn-danger tooltips' id='odcdelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='odcslnos' style='display: none;'>"
																+  ids
																+ "</td><td class='odcid' style='display: none;'>"
																+ $qid
																+ "</td><td class='id' style='display: none;'>"
																+ $id
																+ "</td></tr>";
														$(
																"#odcproductadd1 tbody")
																.append(
																		newRowContent);
														}
														
													} else {

														var $rows = $(
																"#odcproductadd1")
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
																 ids);

													}

													$("input#itemname").val("");
													$("input#odcquan").val("");
													$("input#pid").val("");
													$("input#odctt").val("");
													$('input#itemname').focus();
													$("textarea#dcdesc")
															.val("");
													$("input#dcuom").val("");
													$("input#slnos").val("");
													$("input#ids").val("");
													$("input#stk").val("");
													//$('#dcslnos').html("");
													$("input#id").val("");

													$("input#dcnp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$(document).on("click", "#odcclear", function() {
						$("#TextBoxContainer").css("display", "none");
						$("input#itemname").val("");
						$("input#odcquan").val("");
						$("input#pid").val("");
						$("input#odctt").val("");
						$('input#itemname').focus();
						$("textarea#dcdesc")
								.val("");
						$("input#dcuom").val("");
						$("input#slnos").val("");
						$("input#ids").val("");
						$("input#stk").val("");
						//$('#dcslnos').html("");
						$("input#id").val("");
						$('input#itemname').focus();
						$tag = 0;

					});

					$(document).on(
							"click",
							"#odceditProduct",
							function() {

								$sno = $("input#odcnp").val();

								$tag = $(this).closest('tr').find('td:first')
										.text()

								$("input#itemname").val(
										$(this).closest('tr').find('td:first')
												.next().text());
								$("input#pid").val(
										$(this).closest('tr').find('td:first')
												.next().next().text());
								$("input#odcquan").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().text());

								$('input#odcslnos').val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().text());
								$('input#id').val(
										$(this).closest('tr').find('td:first')
										.next().next().next().next()
										.next().next().next().next().text());

								
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

								$sno = $("input#odcnp").val();
								$oqty = $("input#odcquan").val();
								$oidno = $("input#id").val();

							});
					
					$(document).on(
							"click",
							"#odceditProduct1",
							function() {

								$sno = $("input#odcnp").val();

								$tag = $(this).closest('tr').find('td:first')
										.text()

								$("input#itemname").val(
										$(this).closest('tr').find('td:first')
												.next().text());
								$("input#pid").val(
										$(this).closest('tr').find('td:first')
												.next().next().text());
								$("input#odcquan").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().text());

								$('input#odcslnos').val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().text());
								$('input#id').val(
										$(this).closest('tr').find('td:first')
										.next().next().next().next()
										.next().next().next().next().text());

								
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
										$('#stk').val((value11[8]));
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

								$sno = $("input#odcnp").val();
								$oqty = $("input#odcquan").val();
								$oidno = $("input#id").val();

							});

					$(document).on("click", "#odcdelproducts", function() {
						$("#TextBoxContainer").css("display", "none");

						$sno = $("input#dcnp").val();

						var $row = $(this).closest("tr");

						var $qid = $row.find('td:first').text();

						$row.remove();

						$sno = ($sno * 1) - 1;

						$("input#odcnp").val($sno);

						$("input#itemname").val("");
						$("input#odcquan").val("");
						$("input#pid").val("");
						$("input#odctt").val("");
						$('input#itemname').focus();
						$("textarea#dcdesc")
								.val("");
						$("input#dcuom").val("");
						$("input#slnos").val("");
						$("input#ids").val("");
						$("input#stk").val("");
						//$('#dcslnos').html("");
						$("input#id").val("");
						$tag = 0;

					});

					$('#btn5').click(function(event) {
						$('#btnid').val("addP");
						var $qid = $("input#odcqid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#odcproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.odcid = jRow.find('td.odcid').text();
							tableRow.odcpname = jRow.find('td.odcpname').text();
							tableRow.odcpcode = jRow.find('td.odcpcode').text();
							tableRow.odcqty = jRow.find('td.odcqty').text();
							tableRow.odcslnos = jRow.find('td.odcslnos').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);
						});

						jQuery.ajax({
							url : "AddODCProducts",
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

					$('#btn51').click(function(event) {
						$('#btnid').val("updateP");
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#odcproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.odcid = jRow.find('td.odcid').text();
							tableRow.odcpname = jRow.find('td.odcpname').text();
							tableRow.odcpcode = jRow.find('td.odcpcode').text();
							tableRow.odcqty = jRow.find('td.odcqty').text();
							tableRow.odcslnos = jRow.find('td.odcslnos').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);
						});

						jQuery.ajax({
							url : "AddODCProducts",
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

					$('#btn52').click(function(event) {
						$('#btnid').val("deleteP");
						$('#myform').submit();
						$('#myModal2').modal('hide');
						$('#process').modal('show');
					});
				});