$(document).ready(function() {
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

	$('#cstname').change(function(event) {
		var $cstname = $("select#cstname").val();
		$.get('GetCstId', {
			cstname : $cstname
		}, function(responseJson) {
			$.each(responseJson, function(key11, value11) {

				$('#cstid').val(value11);
			});
		});

	});

	

});