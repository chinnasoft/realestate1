$(document).ready(function() {
 
    var source = ['jQuery', 'Dojo', 'ExtJs', 'Prototype', 'Java', 'Android', 'MySQL', 'PHP', 'karthik'];
    
    

		$.ajax({
			url : "SearchController",
			type : "POST",
			data : {
				term : request.term
			},
			dataType : "json",
			success : function(data) {
				response(data);
			}
		});
	
    
    
    
    $("input#myDropDown").autocomplete({
        minLength: 0,
        source: source,
        autoFocus: true,
        scroll: true,
    }).focus(function() {
        $(this).autocomplete("search", "");
    }).live("blur", function(event) {
        var autocomplete = $(this).data("autocomplete");
        var matcher = new RegExp("^" + $.ui.autocomplete.escapeRegex($(this).val()) + "$", "i");
        autocomplete.widget().children(".ui-menu-item").each(function() {
            //Check if each autocomplete item is a case-insensitive match on the input
            var item = $(this).data("item.autocomplete");
            if (matcher.test(item.label || item.value || item)) {
                //There was a match, lets stop checking
                autocomplete.selectedItem = item;
                return;
            }
            else{
            	 autocomplete.selectedItem = item;
                 return;
            }
        });
        //if there was a match trigger the select event on that match
        if (autocomplete.selectedItem) {
            autocomplete._trigger("select", event, {
                item: autocomplete.selectedItem
            });
        //there was no match, clear the input
        } else {
            $(this).val('');
        }
    });
});