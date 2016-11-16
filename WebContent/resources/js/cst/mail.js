$(document).ready(
		function() {

			$("#m1").click(function() {

				if ($('#m1').is(':checked')) {
					$("#st1").attr("disabled", false);
					$("#st2").attr("disabled", false);
					$("#st3").attr("disabled", false);
				} else {
					$("#st1").attr("disabled", true);
					$("#st2").attr("disabled", true);
					$("#st3").attr("disabled", true);
					$("#st1").val("");
					$("#st2").val("");
					$("#st3").val("");
				}

			});

			$("#m2").click(function() {

				if ($('#m2').is(':checked')) {
					$("#st4").attr("disabled", false);

				} else {
					$("#st4").attr("disabled", true);

					$("#st4").val("");

				}

			});

			$('#mailCheck').click(
					function(event) {
						var $r1 = $("input#mailserver").val();
						var $r2 = $("input#portnumber").val();
						var $r3 = $("input#frommail").val();
						var $r4 = $("input#pass").val();
						$('#myModal54').modal('show');
						$.get('GetMailTest', {
							r1 : $r1,
							r2 : $r2,
							r3 : $r3,
							r4 : $r4
						}, function(responseJson) {

							$.each(responseJson, function(key1, value1) {
								$('#myModal54').modal('hide');
								if (new String("true").valueOf() == new String(
										value1).valueOf()) {
									$('#myModal55').modal('show');
								} else {
									$('#myModal56').modal('show');
								}
							});

						});
					});

		});