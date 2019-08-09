
$(document).ready(function(){
	var editor;
    var update_editor;
    var delete_editor;
    
    $('#submit').click(function () {
        $.ajax({
   
            url:'http://localhost:8080/alumniapi/',
        data: { rollno:$('#rollno').val(),
            
                name:$('#name').val(),
                
                dob:$('#dob').val(),
                
                indosno:$('#indosno').val(),
               
                passedout:$('#passedout').val(),
                
                email:$('#email').val(),
                
                mobilenumber:$('#mobilenumber').val(),
                
                department:$('#department').val(),
                
                course:$('#courses').val(),
                
                batchno:$('#batchno').val()
                
                 },
                
        
            type:"POST",
            success:function (data) {
                if (data) {
                    window.location.replace("");                
                }
            },
            error:function (data){
            }
            
        });
  });
    
    $('#dept, #course, #batchno').on('change', function(e) {
        e.preventDefault();
        RefreshTable("#example","http://localhost:8080/alumni/datatable?department="+$('#dept').val()+"&course="+$('#course').val()+"&batchno="+$('#batchno').val());
    });
    editor = new $.fn.dataTable.Editor( {
        "ajax":'http://localhost:8080/admin_detailsapi/',
       
              
        "table": "#example",
        "idSrc":  'rollno',
        "fields": [{
                "label": "Roll no:",
                "name":  "rollno"
            }, {
                "label": "Name:",
                "name":"name"
            }, {
                "label": "DOB:",
                "name": "dob"
            }, {
                "label": "INDoSNO:",
                "name": "indosno"
            }, {
                "label": "Year of Passing:",
                "name": "passedout",
            }, {
                "label": "Batch No:",
                "name": "batchno"
            },
            {
                "label": "Course Type:",
                "name": "department"
            },
            {
                "label": "Course:",
                "name": "course"
            }
        
        ]
    
    } );
    update_editor = new $.fn.dataTable.Editor( {
        "ajax":'http://localhost:8080/admin_detailsapi/',
       
              
        "table": "#example",
        "idSrc":  'rollno',
        "fields": [
            {
            "label": "Id:",
            "name":  "id",
            "type":"readonly"
            
            },{
                "label": "Roll no:",
                "name":  "rollno"
            }, {
                "label": "Name:",
                "name":"name"
            }, {
                "label": "DOB:",
                "name": "dob"
            }, {
                "label": "INDoSNO:",
                "name": "indosno"
            }, {
                "label": "Year of Passing:",
                "name": "passedout",
            }, {
                "label": "Batch No:",
                "name": "batchno"
            },
            {
                "label": "Course Type:",
                "name": "department"
            },
            {
                "label": "Course:",
                "name": "course"
            }
        
        ]
    
    } );
    
    delete_editor=new $.fn.dataTable.Editor( {
        "ajax":'http://localhost:8080/admin_detailsapi/',
       
              
        "table": "#example",
        "idSrc":  'rollno',
        "fields": [
            {
                "label": "Id:",
                "name":  "id",
                "type":"readonly",
                "method":"hide"
                
                }
            ]
    });
      $('#example').DataTable({
           ajax: {
           url: 'http://localhost:8080/alumni/datatable?department='+$('#dept').val()+'&course='+$('#course').val()+"&batchno="+$('#batchno').val(),
           type: "GET",
          
            "datatype":"json"
        },
        columns: [
            {data:"rollno"},
            {data: "name" },
            {data:"dob"},
            {data:"indosno"},
            {data:"passedout"},
            {data: "batchno" },
            {
                data: null,
                className: "center",
                defaultContent: '<a href="" class="update_editor_edit">Edit</a> / <a href="" class="delete_editor_remove">Delete</a>'
                    
            }
           
       ]});
      
      
      $('a.editor_create').click( function (e) {
            e.preventDefault();
     
            editor.create( {
                title: 'Create new record',
                buttons: [
                    {
                        label:'Add',fn:function add(){
                             $.ajax({
                                   
                                    url:'http://localhost:8080/admin_addapi/',
                                data: { rollno:$('#DTE_Field_rollno').val(),
                                    
                                        name:$('#DTE_Field_name').val(),
                                        
                                        dob:$('#DTE_Field_dob').val(),
                                        
                                        indosno:$('#DTE_Field_indosno').val(),
                                       
                                        passedout:$('#DTE_Field_passedout').val(),
                                        
                                        email:$('#DTE_Field_email').val(),
                                        mobilenumber:$('#DTE_Field_mobilenumber').val(),
                                        
                                        department:$('#DTE_Field_department').val(),
                                        
                                        course:$('#DTE_Field_course').val(),
                                        
                                        batchno:$('#DTE_Field_batchno').val()
                                  
                                         },
                                         
                                         type:"POST",
                                    success:function (data) {
                                        if (data) {
                                            window.location.replace("");                
                                        }
                                    },
                                    error:function (data){
                                    }
                                   
                            
                             });
                    }
                    }
                ]
                    
            } );
        } );
      $('#example').on('click', 'a.update_editor_edit', function (e) {
          e.preventDefault();
      update_editor.edit( $(this).closest('tr'), {
          title: 'Update record',
          buttons: [
            {
                label:'Update',fn:function update(){
                     $.ajax({
                           
                            url:'http://localhost:8080/admin_updateapi/',
                        data: { id:$('#DTE_Field_id').val(),
                            
                                rollno:$('#DTE_Field_rollno').val(),
                            
                                name:$('#DTE_Field_name').val(),
                                
                                dob:$('#DTE_Field_dob').val(),
                                
                                indosno:$('#DTE_Field_indosno').val(),
                               
                                passedout:$('#DTE_Field_passedout').val(),
                                
                                email:$('#DTE_Field_email').val(),
                                mobilenumber:$('#DTE_Field_mobilenumber').val(),
                                
                                department:$('#DTE_Field_department').val(),
                                
                                course:$('#DTE_Field_course').val(),
                                
                                batchno:$('#DTE_Field_batchno').val()
                          
                                 },
                                 
                                 type:"POST",
                            success:function (data) {
                                if (data) {
                                    window.location.replace("");                
                                }
                            },
                            error:function (data){
                            }
                        
                     });
            }
            }
          ]
            
      } );
      } );
    
      
/*      $('#example').on('click', 'a.delete_editor_remove', function (e) {
            e.preventDefault();
     
            delete_editor.edit( $(this).closest('tr'), {
                title: 'Delete record',
               message: 'Are you sure you wish to remove this record?',
                buttons: [
                    {
                        label:'delete',fn:function remove(){
                             $.ajax({
                                   
                                    url:'http://localhost:8080/admin_deleteapi/',
                                data: { id:$('#DTE_Field_id').val()
                                },
                              type:"POST",
                                success:function (data) {
                                    if (data) {
                                        window.location.replace("");                
                                    }
                                },
                                error:function (data){
                                }
                            
                         });
                }
                }
              ]
                                
            } );
        } );
      */
});
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