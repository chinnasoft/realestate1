jQuery(window).load(function() {
	$('.single-row input').click(function(){
		var childclass=$(this).parent();		
		var iname=$(this).prop("name");
		if(childclass.hasClass('checked')){
			
			$(childclass).removeClass('checked');	
			$("this").val("0");
		}
		else{
			
			$(childclass).addClass('checked'); 	
			$("this").val("1");
		}
    });
	
	
	
});