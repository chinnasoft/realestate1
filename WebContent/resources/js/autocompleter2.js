$(function() {

	
	
	$("#community1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchCommunity",
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
	
	$("#lschool1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchLschool",
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
	
	$("#lboard1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchLboard",
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
	
	$("#language1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchLanguage",
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
	
	$("#occuption1").autocomplete({

		source : function(request, response) {
			$.ajax({
				url : "SearchOccuption",
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
