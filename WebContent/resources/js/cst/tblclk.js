$(document).ready(function() {

	$("#dynamic-table tbody tr").click(function(e) {

		$('tr td').css({
			'background-color' : 'hash'
		});
		$('td', this).css({
			'background-color' : '#FF6666'
		});

		$("input#nid").val($(this).find('td:first').text());

	});

	$("#editable-sample tbody tr").click(function(e) {
		$('tr td').css({
			'background-color' : 'hash'
		});
		$('td', this).css({
			'background-color' : '#FF6666'
		});

		$("input#nid").val($(this).find('td:first').text());

	});
	
	
	

});