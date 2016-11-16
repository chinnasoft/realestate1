$(document).ready(function() {

$('#plus').click(
							function(event) {
								var $a1 = $("select#itemname").val();
								var $a2 = $("input#pid").val();
								var $a3 = $("input#quan").val();
								
								if($a3=="" || $a2=="" || !($.isNumeric($a3))){
								bootbox.alert("Valid values are required.");
								}else{
								
                				var newRowContent = "<tr><td>"+$a2+"</td><td>"+$a1+"</td><td>"+$a3+"</td></tr>";
								$("#productadd tbody").append(newRowContent); 
									
									$("select#itemname").val("");
									$("input#quan").val("");
									$("input#pid").val("");								
									
							}
						});


	$('#minus').click(
				function(event) {

						$('#productadd tr:last').remove();

			});

	
		$("#iamount").keyup(
					function(e) {

								var $r1 = $("input#iamount").val();
								
								$("input#totamount").val(($r1*1).toFixed(2));
								
								});

		$("#tax").keyup(
					function(e) {

								var $r1 = $("input#iamount").val();
								var $r2 = $("input#tax").val();

								if($r1=="" || $r2==""){
								$("input#totamount").val(($r1*1).toFixed(2));
								}else{				
										if($r2==""){
											$("input#totamount").val(($r1*1).toFixed(2));
											}
											else{													
													var $r3 = (($r1 * $r2) / 100).toFixed(2);
														
													$("input#totamount").val((($r3*1)+($r1*1)).toFixed(2));
												}			
									}
								
								
								
								});



			
			$('#plus2').click(
							function(event) {
								var $a1 = $("select#itemname").val();
								var $a2 = $("input#pid").val();
								var $a3 = $("input#quan").val();

								var $a4 = $("input#amount").val();
								var $a5 = $("input#dis").val();
								var $a6 = $("input#tax").val();
								
								
								if($a3=="" || $a2=="" || !($.isNumeric($a3)) || !($.isNumeric($a4))){
								bootbox.alert("Valid values are required."); 
								}else{
								
							  if( !($.isNumeric($a5)) || !($.isNumeric($a6)) ){
								bootbox.alert("Valid values are required.");
								}else{
                                      	
										var $r1, $r2, $r3, $r4; 

										$r1=($a4*1)*($a3*1);

                                       if($r5==""){
												$r2 =($r1*1);
											}
											else{													
													$r2 = (($a4 * $a5) / 100).toFixed(2);
													
												}	


										if($r6==""){
											      $r3 =($r1*1);
											}
											else{													
													$r3 = (($a4 * $a6) / 100).toFixed(2);
													
												}	


											
										$r4=($r1*1)-($r2*1)+($r3*1);
														

                				var newRowContent = "<tr><td>"+$a1+"</td><td>"+$a2+"</td><td>"+$a4+"</td><td>"+$a3+"</td><td>"+$r1+"</td><td>"+$a5+"</td><td>"+$r2+"</td><td>"+$a6+"</td><td>"+$r3+"</td><td>"+$r4+"</td></tr>";
								$("#productadd tbody").append(newRowContent); 
									
									$("select#itemname").val("");
									$("input#quan").val("");
									$("input#pid").val("");	
									$("input#amount").val("");
									$("input#dis").val("");	
									$("input#tax").val("");
									
								}							
									
							}
						});


	$('#minus2').click(
				function(event) {

						$('#productadd tr:last').remove();

			});
			
			});