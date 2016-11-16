$(document).ready(
		function() {
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			

			$('#clickdate').click(function(event) {

				$("input#wy").val("");
				$("input#d11").val("");
				$("input#d22").val("");

			});

			$("#wy").keyup(
					function(e) {
						var dos = $("input#dos").val();
						var $y = $("input#wy").val();

						// alert(dos+" "+$y);

						if (!($.isNumeric($y))) {
							// bootbox.alert("Enter valid values");
							$("input#wy").val("");
							$("input#d11").val("");
							$("input#d22").val("");
						} else {

							// var today = new Date();
							// var dd = today.getDate();
							// var mm = today.getMonth()+1; //January is
							// 0!
							// var yyyy = today.getFullYear();
							// if(dd<10){
							// dd='0'+dd
							// }
							// if(mm<10){
							// mm='0'+mm
							// }
							// var today = dd+'-'+mm+'-'+yyyy;

							var parts = dos.split('-');
							var date = new Date(parseInt(parts[2], 10),
									parseInt(parts[1], 10) - 1, parseInt(
											parts[0] - 1, 10));

							// alert(dos+" "+$y+" "+date);

							date.setFullYear(date.getFullYear() + ($y * 1));
							$('input#d11').val(dos);
							$('input#d22').val(
									isNaN(date.getFullYear()) ? ''
											: formatDate(date));

						}

					});

			function formatDate(date) {
				var day = date.getDate();
				var month = date.getMonth() + 1;
				var year = date.getFullYear();

				// alert(day+" "+month+" "+year);

				return (day < 10 ? '0' : '') + day + '-'
						+ (month < 10 ? '0' : '') + month + '-' + year;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		});