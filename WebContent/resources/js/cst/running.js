$(document).ready(function() {
	$(window).unload(function() {
		$.get('LogOutActionJSon', {}, function(responseJson) {
			$.each(responseJson, function(key11, value11) {
				
			});

		});
	});
	
});