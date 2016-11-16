$(document)
		.ready(
				function() {
					
					$('.deleteCompany')
					.click(
							function(event) {
								var $row = $(this).closest("tr");
								var $id = $row.find('td:first').text()
								//alert($id);
								$
										.get(
												'DeleteCompanyDetails',
												{
													cid : $id
												},
												function(responseJson) {
													$
															.each(
																	responseJson,
																	function(
																			key98,
																			value98) {
																		if (value98 == "SUCCESS") {
																			$row
																					.remove();
//																			location.reload();
																		} else {
																			bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																		}

																	});
												});

							});
					
					$('.deleteDept')
					.click(
							function(event) {
								var $row = $(this).closest("tr");
								var $id = $row.find('td:first').text()
								//alert($id);
								$
										.get(
												'DeleteDeptDetails',
												{
													did : $id
												},
												function(responseJson) {
													$
															.each(
																	responseJson,
																	function(
																			key98,
																			value98) {
																		if (value98 == "SUCCESS") {
																			$row
																					.remove();
//																			location.reload();
																		} else {
																			bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																		}

																	});
												});

							});

					$('.deleteQuotation')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $id = $row.find('td:first').next()
												.text()
										//alert($id);
										$
												.get(
														'DeleteQuotationDetails',
														{
															qid : $id
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();
//																					location.reload();
																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});
					$('.deleteCustomer')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeleteCutsomerDetails',
														{
															cid : $id
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();
//																					location.reload();
																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});
					$('.deleteCustomerT')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $tag = "T";
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeleteDBDetails',
														{
															cid : $id,
															tag : $tag
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();

																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});

					$('.deleteCustomerP')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $tag = "P";
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeleteDBDetails',
														{
															cid : $id,
															tag : $tag
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();

																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});

					$('.deleteSales')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeleteSalesDetails',
														{
															sid : $id
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();
//																					location.reload();
																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});

					$('.deletePurchase')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeletePurchaseDetails',
														{
															pid : $id
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();
//																					location.reload();
																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});

					$('.deleteDC')
							.click(
									function(event) {
										var $row = $(this).closest("tr");
										var $id = $row.find('td:first').next()
												.text();
										//alert($id);
										$
												.get(
														'DeleteDCDetails',
														{
															pid : $id
														},
														function(responseJson) {
															$
																	.each(
																			responseJson,
																			function(
																					key98,
																					value98) {
																				if (value98 == "SUCCESS") {
																					$row
																							.remove();
																				//	location.reload();
																				} else {
																					bootbox.alert("Can't Perform Detele action Now, Please Try again later..");
																				}

																			});
														});

									});

				});
