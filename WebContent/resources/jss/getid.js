$(document).ready(
		function() {
			$('#empname').change(function(event) {
				var $empname = $("select#empname").val();

				$.get('GetEmpId', {
					empname : $empname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {

						$('#empid').val(value11);
					});
				});

			});

			$('#empname').change(function(event) {
				var $empname = $("select#empname").val();

				if ($empname == "") {
					$('#status').val("Not Alloted");
					$('#doa').val("");
				} else {
					$('#status').val("Alloted");
				}
			});

			$('#cmpname').change(function(event) {
				var $cmpname = $("select#cmpname").val();
				$.get('GetCmpId', {
					cmpname : $cmpname
				}, function(responseJson) {
					$.each(responseJson, function(key13, value13) {
						$('#cmpid').val(value13);

					});
				});
			});

			$('#cstcmpname').keyup(function(event) {
				var $cstname = $("input#cstcmpname").val();
				$.get('GetCstCmpDetails', {
					cstname : $cstname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#cstcmpid').val(value11[0]);
						$('#cpname').val(value11[1]);
						$('#addrs').val(value11[2]);
						$('#state').val(value11[3]);
						$('#pin').val(value11[4]);
						$('#m1').val(value11[5]);
						$('#m2').val(value11[6]);
						$('#mail').val(value11[7]);

					});
				});

			});

			$('#cstcmpname1').keyup(function(event) {
				var $cstname = $("input#cstcmpname1").val();
				$.get('GetCstCmpDetails1', {
					cstname : $cstname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#cstcmpid').val(value11[0]);
						$('#cpname').val(value11[1]);
						$('#addrs').val(value11[2]);
						$('#state').val(value11[3]);
						$('#pin').val(value11[4]);
						$('#m1').val(value11[5]);
						$('#m2').val(value11[6]);
						$('#mail').val(value11[7]);

					});
				});

			});

			$('#itemname').change(function(event) {
				var $itemname = $("select#itemname").val();
				$.get('GetProductId', {
					itemname : $itemname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#pid').val(value11[0]);
					});
				});

			});

			$('#itemname').keyup(function(event) {
				var $itemname = $("input#itemname").val();
				$.get('GetProductId', {
					itemname : $itemname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#pid').val(value11[0]);
					});
				});

			});

			$('#cstname').change(function(event) {
				var $cstname = $("select#cstname").val();
				$.get('GetCstId', {
					cstname : $cstname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#cstid').val(value11);
						var $cstid = value11;

						$.get('GetMailId', {
							cid : $cstid
						}, function(responseJson) {
							$.each(responseJson, function(key12, value12) {
								$('#email').val(value12);

							});
						});

						$.get('GetCstAddr', {
							cid : $cstid
						}, function(responseJson) {
							$.each(responseJson, function(key13, value13) {
								$('textarea#addr').val(value13);

							});
						});

					});
				});

			});

			$('#cmpname').change(function(event) {
				var $cmpname = $("select#cmpname").val();
				$.get('GetCmpId', {
					cmpname : $cmpname
				}, function(responseJson) {
					$.each(responseJson, function(key13, value13) {
						$('#cmpid').val(value13);

					});
				});

			});

			$('#condname').change(function(event) {
				var $condname = $("select#condname").val();
				$.get('GetCondId', {
					condname : $condname
				}, function(responseJson) {
					$.each(responseJson, function(key13, value13) {
						$('#condid').val(value13);
					});
				});

			});

			$('#ftrname').change(function(event) {
				var $ftrname = $("select#ftrname").val();

				$.get('GetFtrId', {
					ftrname : $ftrname
				}, function(responseJson) {
					$.each(responseJson, function(key13, value13) {

						$('#ftrid').val(value13);
					});
				});

			});
			
			  $("#dbcname").autocomplete({
			   		source : function(request, response) {
			   			$.ajax({
			   				url : "SearchDbCname",
			   				type : "POST",
			   				data : {
			   					term : request.term
			   				},
			   				dataType : "json",
			   				success : function(data) {
			   					response(data);
			   				}
			   			});
			   		}
			   	});
			  
			  $("#pt").autocomplete({
			   		source : function(request, response) {
			   			$.ajax({
			   				url : "MailProcess",
			   				type : "POST",
			   				data : {
			   					term : request.term
			   				},
			   				dataType : "json",
			   				success : function(data) {
			   					response(data);
			   				}
			   			});
			   		}
			   	});
			  
			  $("#dealername").autocomplete({

					source : function(request, response) {
						$.ajax({
							url : "SearchCstCmpname",
							type : "POST",
							data : {
								term : request.term
							},
							dataType : "json",
							success : function(data) {

								response($.map(data, function(item) {
									return {
										label : item.cname,
										value : item.cname,
										v1 : item.cid,
										v2 : item.cpname,
										v3 : item.addrs,
										v4 : item.state,
										v5 : item.pin,
										v6 : item.m1,
										v7 : item.m2,
										v8 : item.mail,

									}
								}));
							},
						});

					},
					select : function(event, ui) {
						$('#cstcmpid').val(ui.item.v1);
						$('#cpname').val(ui.item.v2);
						$('#addrs').val(ui.item.v3);
						$('#state').val(ui.item.v4);
						$('#pin').val(ui.item.v5);
						$('#m1').val(ui.item.v6);
						$('#m2').val(ui.item.v7);
						$('#mail').val(ui.item.v8);
					},
					change : function(event, ui) {
						$('#cstcmpid').val(ui.item.v1);
						$('#cpname').val(ui.item.v2);
						$('#addrs').val(ui.item.v3);
						$('#state').val(ui.item.v4);
						$('#pin').val(ui.item.v5);
						$('#m1').val(ui.item.v6);
						$('#m2').val(ui.item.v7);
						$('#mail').val(ui.item.v8);
					},
					focus : function(event, ui) {

						$('#cstcmpname').val(ui.item.value);

						$('#cstcmpid').val(ui.item.v1);
						$('#cpname').val(ui.item.v2);
						$('#addrs').val(ui.item.v3);
						$('#state').val(ui.item.v4);
						$('#pin').val(ui.item.v5);
						$('#m1').val(ui.item.v6);
						$('#m2').val(ui.item.v7);
						$('#mail').val(ui.item.v8);
					}

				});

			$("#cstcmpname").autocomplete({

				source : function(request, response) {
					$.ajax({
						url : "SearchCstCmpname",
						type : "POST",
						data : {
							term : request.term
						},
						dataType : "json",
						success : function(data) {

							response($.map(data, function(item) {
								return {
									label : item.cname,
									value : item.cname,
									v1 : item.cid,
									v2 : item.cpname,
									v3 : item.addrs,
									v4 : item.state,
									v5 : item.pin,
									v6 : item.m1,
									v7 : item.m2,
									v8 : item.mail,

								}
							}));
						},
					});

				},
				select : function(event, ui) {
					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				},
				change : function(event, ui) {
					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				},
				focus : function(event, ui) {

					$('#cstcmpname').val(ui.item.value);

					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				}

			});

			$("#cstcmpname1").autocomplete(
					{

						source : function(request, response) {
							$.ajax({
								url : "SearchCstCmpame1",
								type : "POST",
								data : {
									term : request.term
								},
								dataType : "json",
								success : function(data) {

									response($.map(data, function(item) {
										return {
											label : item.cname,
											value : item.cname,
											v1 : item.cid,
											v2 : item.cpname,
											v3 : item.addrs,
											v4 : item.state,
											v5 : item.pin,
											v6 : item.m1,
											v7 : item.m2,
											v8 : item.mail,

										}
									}));
								},
							});

						},
						select : function(event, ui) {
							$('#cstcmpid').val(ui.item.v1);
							$('#cpname').val(ui.item.v2);
							$('#addrs').val(ui.item.v3);
							$('#state').val(ui.item.v4);
							$('#pin').val(ui.item.v5);
							$('#m1').val(ui.item.v6);
							$('#m2').val(ui.item.v7);
							$('#mail').val(ui.item.v8);
							var $msg = ui.item.value + " " + ui.item.v2 + " "
									+ ui.item.v3 + "  " + ui.item.v6 + " "
									+ ui.item.v7;
							$('#msg1').val($msg);

						},
						change : function(event, ui) {
							$('#cstcmpid').val(ui.item.v1);
							$('#cpname').val(ui.item.v2);
							$('#addrs').val(ui.item.v3);
							$('#state').val(ui.item.v4);
							$('#pin').val(ui.item.v5);
							$('#m1').val(ui.item.v6);
							$('#m2').val(ui.item.v7);
							$('#mail').val(ui.item.v8);
							var $msg = ui.item.value + " " + ui.item.v2 + " "
									+ ui.item.v3 + "  " + ui.item.v6 + " "
									+ ui.item.v7;
							$('#msg1').val($msg);

						},
						focus : function(event, ui) {

							$('#cstcmpname1').val(ui.item.value);

							$('#cstcmpid').val(ui.item.v1);
							$('#cpname').val(ui.item.v2);
							$('#addrs').val(ui.item.v3);
							$('#state').val(ui.item.v4);
							$('#pin').val(ui.item.v5);
							$('#m1').val(ui.item.v6);
							$('#m2').val(ui.item.v7);
							$('#mail').val(ui.item.v8);
							var $msg = ui.item.value + " " + ui.item.v2 + " "
									+ ui.item.v3 + "  " + ui.item.v6 + " "
									+ ui.item.v7;
							$('#msg1').val($msg);

						}

					});

			$("#cstcmpname2").autocomplete({

				source : function(request, response) {
					$.ajax({
						url : "SearchCstCmpame2",
						type : "POST",
						data : {
							term : request.term
						},
						dataType : "json",
						success : function(data) {

							response($.map(data, function(item) {
								return {
									label : item.cname,
									value : item.cname,
									v1 : item.cid,
									v2 : item.cpname,
									v3 : item.addrs,
									v4 : item.state,
									v5 : item.pin,
									v6 : item.m1,
									v7 : item.m2,
									v8 : item.mail,

								}
							}));
						},
					});

				},
				select : function(event, ui) {
					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				},
				change : function(event, ui) {
					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				},
				focus : function(event, ui) {

					$('#cstcmpname2').val(ui.item.value);

					$('#cstcmpid').val(ui.item.v1);
					$('#cpname').val(ui.item.v2);
					$('#addrs').val(ui.item.v3);
					$('#state').val(ui.item.v4);
					$('#pin').val(ui.item.v5);
					$('#m1').val(ui.item.v6);
					$('#m2').val(ui.item.v7);
					$('#mail').val(ui.item.v8);
				}

			});

			$('#cstcmpname2').keyup(function(event) {
				var $cstname = $("input#cstcmpname2").val();
				$.get('GetCstCmpDetails2', {
					cstname : $cstname
				}, function(responseJson) {
					$.each(responseJson, function(key11, value11) {
						$('#cstcmpid').val(value11[0]);
						$('#cpname').val(value11[1]);
						$('#addrs').val(value11[2]);
						$('#state').val(value11[3]);
						$('#pin').val(value11[4]);
						$('#m1').val(value11[5]);
						$('#m2').val(value11[6]);
						$('#mail').val(value11[7]);

					});
				});

			});

			$("#itemname").autocomplete({

				source : function(request, response) {
					$.ajax({
						url : "SearchItemName",
						type : "POST",
						data : {
							term : request.term
						},
						dataType : "json",
						success : function(data) {

							response($.map(data, function(item) {
								return {
									label : item.iname,
									value : item.iname,
									v1 : item.itemcode,
									v2 : item.pname,
									v3 : item.desc,
									v4 : item.uom,
									v5 : item.pcost,
									v6 : item.scost,
									v7 : item.stk,
									v8 : item.ids,
									v9 : item.slnos
								}
							}));
						},
					});

				},
				select : function(event, ui) {

					$('#pid').val(ui.item.v1);
					$('#desc').val(ui.item.v3);
					$('#uom').val(ui.item.v4);
					$('#amount').val(ui.item.v5);
					$('#stk').val(ui.item.v7);
					$('#ids').val(ui.item.v8);
					$('#slnos').val(ui.item.v9);
					
					
				},

				change : function(event, ui) {

					$('#pid').val(ui.item.v1);
					$('#desc').val(ui.item.v3);
					$('#uom').val(ui.item.v4);
					$('#amount').val(ui.item.v5);
					$('#stk').val(ui.item.v7);
					$('#ids').val(ui.item.v8);
					$('#slnos').val(ui.item.v9);
				
				},

				focus : function(event, ui) {

					$('#itemname').val(ui.item.value);
					$('#pid').val(ui.item.v1);
					$('#desc').val(ui.item.v3);
					$('#uom').val(ui.item.v4);
					$('#amount').val(ui.item.v5);
					$('#stk').val(ui.item.v7);
					$('#ids').val(ui.item.v8);
					$('#slnos').val(ui.item.v9);
					
				

				}

			});

		});