
$(document).ready(function(){
	$('#submit').click(function (e) {
		e.preventDefault();
		
		var form = $("#contact_form")[0];
		var data = new FormData(form);
		$("#submit").prop("disabled", true);
		
        $.ajax({

            url:'contactapi',
            enctype: 'multipart/form-data',
            data: data,
            type:"POST",
            processData: false, //prevent jQuery from automatically transforming the data into a query string
            contentType: false,
            cache: false,
            timeout: 600000,
            success:function (data) {
            	$("#submit").prop("disabled", false);
                if (data) {
                    window.location.replace("");
                    alert("Email Sent To TSR");
                }
            },
            error:function (error){
            	$("#submit").prop("disabled", false);
            	console.log(error);
            	alert("Please fill all fields");
            }
            
        });

  });
	
	$("#attachment").on("change", function() {
		var splittedValue, attachmentValue = $(this).val();
		
		if (attachmentValue) {
			splittedValue = attachmentValue.split("\\");
			$(this).next(".attachment").html(splittedValue[splittedValue.length-1] + '<i class="fa fa-paperclip" id="fa"aria-hidden="true"></i>');
		} else {
			$(this).next(".attachment").html('Attachment<i class="fa fa-paperclip" id="fa"aria-hidden="true"></i>');
		}
	})
	
	
});