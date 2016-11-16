$(document).ready(function() {
	
	
	
	$('#cmd').click(function () {
	    var pdf = new jsPDF('p', 'pt', 'letter'),
	    source = $('#p1')[0],
	    margins = {
	        top: 40,
	        bottom: 40,
	        left: 40,
	        right: 40,
	        width: 522
	    };

	    pdf.fromHTML(
	        source,
	        margins.left,
	        margins.top,
	        {
	        'width': margins.width 
	        },
	        function (dispose) {
	            pdf.save('Test.pdf');
	        },
	        margins
	   );
	});


	$('#cmd1').click(function () {
	   var doc = new jsPDF();
	    doc.addHTML($('#p1')[0], 0, 0, {
	      'background': 'hash',
	    }, function() {
	      doc.save('sample-file.pdf');
	    });
	});  
	    
	    
	 $('#create_pdf1').on('click',function(){
         html2canvas($("#p1"), {
         onrendered: function (canvas) {
        	 
         var doc = new jsPDF();	
         	
         var imageData = canvas.toDataURL("image/jpeg");
         var image = new Image();
                                                                                                      
         image = Canvas2Image.convertToJPEG(canvas);
        
        // doc.addImage(imageData, 'JPEG', 5, 5 );
         
        		var sourceX = 0;
                var sourceY = 0;
                
                 var sourceWidth = image.width;
                 var sourceHeight = image.height;
                 var destWidth = sourceWidth ;
                 var destHeight = sourceHeight ;
                 var destX = 0;
                 var destY = 0;
                 var canvas1 = document.createElement('canvas');
                 
                 canvas1.setAttribute('height', destHeight);
                 canvas1.setAttribute('width', destWidth);                         
                 var ctx = canvas1.getContext("2d");
                 ctx.drawImage(image, sourceX, 
                                      sourceY,
                                      sourceWidth,
                                      sourceHeight, 
                                      destX, 
                                      destY, 
                                      destWidth, 
                                      destHeight);
                 var image2 = new Image();
                 image2 = Canvas2Image.convertToJPEG(canvas1);
                 image2Data = image2.src;
                 doc.addImage(image2Data, 'JPEG', 5, 5);
         
         
         var croppingYPosition = 1046;
         count = (image.height) / 1046;

         for (var i =1; i < count; i++) {
                 doc.addPage();
                 var sourceX = 0;
                 var sourceY = croppingYPosition;
                 var sourceWidth = image.width;
                 var sourceHeight = (image.height) - (1046 * i) ;
                 var destWidth = sourceWidth ;
                 var destHeight = sourceHeight ;
                 var destX = 0;
                 var destY = 0;
                 var canvas1 = document.createElement('canvas');
                 canvas.backgroundColor="blue";
                 canvas1.setAttribute('height', destHeight);
                 canvas1.setAttribute('width', destWidth);                         
                 var ctx = canvas1.getContext("2d");
                 ctx.drawImage(image, sourceX, 
                                      sourceY,
                                      sourceWidth,
                                      sourceHeight, 
                                      destX, 
                                      destY, 
                                      destWidth, 
                                      destHeight);
                 var image2 = new Image();
                 image2 = Canvas2Image.convertToJPEG(canvas1);
                 image2Data = image2.src;
                 doc.addImage(image2Data, 'JPEG', 5, 5);
                 croppingYPosition += destHeight;              
             }                  
         var d = new Date().toISOString().slice(0, 10).replace(/-/g, "");
         filename = 'Quotation_' + d + '.pdf';
         
         doc.save(filename);
         
//          var string = doc.output('datauristring');
//          var iframe = "<iframe width='100%' height='100%' src='" + string + "'></iframe>"
//          var x = window.open();
//          x.document.open();
//          x.document.write(iframe);
//          x.document.copy("c:\\temp\\testpdf.pdf");
//          alert(x.document.URL);
//          x.document.close();
          
          

          
       }

 });
});
	    
	
	    $("#word-export").click(function(event) {                                                  
        	$("#p1").wordExport();
        });
   
	    
	   
	
});