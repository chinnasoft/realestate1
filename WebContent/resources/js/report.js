$(document)
		.ready(
				function() {
					$('#ipdsearch')
							.click(
									function(event) {

										var $sumOpd = 0;
										var $opdCount = 0;

										var $a1 = $("input#pdate1").val();
										var $a2 = $("input#pdate2").val();

										$
												.get(
														'GetIpdDateWise',
														{
															a1 : $a1,
															a2 : $a2
														},
														function(responseJson) {

															if (responseJson != null) {

																$(
																		"#editable-sample")
																		.find(
																				"tr:gt(0)")
																		.remove();

																var table1 = $("#editable-sample");

																$
																		.each(
																				responseJson,
																				function(
																						key,
																						value) {

																					$opdCount = ($opdCount * 1) + 1;

																					var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");

																					rowNew
																							.children()
																							.eq(
																									0)
																							.text(
																									value['bid']);
																					rowNew
																							.children()
																							.eq(
																									1)
																							.text(
																									value['pid']);
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
																									value['gender']);
																					rowNew
																							.children()
																							.eq(
																									4)
																							.text(
																									value['age']);
																					rowNew
																							.children()
																							.eq(
																									5)
																							.text(
																									value['bloodgp']);
																					rowNew
																							.children()
																							.eq(
																									6)
																							.text(
																									value['martiual']);
																					rowNew
																							.children()
																							.eq(
																									7)
																							.text(
																									value['gname']);
																					rowNew
																							.children()
																							.eq(
																									8)
																							.text(
																									value['m1']);
																					rowNew
																							.children()
																							.eq(
																									9)
																							.text(
																									value['addr']);
																					rowNew
																							.children()
																							.eq(
																									10)
																							.text(
																									value['sta']);
																					rowNew
																							.children()
																							.eq(
																									11)
																							.text(
																									value['dept']);

																					rowNew
																							.children()
																							.eq(
																									12)
																							.text(
																									value['fname']);
																					rowNew
																							.children()
																							.eq(
																									13)
																							.text(
																									value['edate']);
																					rowNew
																							.children()
																							.eq(
																									14)
																							.text(
																									value['etime']);
																					rowNew
																							.children()
																							.eq(
																									15)
																							.text(
																									value['ep']);

																					rowNew
																							.appendTo(table1);

																				});
															
															}

														});

									});

					$('#fl1')
							.keyup(
									function(event) {

										var $sumOpd = 0;
										var $opdCount = 0;

										var $a1 = $("input#pdate1").val();
										var $a2 = $("input#pdate2").val();
										var $a3 = $("input#fl1").val();

										$
												.get(
														'GetIpdFilter',
														{
															a1 : $a1,
															a2 : $a2,
															a3 : $a3
														},
														function(responseJson) {

															if (responseJson != null) {

																$(
																		"#editable-sample")
																		.find(
																				"tr:gt(0)")
																		.remove();

																var table1 = $("#editable-sample");

																$
																		.each(
																				responseJson,
																				function(
																						key,
																						value) {

																					$opdCount = ($opdCount * 1) + 1;

																					var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");

																					rowNew
																					.children()
																					.eq(
																							0)
																					.text(
																							value['bid']);
																			rowNew
																					.children()
																					.eq(
																							1)
																					.text(
																							value['pid']);
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
																							value['gender']);
																			rowNew
																					.children()
																					.eq(
																							4)
																					.text(
																							value['age']);
																			rowNew
																					.children()
																					.eq(
																							5)
																					.text(
																							value['bloodgp']);
																			rowNew
																					.children()
																					.eq(
																							6)
																					.text(
																							value['martiual']);
																			rowNew
																					.children()
																					.eq(
																							7)
																					.text(
																							value['gname']);
																			rowNew
																					.children()
																					.eq(
																							8)
																					.text(
																							value['m1']);
																			rowNew
																					.children()
																					.eq(
																							9)
																					.text(
																							value['addr']);
																			rowNew
																					.children()
																					.eq(
																							10)
																					.text(
																							value['sta']);
																			rowNew
																					.children()
																					.eq(
																							11)
																					.text(
																							value['dept']);

																			rowNew
																					.children()
																					.eq(
																							12)
																					.text(
																							value['fname']);
																			rowNew
																					.children()
																					.eq(
																							13)
																					.text(
																							value['edate']);
																			rowNew
																					.children()
																					.eq(
																							14)
																					.text(
																							value['etime']);
																			rowNew
																					.children()
																					.eq(
																							15)
																					.text(
																							value['ep']);

																			rowNew
																					.appendTo(table1);

																				});
																
															}

														});

									});
					
					$('#fl2')
					.keyup(
							function(event) {

								var $sumOpd = 0;
								var $opdCount = 0;

								var $a1 = $("input#pdate1").val();
								var $a2 = $("input#pdate2").val();
								var $a3 = $("input#fl1").val();
								var $a4 = $("input#fl2").val();

								$
										.get(
												'GetIpdFilter2',
												{
													a1 : $a1,
													a2 : $a2,
													a3 : $a3,
													a4 : $a4
												},
												function(responseJson) {

													if (responseJson != null) {

														$(
																"#editable-sample")
																.find(
																		"tr:gt(0)")
																.remove();

														var table1 = $("#editable-sample");

														$
																.each(
																		responseJson,
																		function(
																				key,
																				value) {

																			$opdCount = ($opdCount * 1) + 1;

																			var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");

																			rowNew
																			.children()
																			.eq(
																					0)
																			.text(
																					value['bid']);
																	rowNew
																			.children()
																			.eq(
																					1)
																			.text(
																					value['pid']);
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
																					value['gender']);
																	rowNew
																			.children()
																			.eq(
																					4)
																			.text(
																					value['age']);
																	rowNew
																			.children()
																			.eq(
																					5)
																			.text(
																					value['bloodgp']);
																	rowNew
																			.children()
																			.eq(
																					6)
																			.text(
																					value['martiual']);
																	rowNew
																			.children()
																			.eq(
																					7)
																			.text(
																					value['gname']);
																	rowNew
																			.children()
																			.eq(
																					8)
																			.text(
																					value['m1']);
																	rowNew
																			.children()
																			.eq(
																					9)
																			.text(
																					value['addr']);
																	rowNew
																			.children()
																			.eq(
																					10)
																			.text(
																					value['sta']);
																	rowNew
																			.children()
																			.eq(
																					11)
																			.text(
																					value['dept']);

																	rowNew
																			.children()
																			.eq(
																					12)
																			.text(
																					value['fname']);
																	rowNew
																			.children()
																			.eq(
																					13)
																			.text(
																					value['edate']);
																	rowNew
																			.children()
																			.eq(
																					14)
																			.text(
																					value['etime']);
																	rowNew
																			.children()
																			.eq(
																					15)
																			.text(
																					value['ep']);

																	rowNew
																			.appendTo(table1);

																		});
														
													}

												});

							});
				});