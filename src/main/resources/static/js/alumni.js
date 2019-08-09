$(document).ready(function(){
	
	$('#dept, #course, #batchno').on('change', function(e) {
		e.preventDefault();
		RefreshTable("#example","http://localhost:8080/alumni/datatable?department="+$('#dept').val()+"&course="+$('#course').val()+"&batchno="+$('#batchno').val());
	});
	
	

	  $('#example').DataTable({
		   "ajax": {
	        "url": 'http://localhost:8080/alumni/datatable?department='+$('#dept').val()+'&course='+$('#course').val()+"&batchno="+$('#batchno').val(),
	        "type": "GET",
	        "datatype":"json"
	    },
	    "columns": [
	    	{"data":"rollno"},
	        { "data": "name" },
	        {"data":"dob"}
	       
	        
	        
	    ]});



$("#name").keypress(function (e) {
          if((e.which >= 65 && e.which <= 122)||(e.which ==32)||(e.which==13)||(e.which==8)) {
                  $('span.error-span').remove();
                  return true;
                  }
             else{
                   $('span.error-span').remove();
                   $('#name').after('<span class="error-span">Alphabet Only</span>');
                   return false;
                   }
});
$("#name").attr('maxlength','60');


$(".email").focusout(function (){
	var isEmail = IsEmail($(".email").val());
    if(isEmail == true){
    	$('span.error-span').remove();
        return true;
    }else{
    	$('span.error-span').remove();
        $('#email').after('<span class="error-span">Enter Valid Email</span>')
         return false;
        }
	
});



});

function IsEmail(email) {
    debugger;
    var regex = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    return regex.test(email);
}

function RefreshTable(tableId, urlData)
{
  $.getJSON(urlData, null, function( json )
  {
    table = $(tableId).dataTable();
    oSettings = table.fnSettings();

    table.fnClearTable(this);

    for (var i=0; i<json.data.length; i++)
    {
      table.oApi._fnAddData(oSettings, json.data[i]);
    }

    oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();
    table.fnDraw();
  });
}
