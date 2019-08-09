$(document).ready(function() {

	$('#admin-login-form').submit(function(e) {
	    e.preventDefault();
	    var username = $('input#admin-username').val();
	    var password = $('input#admin-password').val();

	    if(username == ""){
		       alert("Please enter a Username");
		       $('#admin-username').focus();
		       return false;
		    }
	    
	    if(password == ""){
	       alert("Please enter a Password");
	       $('#admin-password').focus();
	       return false;
	    }
	    /*
	      if( username == "admin" && password == "admin123"){
        alert("Login successfully");
        window.location = "/admin_details";
        return false;
    } */

	   if(username != '' && password != '') {
	        $.ajax({
	            url: 'http://localhost:8080/adminapi/',
	            type: 'POST',
	            data: {
	                username: username,
	                password: password
	            },
	            success: function(data) {
	                console.log(data);
	                // It looks like the page that handles the form returns JSON
	                // Parse the JSON
	                var obj = JSON.parse(data);

	                if(obj.result != 'invalid') {
	                    alert("Login succeeded");
	                    // You should redirect the user too
	                    window.location = '/admin_details';
	                }
	                else{
	                	 alert("Login failed - Please enter correct Username and Password")   
	                	}
	            }
	        });
	    } 
	   
//    $('#about').click(function () {
//        $.ajax({
//
//   
//            url:'http://localhost:8080/about.html',//formName change
//
//        data: { username:$('#username').val(),
//
//                Password:$('#Password').val(),
//
//                ConfirmPassword:$('#confirm').val(),
//
//                email:$('#email').val(),
//
//                mobilenumber:$('#mobilenumber').val()},
//
//            method: 'GET',
//
//            success:function (data) {
//
//                if (data) {
//
//                    window.location.replace("");                
//
//                }
//
//            },
//
//            error:function (data){
//
//            }
//        });
//    });
//    
    
    
    
  });
});
