package org.orgw.simples.controller.test;

import org.apache.log4j.Logger;
import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.LeaveTypeMasterRequest;
import org.orgw.simples.data.Response;
import org.orgw.simples.service.ILeaveTypeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveTypeMasterController  extends BaseController{
	
	
	 private final Logger  log = Logger.getLogger(getClass());
	 
	 @Autowired
	 
	 ILeaveTypeMasterService ileavetypemasterservice;
	 
	 @PostMapping(value="/user/typemasterrequest", produces = "application/json; charset=UTF-8")
	 public Response leavemaster (@RequestBody LeaveTypeMasterRequest request)throws BaseException {
		return response(ileavetypemasterservice.typemasterrequest(request));
	 
	 }

	 @PostMapping(value="/user/listleave", produces = "application/json; charset=UTF-8")
	 public Response leavelist(@RequestBody LeaveTypeMasterRequest request) throws BaseException {
		 return response(ileavetypemasterservice.typemasterlist(request));
	 }
	@Override
	protected String getServiceCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
