package org.orgw.simples.controller.test;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.data.Response;
import org.orgw.simples.repository.ILeaveListRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.service.ILeaveListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class LeaveListController extends BaseController {
	
	
	private final Logger log = Logger.getLogger(getClass());
	
	@Autowired
	ILeaveListService leavelistservice;
	
	
	@Autowired
	ILeaveListRepository leavelistrepository;
	
	

    
	 @PostMapping(value="/user/leavelist", produces = "application/json; charset=UTF-8")
	 public Response leaveRequest(@RequestBody LeaveRequest request) throws BaseException {
		 return response(leavelistservice.leavelist(request));
		
		//return null;
	 }
	
	 

	 @PostMapping(value="/user/employeeleavelist", produces = "application/json; charset=UTF-8")
	 public Response employeeLeaveList(@RequestBody LeaveRequest request) throws BaseException {
		 return response(leavelistservice.employeelist(request));
		
		//return null;
	 }
	 
	 @PostMapping(value="/user/leavelistajax", produces = "application/json; charset=UTF-8")
	 public  List<LeaveResponse> leaveRequestajax(@RequestBody LeaveRequest request) throws BaseException {
		// return response(leavelistserive.leavelist(request));
		
		 List<LeaveResponse>  leavelist =  new ArrayList<LeaveResponse>();
			
			List<EmailDetails> emailDetails = leavelistrepository.getleavelist(request.getEmpid());
			
			
			for(EmailDetails entity : emailDetails){
			
			LeaveResponse entitys=new LeaveResponse();
			entitys.setEmpid(entity.getEmpid());
			entitys.setMailid(entity.getMailid());
			entitys.setFromdate(entity.getFromdate());
			entitys.setTodate(entity.getTodate());
			entitys.setCc(entity.getCc());
			
			entitys.setLeavetype(entity.getLeavetype());
			leavelist.add(entitys);
			}
			
			return leavelist;
		 
		 
		
	 }
	 
	 

	@Override
	protected String getServiceCode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

