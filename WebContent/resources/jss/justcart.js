$(document)
				.ready(
						function() {
							
							
							
							 $('#cs').change(
										function(event) {
											var $cs = $("select#cs").val();
											if ($cs == "Not Reachable"
													|| $cs == "Switched Off"
													|| $cs == "No Response") {
												$("#123").show();
												$("#4").hide();
												$("#5").hide();
												$("#6").hide();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Not Interested") {
												$("#123").hide();
												$("#4").show();
												$("#5").hide();
												$("#6").hide();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Call Later") {
												$("#123").hide();
												$("#4").hide();
												$("#5").show();
												$("#6").hide();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Followup" || $cs == "Next Followup") {
												$("#123").hide();
												$("#4").hide();
												$("#5").hide();
												$("#6").show();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Quotation request" || $cs == "Product Details Sent" || $cs == "Quotation Sent") {
												$("#123").hide();
												$("#4").hide();
												$("#5").hide();
												$("#6").show();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Demo Fixed") {
												$("#123").hide();
												$("#4").hide();
												$("#5").hide();
												$("#6").hide();
												$("#7").show();
												$("#8").hide();
												$("#9").hide();
											} else if ($cs == "Demo Attended") {
												$("#123").hide();
												$("#4").hide();
												$("#5").hide();
												$("#6").hide();
												$("#7").hide();
												$("#8").hide();
												$("#9").show();
											} else {
												$("#123").hide();
												$("#4").hide();
												$("#5").hide();
												$("#6").hide();
												$("#7").hide();
												$("#8").hide();
												$("#9").hide();
											}

										});

							
							$("#updatemycallsload").load(function() {
								bootbox.alert("Image loaded.");
							});

							$("#updation11")
									.button()
									.click(
											function() {
												var e = document
														.getElementById("updationdetails");
												e.style.display = (e.style.display == 'block') ? 'none'
														: 'block';
											});
							
							
							
							
							$('#editable-sample tbody')
									.on(
											'click',
											'tr',
											function() {
												
												var $puid = $(this).find(
												'td:first').next()
												.text();
												
												if (!($.isNumeric($a3))) {
													
												}else{

												var dt = new Date();

												var dt1 = dt.toISOString()
														.substring(8, 10)
														+ "-"
														+ dt
																.toISOString()
																.substring(5, 7)
														+ "-"
														+ dt
																.toISOString()
																.substring(0, 4)
														+ " "
														+ dt
																.toTimeString()
																.substring(0, 8);

												

												var $llname = $("input#llname")
														.val();

												var $type = $("input#type")
														.val();

												if ($type == "conversation") {

													var $ep = $(this).find(
															'td:first').next()
															.next().next()
															.next().next()
															.text();

													if ($ep == $llname) {

													} else {

														$(this)
																.css(
																		{
																			'font-weight' : 'normal'
																		});

														$
																.get(
																		'SetConversationStatus',
																		{
																			puid : $puid,
																			ep : $ep
																		},
																		function(
																				responseJson) {

																			$
																					.each(
																							responseJson,
																							function(
																									key2,
																									value2) {

																								$(
																										this)
																										.find(
																												'td:first')
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.text(
																												dt1);

																							});

																		});

													}

												} else {

													var $ep = $(this).find(
															'td:first')
															.next().next()
															.next().next()
															.next().next()
															.next().text();
													
													if ($ep == $llname) {

													} else {
														
														
														$(this)
														.css(
																{
																	'font-weight' : 'normal'
																});

														$
																.get(
																		'SetViewStatus',
																		{
																			puid : $puid
																		},
																		function(
																				responseJson) {

																			$
																					.each(
																							responseJson,
																							function(
																									key1,
																									value1) {

																								$(
																										this)
																										.find(
																												'td:first')
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.next()
																										.text(
																												dt1);

																							});

																		});

													}

												}

												$('tr td').css({
													'background-color' : 'hash'
												});
												$('td', this)
														.css(
																{
																	'background-color' : '#b9fab5'
																});
												}
											});

							$("#dynamic-table").on(
									'click',
									'tr',
									function() {

										$('tr td').css({
											'background-color' : 'hash'
										});
										$('td', this).css({
											'background-color' : '#b9fab5'
										});

										//$("input#nid").val($(this).find('td:first').text());

										//window.location = $(this).find('a').attr('href');
									});

							$("#chall").click(
									function() {

										var $i = $("input#mall").val();

										for (var j = 1; j <= $i; j++) {
											var $p = "ch" + j;
											if ($('#chall').is(':checked')) {
												$("#" + $p + "").prop(
														"checked", true);
											} else {
												$("#" + $p + "").prop(
														"checked", false);
											}

										}
									});

							$('#btn').click(function(event) {
								$('#process').modal('show');
							});

							
							 var jk="";
						       
						       $('.assignCh')
								.click(
										function(event) {
											var $row = $(this).closest("tr");
											var id1 = $row.find('td:first').next().text()
											var old;
											if ($('#assignCh'+id1).is(':checked')) {
												
												jk=jk+id1+" "
												
												
											}else{
											
												old=id1+" ";
												jk=jk.replace(old,'');
												
											}

										});
						       
						       
						       $('#AssignBtn')
								.click(
										function(event) {
										var $empid = $("select#eid1").val();
											$.get(
															'SetDBDetails',
															{
																id : jk,
																eid : $empid
															},
															function(responseJson) {
																$
																		.each(
																				responseJson,
																				function(
																						key98,
																						value98) {
																					if (value98 == "ERROR") {
																					
																						bootbox.alert("Can't Perform Assign action Now, Please Try again later..");
																						// location.reload();
																																												
																					} else {
																						
																						//$row.remove();
																						
																					//	var $rows = $(
																						//"#editable-sample")
																						//.find(
																						//		"td:contains('"
																							//			+ $id
																								//		+ "')")
																						//.closest('tr');

																					//	var $columns = $($rows).find("td");
																						//if(value98 !=""){
																					//		$($columns[8]).text(value98);	
																						//}
																						

																						location.reload();
																					}

																				});
															});
											
										});

						});