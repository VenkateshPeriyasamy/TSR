$(document).ready(function() {

    $('#submit').click(function () {
        $.ajax({

   
            url:'http://localhost:8080/aracah_alumni/'

        data: { rollno:$('#rollno').val(),
        	
        	    name:$('#name').val(),
        	    
        	    dob:$('#dob').val(),
        	    
        	    indosno:$('#indosno').val(),
               
                passedout:$('#passedout').val(),
                
                email:$('#email').val(),

                mobilenumber:$('#mobilenumber').val(),
                
                department:$('#department').val(),
                
                course:$('#course').val()
                
                
                
                 },
                
        

            method: "GET",

            success:function (data) {

                if (data) {

                    window.location.replace("");                

                }

            },

            error:function (data){

            }
            
        });

  });
    

    	

    
});
