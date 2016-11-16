$(function() {
	
	
	
	
	$("#qualification1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchQualification",
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

	$("#department1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchDeaprtment",
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

	$("#desg").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchDesignation",
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
	
	$("#parentname1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchParentItem",
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
	
	$("#pin").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchPincode",
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

	$("#state").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchState",
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


	
	$("#tax").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchTax",
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
	
	$("#projectname").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchProjectName",
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
	
});
