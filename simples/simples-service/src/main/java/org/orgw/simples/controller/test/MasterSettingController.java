package org.orgw.simples.controller.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.data.MasterSettingRequest;
import org.orgw.simples.data.MasterSettingResponse;
import org.orgw.simples.data.Response;

import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.service.IMasterSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterSettingController extends BaseController{

	
	private final Logger log = Logger.getLogger(getClass());
	    
	
      @Autowired
      IMasterSettingService mastersettingserivece;
      
     
      
      
      @PostMapping(value="/user/employeelist", produces = "application/json; charset=UTF-8")
      public Response mastersettingrequest(@RequestBody MasterSettingRequest request)throws BaseException {
    	  
    	  
		return response(mastersettingserivece.mastersettinglist(request));
    	  
      }

      
      @RequestMapping(path="/user/createrecord",method=RequestMethod.POST, produces = "application/json; charset=UTF-8")
      public Response  mastersetting(@RequestBody MasterSettingRequest request)throws BaseException {
		return response(mastersettingserivece.mastercreaterecord(request));
    	  
      }
      
      @PostMapping(value="/user/editrecord", produces = "application/json; charset=UTF-8")
      public Response editrequest(@RequestBody MasterSettingRequest editrequest)throws BaseException{
	  return response(mastersettingserivece.geteditlist(editrequest));
  }
      

	@Override
	protected String getServiceCode() {
		// TODO Auto-generated method stub
		return null;
	}
}
