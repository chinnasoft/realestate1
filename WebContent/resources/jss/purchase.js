$(document)
		.ready(
				function() {

					var $sum = 0;
					var $sno = 0;
					var $tag = 0;
					var $oa = 0;
					var h = 0;
					
					$('select#ao').on('change', function() {
						var $dc = $(this).find(":selected").val();
					    
					    $.get('GetCmpByDCID', {
					    	a1 : $dc
						}, function(responseJson) {
							$.each(responseJson, function(key, value) {								   
								$("#cstcmpname2").val(value);
								 $("#cstcmpid").val(key);
							});
						});
					    
						
					    
					});

					$('.anotherOne')
							.click(
									function(event) {

										$sno = $("input#panp").val();
										$sum = $("input#pasum").val();

										if ($sno == "") {
											$sno = 0;
										}

										var $dc = $("select#ao").val();
										var $d_id = $("input#cstcmpid").val();

										if ($dc == null) {
											bootbox.alert("Enter Correct DC Number");
										} else {
											if ($d_id == "") {
												bootbox.alert("Select Dealer Name");
											} else {

												$
														.get(
																'GetProductDCWise',
																{
																	a1 : $dc,
																	a2 : $d_id
																},
																function(
																		responseJson) {

																	if (responseJson != null) {
																		
																		$(
																				"#ao option[value='"
																						+ $dc + "']")
																				.remove();

																		var line = "";
																		var div = $("<div>");
																		line = line
																				+ GetDynamicTextBox1($dc);
																		div
																				.html(line);
																		$(
																				"#anotherOneDetails")
																				.append(
																						div);

																		// $("#editable-sample").find("tr:gt(0)").remove();

																		var table1 = $("#paproductadd1");

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

																							var rowNew = $("<tr class='tableRow'><td style='display: none;' class='pasno' >"
																									+ h
																									+ "</td>"
																									+ "<td class='papname'></td>"
																									+ "<td style='display: none;' class='papcode'></td>"
																									+ "<td class='pappq'></td>"
																									+ "<td class='paqty'></td>"
																									+ "<td class='paamt'></td>"
																									+ "<td class='patax'></td>"
																									+ "<td class='pataxamt'></td>"
																									+ "<td class='panetamt'></td>"
																									+ "<td><button type='button' class='btn btn-info' id='paeditProduct'><i class='fa fa-edit'></i></button></td>"
																									+ "<td></td>"
																									+ "<td class='paslnos' style='display: none;'></td><td class='padcid' style='display: none;'></td>"
																									+ "<td class='id' style='display: none;'></td></tr>");

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
																				"input#pasum")
																				.val(
																						$sum
																								.toFixed(2));
																		$(
																				"input#patot")
																				.val(
																						$sum
																								.toFixed(2));
																		$(
																				"input#panp")
																				.val(
																						$sno);

																	} else {
																			bootbox.alert("Enter Correct Dealer Name..")
																	}

																});
											}

										}

									});

					$('#paquan').click(function(event) {
						$("#TextBoxContainer").css("display", "block");
					});

					$("#paquan").on('keypress', function(event) {
						if (event.which === 13) {
							$("#TextBoxContainer").css("display", "block");
							var $a3 = $("input#paquan").val();
							var $a4 = $("input#paamount").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#paquan").val("");
								$("input#patax").val("");
								$("input#pat1").val("");
								$("input#pat2").val("");
								$("input#pat3").val("");
								$('#TextBoxContainer div').empty();

							} else {
								var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
								$("input#pat1").val($r1);
								$("input#pat3").val($r1);

								$('#TextBoxContainer div').empty();

								var qty = $("input#paquan").val();

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
						}
					});

					$("#paquan").keydown(function(e) {
						if (e.which == 9) {
							$("#TextBoxContainer").css("display", "none");
							var $a3 = $("input#paquan").val();
							var $a4 = $("input#paamount").val();
							if (!($.isNumeric($a3))) {
								// bootbox.alert("Enter valid values");
								$("input#paquan").val("");
								$("input#patax").val("");
								$("input#pat1").val("");
								$("input#pat2").val("");
								$("input#pat3").val("");
								$('#TextBoxContainer div').empty();

							} else {
								var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
								$("input#pat1").val($r1);
								$("input#pat3").val($r1);

								$('#TextBoxContainer div').empty();

								var qty = $("input#paquan").val();

								var i;

								var line = "";
								var div = $("<div>");
								for (i = 0; i < qty; i++) {
									line = line + GetDynamicTextBox(i + 1);
								}

								div.html(line);
								$("#TextBoxContainer").append(div);
								// $('#SLNO1').focus();
							}
						}
					});

					$("#paquan").keyup(function(e) {
						var $a3 = $("input#paquan").val();
						var $a4 = $("input#paamount").val();
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#paquan").val("");
							$("input#patax").val("");
							$("input#pat1").val("");
							$("input#pat2").val("");
							$("input#pat3").val("");

						} else {
							var $r1 = (($a4 * 1) * ($a3 * 1)).toFixed(2);
							$("input#pat1").val($r1);
							$("input#pat3").val($r1);
						}

					});

					$("#paamount").keyup(function(e) {
						var $a3 = $("input#paamount").val();
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#paamount").val("");
						}

					});

					$("#patax").keyup(function(e) {
						$("#TextBoxContainer").css("display", "none");
						var $a3 = $("input#patax").val();
						var $a4 = $("input#pat1").val();
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#patax").val("");
							$("input#pat2").val("");
							var $a1 = $("input#paquan").val();
							var $a2 = $("input#paamount").val();
							var $r1 = (($a1 * 1) * ($a2 * 1)).toFixed(2);
							$("input#pat1").val($r1);
							$("input#pat3").val($r1);

						} else {

							var $r3 = (($a4 * $a3) / 100).toFixed(2);
							var $r4 = (($a4 * 1) + ($r3 * 1)).toFixed(2);
							$("input#pat2").val($r3);
							$("input#pat3").val($r4);
						}

					});

					$("#padis").keyup(function(e) {
						var $a3 = $("input#padis").val();
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#padis").val("");
						}

					});

					$("#padis1").keyup(function(e) {
						var $a3 = $("input#padis1").val();
						if (!($.isNumeric($a3))) {
							// bootbox.alert("Enter valid values");
							$("input#padis1").val("");
						}

					});

					$('#padis').keyup(function(event) {

						var $b1 = $("input#pasum").val();
						var $b2 = $("input#padis").val();
						var $r2 = 0;
						var $r1 = 0;

						$("input#padis1").val("");

						if ($b1 == "") {
							bootbox.alert("Add Product first.....");
							$("input#padis").val("");
						} else {

							if ($.isNumeric($b2)) {
								$r2 = (($b1 * $b2) / 100).toFixed(2);

								$("input#padis1").val($r2);

							} else {

							}

						}
						$r1 = (($b1 * 1) - ($r2 * 1)).toFixed(2);

						$("input#patot").val($r1);

					});

					$('#padis1').keyup(function(event) {

						var $b1 = $("input#pasum").val();
						var $b2 = $("input#padis1").val();
						var $r2 = 0;
						var $r1 = 0;

						$("input#padis").val("");

						if ($b1 == "") {
							bootbox.alert("Add Product first.....");
							$("input#padis1").val("");

						} else {

							if ($.isNumeric($b2)) {

								$r1 = (($b1 * 1) - ($b2 * 1)).toFixed(2);

								$r2 = (($b2 / $b1) * 100).toFixed(2);

								$("input#padis").val($r2);

							} else {
								$r1 = $b1;
							}

						}

						$("input#patot").val($r1);

					});

					$('#paplus')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
												"none");
										var $qid = $("input#paid").val();
										var $code = $("input#patt").val();
										var $a1 = $("input#itemname").val();
										var $a2 = $("input#pid").val();
										var $a3 = $("input#paquan").val();
										var $a4 = $("input#paamount").val();
										var $a6 = $("input#patax").val();

										var $id = $("input#id").val();

										var slnos = "";

										for (i = 1; i <= $a3; i++) {
											slnos = slnos
													+ $("input#SLNO" + i).val()
													+ ",";
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

															var newRowContent = "<tr class='tableRow'><td style='display: none;' class='pasno'>"
																	+ $val
																	+ "</td><td class='papname'>"
																	+ $a1
																	+ "</td><td style='display: none;' class='papcode'>"
																	+ $a2
																	+ "</td><td class='pappq'>"
																	+ $a4
																	+ "</td><td class='paqty'>"
																	+ $a3
																	+ "</td><td class='paamt'>"
																	+ $r1
																	// +
																	// "</td><td>"
																	// +
																	// $a5
																	// +
																	// "</td><td>"
																	// +
																	// $r2
																	+ "</td><td class='patax'>"
																	+ $a6
																	+ "</td><td class='pataxamt'>"
																	+ $r3
																	+ "</td><td class='panetamt'>"
																	+ $r4
																	+ "</td>"
																	+ "<td><button type='button' class='btn btn-info tooltips' id='paeditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																	+ "<td><button type='button' class='btn btn-danger tooltips' id='padelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='paslnos' style='display: none;'>"
																	+ slnos
																	+ "</td><td class='padcid' style='display: none;'>"
																	+ "</td><td class='id' style='display: none;'>"
																	+ $id
																	+ "</td></tr>";
															$(
																	"#paproductadd1 tbody")
																	.append(
																			newRowContent);
														
													} else {

														var $rows = $(
																"#paproductadd1")
																.find(
																		"td:contains('"
																				+ $tag
																				+ "')")
																.closest('tr');

														var $columns = $($rows)
																.find("td");

														$sum = ($sum * 1)
																- ($oa * 1);

														$("input#pasum")
																.val(
																		$sum
																				.toFixed(2));
														$("input#patot")
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
																slnos);

													}

													$("input#pasum").val(
															$sum.toFixed(2));
													$("input#patot").val(
															$sum.toFixed(2));

													$("input#itemname").val("");
													$("input#paquan").val("");
													$("input#pid").val("");
													$("input#paamount").val("");
													$("input#padis").val("");
													$("input#padis1").val("");
													$("input#patax").val("");
													$("input#patt").val("");
													$("input#pat1").val("");
													$("input#pat2").val("");
													$("input#pat3").val("");
													$('input#itemname').focus();
													$("textarea#padesc")
															.val("");
													$("input#pauom").val("");
													$('#paslnos').html("");
													$("input#padcid").val("");
													$("input#id").val("");

													$("#paquan").prop(
															"disabled", false);

													$("input#panp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$('#paplus11')
							.click(
									function(event) {
										$("#TextBoxContainer").css("display",
												"none");
										$sno = $("input#panp").val();
										$sum = $("input#pasum").val();

										var $qid = $("input#paid").val();
										var $code = $("input#patt").val();
										var $a1 = $("input#itemname").val();
										var $a2 = $("input#pid").val();
										var $a3 = $("input#paquan").val();
										var $a4 = $("input#paamount").val();
										var $a6 = $("input#patax").val();

										var $id = $("input#id").val();

										var slnos = "";

										for (i = 1; i <= $a3; i++) {
											slnos = slnos
													+ $("input#SLNO" + i).val()
													+ ",";
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

															var newRowContent = "<tr class='tableRow'><td style='display: none;' class='pasno'>"
																	+ $val
																	+ "</td><td class='papname'>"
																	+ $a1
																	+ "</td><td style='display: none;' class='papcode'>"
																	+ $a2
																	+ "</td><td class='pappq'>"
																	+ $a4
																	+ "</td><td class='paqty'>"
																	+ $a3
																	+ "</td><td class='paamt'>"
																	+ $r1
																	// +
																	// "</td><td>"
																	// +
																	// $a5
																	// +
																	// "</td><td>"
																	// +
																	// $r2
																	+ "</td><td class='patax'>"
																	+ $a6
																	+ "</td><td class='pataxamt'>"
																	+ $r3
																	+ "</td><td class='panetamt'>"
																	+ $r4
																	+ "</td>"
																	+ "<td><button type='button' class='btn btn-info tooltips' id='paeditProduct' data-toggle='tooltip' data-placement='top' title='' data-original-title='Edit'><i class='fa fa-edit'></i></button></td>"
																	+ "<td><button type='button' class='btn btn-danger tooltips' id='padelproducts' data-toggle='tooltip' data-placement='top' title='' data-original-title='Delete'><i class='fa fa-trash-o'></i></button></td><td class='paslnos' style='display: none;'>"
																	+ slnos
																	+ "</td><td class='padcid' style='display: none;'>"
																	+ "</td><td class='id' style='display: none;'>"
																	+ $id
																	+ "</td></tr>";
															$(
																	"#paproductadd1 tbody")
																	.append(
																			newRowContent);
														
													} else {

														var $rows = $(
																"#paproductadd1")
																.find(
																		"td:contains('"
																				+ $tag
																				+ "')")
																.closest('tr');

														var $columns = $($rows)
																.find("td");

														$sum = ($sum * 1)
																- ($oa * 1);

														$("input#pasum")
																.val(
																		$sum
																				.toFixed(2));
														$("input#patot")
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
																slnos);

													}

													$("input#pasum").val(
															$sum.toFixed(2));
													$("input#patot").val(
															$sum.toFixed(2));

													$("input#itemname").val("");
													$("input#paquan").val("");
													$("input#pid").val("");
													$("input#paamount").val("");
													$("input#padis").val("");
													$("input#padis1").val("");
													$("input#patax").val("");
													$("input#patt").val("");
													$("input#pat1").val("");
													$("input#pat2").val("");
													$("input#pat3").val("");
													$('input#itemname').focus();
													$("textarea#padesc")
															.val("");
													$("input#pauom").val("");
													$('#paslnos').html("");
													$("input#padcid").val("");
													$("input#id").val("");

													$("#paquan").prop(
															"disabled", false);

													$("input#panp").val($sno);
													$tag = 0;

												}
											}
										}

									});

					$(document).on("click", "#paclear", function() {
						$("#TextBoxContainer").css("display", "none");
						$("input#patt").val("");
						$("input#itemname").val("");
						$("input#pid").val("");
						$("input#paquan").val("");
						$("input#paamount").val("");
						$("input#patax").val("");
						$("input#patt").val("");
						$("input#pat1").val("");
						$("input#pat2").val("");
						$("input#pat3").val("");
						$("textarea#padesc").val("");
						$("input#pauom").val("");
						$('#paslnos').html("");
						$("input#padcid").val("");
						$("input#id").val("");
						$('input#itemname').focus();
						$tag = 0;

					});

					$(document).on(
							"click",
							"#paeditProduct",
							function() {

								$sno = $("input#panp").val();
								$sum = $("input#pasum").val();

								$tag = $(this).closest('tr').find('td:first')
										.text()

								$("input#itemname").val(
										$(this).closest('tr').find('td:first')
												.next().text());
								$("input#pid").val(
										$(this).closest('tr').find('td:first')
												.next().next().text());
								$("input#paquan").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.text());
								$("input#pat1").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().text());
								$("input#paamount").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().text());

								$("input#patax").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().text());
								$("input#pat2").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().next().text());
								$("input#pat3").val(
										$(this).closest('tr').find('td:first')
												.next().next().next().next()
												.next().next().next().next()
												.text());
								$('#paslnos').html(
										$(this).closest('tr').find('td:first')

										.next().next().next().next().next()
												.next().next().next().next()
												.next().next().text());
								$('input#padcid').val(
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

								var $dcid = $(this).closest('tr').find(
										'td:first').next().next().next().next()
										.next().next().next().next().next()
										.next().next().next().text();

								if ($dcid == "") {
									$("#paquan").prop("disabled", false);
								} else {
									$("#paquan").prop("disabled", true);
								}

								$('#TextBoxContainer div').empty();

								var qty = $(this).closest('tr')
										.find('td:first').next().next().next()
										.next().text();

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
										.next().next().next().next().next()
										.next().text();

								var res = sl.split(",");

								for (i = 1; i <= res.length; i++) {
									$("input#SLNO" + i).val(res[i - 1]);

								}

								// $('#SLNO1').focus();

								$("#TextBoxContainer").css("display", "none");

								$('input#itemname').focus();

								$oa = $("input#pat3").val();
								$sno = $("input#panp").val();
								$sum = $("input#pasum").val();

							});

					$(document).on(
							"click",
							"#padelproducts",
							function() {
								$("#TextBoxContainer").css("display", "none");
								$sum = $("input#pasum").val();
								$sno = $("input#panp").val();

								var $row = $(this).closest("tr");
								var $v5 = $row.find('td:first').next().next()
										.next().next().next().next().next()
										.next().text();
								$sum = ($sum * 1) - ($v5 * 1);

								if ($sum == "-0.00") {
									$("input#pasum").val("");
									$("input#patot").val("");
								} else {
									$("input#pasum").val($sum.toFixed(2));
									$("input#patot").val($sum.toFixed(2));
								}

								var $qid = $row.find('td:first').text();

								$row.remove();

								$sno = ($sno * 1) - 1;

								$("input#sanp").val($sno);

								$("input#itemname").val("");
								$("input#paquan").val("");
								$("input#pid").val("");
								$("input#paamount").val("");
								$("input#padis").val("");
								$("input#padis1").val("");
								$("input#patax").val("");
								$("input#patt").val("");
								$("input#pat1").val("");
								$("input#pat2").val("");
								$("input#pat3").val("");
								$('input#itemname').focus();
								$("textarea#padesc").val("");
								$("input#pauom").val("");
								$('#paslnos').html("");
								$("input#padcid").val("");
								$("input#id").val("");
								$tag = 0;

							});

					$('#btn3').click(function(event) {
						$('#btnid').val("addP");
						var $qid = $("input#paid").val();

						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#paproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.papname').text();
							tableRow.pcode = jRow.find('td.papcode').text();
							tableRow.ppq = jRow.find('td.pappq').text();
							tableRow.qty = jRow.find('td.paqty').text();
							tableRow.amt = jRow.find('td.paamt').text();
							tableRow.tax = jRow.find('td.patax').text();
							tableRow.taxamt = jRow.find('td.pataxamt').text();
							tableRow.netamt = jRow.find('td.panetamt').text();
							tableRow.slnos = jRow.find('td.paslnos').text();
							tableRow.dcid = jRow.find('td.padcid').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);

						});

						jQuery.ajax({
							url : "AddPurchaseProducts",
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

					$('#btn31').click(function(event) {
						$('#btnid').val("updateP");
						var $qid = $("input#paid").val();
						var tableData = new Array(); // we will store rows'
						// data into this array
						$("#paproductadd1") // select table by id
						.find(".tableRow").each(function() { // for each
							// selected row
							// extract data
							var tableRow = {};
							var jRow = $(this);
							tableRow.qid = $qid;
							tableRow.pname = jRow.find('td.papname').text();
							tableRow.pcode = jRow.find('td.papcode').text();
							tableRow.ppq = jRow.find('td.pappq').text();
							tableRow.qty = jRow.find('td.paqty').text();
							tableRow.amt = jRow.find('td.paamt').text();
							tableRow.tax = jRow.find('td.patax').text();
							tableRow.taxamt = jRow.find('td.pataxamt').text();
							tableRow.netamt = jRow.find('td.panetamt').text();
							tableRow.slnos = jRow.find('td.paslnos').text();
							tableRow.dcid = jRow.find('td.padcid').text();
							tableRow.id = jRow.find('td.id').text();
							tableData.push(tableRow);

						});

						jQuery.ajax({
							url : "AddPurchaseProducts",
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

					$('#btn32').click(function(event) {
						$('#btnid').val("deleteP");
						$('#myform').submit();
						$('#myModal2').modal('hide');
						$('#process').modal('show');
					});

				});