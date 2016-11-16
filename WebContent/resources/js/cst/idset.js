$(document).ready(
		function() {

			$("#ch1").click(function() {
				if ($('#ch1').is(':checked')) {
					$("#prefix1").attr("disabled", false);
				} else {
					$("#prefix1").attr("disabled", true);
					$("#prefix1").val("");
				}
			});

			$("#ch2").click(function() {
				if ($('#ch2').is(':checked')) {
					$("#numeric1").attr("disabled", false);
				} else {
					$("#numeric1").attr("disabled", true);
					$("#numeric1").val("");
				}
			});

			$("#ch3").click(function() {
				if ($('#ch3').is(':checked')) {
					$("#suffix1").attr("disabled", false);
				} else {
					$("#suffix1").attr("disabled", true);
					$("#suffix1").val("");
				}
			});

			$("#set1").click(function() {
				$("#ch1").attr("disabled", true);
				$("#ch2").attr("disabled", true);
				$("#ch3").attr("disabled", true);

				$("#prefix1").attr("disabled", true);
				$("#numeric1").attr("disabled", true);
				$("#suffix1").attr("disabled", true);

				$("#prefix1").val("");
				$("#numeric1").val("");
				$("#suffix1").val("");

				$("#ch1").attr("checked", false);
				$("#ch2").attr("checked", false);
				$("#ch3").attr("checked", false);
			});

			$("#set2").click(function() {
				$("#ch1").attr("disabled", false);
				$("#ch2").attr("disabled", false);
				$("#ch3").attr("disabled", false);

				$("#ch1").attr("checked", false);
				$("#ch2").attr("checked", false);
				$("#ch3").attr("checked", false);
			});

			$("#set11").click(function() {
				$("#ch1").attr("disabled", true);
				$("#ch2").attr("disabled", true);
				$("#ch3").attr("disabled", true);

				$("#prefix1").attr("disabled", true);
				$("#numeric1").attr("disabled", true);
				$("#suffix1").attr("disabled", true);

				$("#prefix1").val("");
				$("#numeric1").val("");
				$("#suffix1").val("");

				$("#ch1").attr("checked", false);
				$("#ch2").attr("checked", false);
				$("#ch3").attr("checked", false);
			});

			$("#ch4").click(function() {
				if ($('#ch4').is(':checked')) {
					$("#prefix2").attr("disabled", false);
				} else {
					$("#prefix2").attr("disabled", true);
					$("#prefix2").val("");
				}
			});

			$("#ch5").click(function() {
				if ($('#ch5').is(':checked')) {
					$("#numeric2").attr("disabled", false);
				} else {
					$("#numeric2").attr("disabled", true);
					$("#numeric2").val("");
				}
			});

			$("#ch6").click(function() {
				if ($('#ch6').is(':checked')) {
					$("#suffix2").attr("disabled", false);
				} else {
					$("#suffix2").attr("disabled", true);
					$("#suffix2").val("");
				}
			});

			$("#set3").click(function() {
				$("#ch4").attr("disabled", true);
				$("#ch5").attr("disabled", true);
				$("#ch6").attr("disabled", true);

				$("#prefix2").attr("disabled", true);
				$("#numeric2").attr("disabled", true);
				$("#suffix2").attr("disabled", true);

				$("#prefix2").val("");
				$("#numeric2").val("");
				$("#suffix2").val("");

				$("#ch4").attr("checked", false);
				$("#ch5").attr("checked", false);
				$("#ch6").attr("checked", false);
			});

			$("#set4").click(function() {
				$("#ch4").attr("disabled", false);
				$("#ch5").attr("disabled", false);
				$("#ch6").attr("disabled", false);

				$("#ch4").attr("checked", false);
				$("#ch5").attr("checked", false);
				$("#ch6").attr("checked", false);
			});

			$("#set12").click(function() {
				$("#ch4").attr("disabled", true);
				$("#ch5").attr("disabled", true);
				$("#ch6").attr("disabled", true);

				$("#prefix2").attr("disabled", true);
				$("#numeric2").attr("disabled", true);
				$("#suffix2").attr("disabled", true);

				$("#prefix2").val("");
				$("#numeric2").val("");
				$("#suffix2").val("");

				$("#ch4").attr("checked", false);
				$("#ch5").attr("checked", false);
				$("#ch6").attr("checked", false);
			});

			$("#ch7").click(function() {
				if ($('#ch7').is(':checked')) {
					$("#prefix3").attr("disabled", false);
				} else {
					$("#prefix3").attr("disabled", true);
					$("#prefix3").val("");
				}
			});

			$("#ch8").click(function() {
				if ($('#ch8').is(':checked')) {
					$("#numeric3").attr("disabled", false);
				} else {
					$("#numeric3").attr("disabled", true);
					$("#numeric3").val("");
				}
			});

			$("#ch9").click(function() {
				if ($('#ch9').is(':checked')) {
					$("#suffix3").attr("disabled", false);
				} else {
					$("#suffix3").attr("disabled", true);
					$("#suffix3").val("");
				}
			});

			$("#set5").click(function() {
				$("#ch7").attr("disabled", true);
				$("#ch8").attr("disabled", true);
				$("#ch9").attr("disabled", true);

				$("#prefix3").attr("disabled", true);
				$("#numeric3").attr("disabled", true);
				$("#suffix3").attr("disabled", true);

				$("#prefix3").val("");
				$("#numeric3").val("");
				$("#suffix3").val("");

				$("#ch7").attr("checked", false);
				$("#ch8").attr("checked", false);
				$("#ch9").attr("checked", false);
			});

			$("#set6").click(function() {
				$("#ch7").attr("disabled", false);
				$("#ch8").attr("disabled", false);
				$("#ch9").attr("disabled", false);

				$("#ch7").attr("checked", false);
				$("#ch8").attr("checked", false);
				$("#ch9").attr("checked", false);
			});

			$("#set13").click(function() {
				$("#ch7").attr("disabled", true);
				$("#ch8").attr("disabled", true);
				$("#ch9").attr("disabled", true);

				$("#prefix3").attr("disabled", true);
				$("#numeric3").attr("disabled", true);
				$("#suffix3").attr("disabled", true);

				$("#prefix3").val("");
				$("#numeric3").val("");
				$("#suffix3").val("");

				$("#ch7").attr("checked", false);
				$("#ch8").attr("checked", false);
				$("#ch9").attr("checked", false);
			});

			$("#ch10").click(function() {
				if ($('#ch10').is(':checked')) {
					$("#prefix4").attr("disabled", false);
				} else {
					$("#prefix4").attr("disabled", true);
					$("#prefix4").val("");
				}
			});

			$("#ch11").click(function() {
				if ($('#ch11').is(':checked')) {
					$("#numeric4").attr("disabled", false);
				} else {
					$("#numeric4").attr("disabled", true);
					$("#numeric4").val("");
				}
			});

			$("#ch12").click(function() {
				if ($('#ch12').is(':checked')) {
					$("#suffix4").attr("disabled", false);
				} else {
					$("#suffix4").attr("disabled", true);
					$("#suffix4").val("");
				}
			});

			$("#set7").click(function() {
				$("#ch10").attr("disabled", true);
				$("#ch11").attr("disabled", true);
				$("#ch12").attr("disabled", true);

				$("#prefix4").attr("disabled", true);
				$("#numeric4").attr("disabled", true);
				$("#suffix4").attr("disabled", true);

				$("#prefix4").val("");
				$("#numeric4").val("");
				$("#suffix4").val("");

				$("#ch10").attr("checked", false);
				$("#ch11").attr("checked", false);
				$("#ch12").attr("checked", false);
			});

			$("#set8").click(function() {
				$("#ch10").attr("disabled", false);
				$("#ch11").attr("disabled", false);
				$("#ch12").attr("disabled", false);

				$("#ch10").attr("checked", false);
				$("#ch11").attr("checked", false);
				$("#ch12").attr("checked", false);
			});

			$("#set14").click(function() {
				$("#ch10").attr("disabled", true);
				$("#ch11").attr("disabled", true);
				$("#ch12").attr("disabled", true);

				$("#prefix4").attr("disabled", true);
				$("#numeric4").attr("disabled", true);
				$("#suffix4").attr("disabled", true);

				$("#prefix4").val("");
				$("#numeric4").val("");
				$("#suffix4").val("");

				$("#ch10").attr("checked", false);
				$("#ch11").attr("checked", false);
				$("#ch12").attr("checked", false);
			});

			$("#ch13").click(function() {
				if ($('#ch13').is(':checked')) {
					$("#prefix5").attr("disabled", false);
				} else {
					$("#prefix5").attr("disabled", true);
					$("#prefix5").val("");
				}
			});

			$("#ch14").click(function() {
				if ($('#ch14').is(':checked')) {
					$("#numeric5").attr("disabled", false);
				} else {
					$("#numeric5").attr("disabled", true);
					$("#numeric5").val("");
				}
			});

			$("#ch15").click(function() {
				if ($('#ch15').is(':checked')) {
					$("#suffix5").attr("disabled", false);
				} else {
					$("#suffix5").attr("disabled", true);
					$("#suffix5").val("");
				}
			});

			$("#set9").click(function() {
				$("#ch13").attr("disabled", true);
				$("#ch14").attr("disabled", true);
				$("#ch15").attr("disabled", true);

				$("#prefix5").attr("disabled", true);
				$("#numeric5").attr("disabled", true);
				$("#suffix5").attr("disabled", true);

				$("#prefix5").val("");
				$("#numeric5").val("");
				$("#suffix5").val("");

				$("#ch13").attr("checked", false);
				$("#ch14").attr("checked", false);
				$("#ch15").attr("checked", false);
			});

			$("#set10").click(function() {
				$("#ch10").attr("disabled", false);
				$("#ch11").attr("disabled", false);
				$("#ch12").attr("disabled", false);

				$("#ch10").attr("checked", false);
				$("#ch11").attr("checked", false);
				$("#ch12").attr("checked", false);
			});

			$("#set15").click(function() {
				$("#ch13").attr("disabled", true);
				$("#ch14").attr("disabled", true);
				$("#ch15").attr("disabled", true);

				$("#prefix5").attr("disabled", true);
				$("#numeric5").attr("disabled", true);
				$("#suffix5").attr("disabled", true);

				$("#prefix5").val("");
				$("#numeric5").val("");
				$("#suffix5").val("");

				$("#ch13").attr("checked", false);
				$("#ch14").attr("checked", false);
				$("#ch15").attr("checked", false);
			});

			
		});
