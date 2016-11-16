$(document).ready(function() {
	
	

	   $("#qty").keyup(function(e) {
									var $a3 = $("input#qty").val();
									if (!($.isNumeric($a3))) {
										// bootbox.alert("Enter valid values");
										$("input#qty").val("");
										$("#slno").attr("checked", false);
										$("#slno").attr("disabled", true);
										$("#TextBoxContainer").empty();
									}else{
										$("#slno").attr("disabled", false);
									}

								});
						       
						       
						       $("#slno").click(function() {
									if ($('#slno').is(':checked')) {
										var qty = $("input#qty").val();
										var i;
										var line="";
										 var div = $("<div>");
										for (i = 0; i < qty; i++) {
											
									       // div = div+div.html('<div class="form-group"><label class="col-sm-3 control-label">Quantity</label><div class="col-md-6"><input parsley-type="number" type="text" class="form-control" id="qty" name="qty" parsley-minlength="1" parsley-maxlength="100" placeholder="Enter Quantity"  /></div></div>');										       
									      line=line+GetDynamicTextBox(i+1);
											
										}
										div.html(line);
									     $("#TextBoxContainer").append(div);
									     $('#SLNO1').focus();
									} else {
										$("#TextBoxContainer").empty();
									}
								});
	
	
	
	
});