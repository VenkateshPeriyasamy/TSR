package org.orgw.simples.service.model;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.repository.ILeaveListSaveRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.ILeaveListSaveController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LeaveListSaveService implements ILeaveListSaveController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ILeaveListSaveRepository leavelistsaverepository;
	
	

	@Override
	public LeaveResponse leaverequest(LeaveRequest request) throws BaseException {
		
		EmailDetails entity = new EmailDetails();
		
		entity.setEmpid(request.getEmpid());
		entity.setFromdate(request.getFromdate());
		entity.setTodate(request.getTodate());
		entity.setMailid(request.getMailid());
		entity.setLeavetype(request.getLeavetype());
		entity.setCc(request.getCc());
		entity.setApplieddate(request.getApplieddate());
		entity.setAllottedfromdate(request.getAllottedfromdate());
		entity.setAllottedtodate(request.getAllottedtodate());
		entity.setAllotteddays(request.getAllotteddays());
		entity.setTotaldays(request.getTotaldays());
		entity.setTomailid(request.getTomailid());
		entity.setContent(request.getContent());
		entity.setSubject(request.getSubject());
		entity.setStatus("1");
		
		
		
		
		leavelistsaverepository.save(entity);
		leavelistsaverepository.refresh(entity);
        
		String empid=entity.getId();
		return leavelistdetails(request,empid);
	
	}


	private LeaveResponse leavelistdetails(LeaveRequest request, String empid) {
		
    EmailDetails leavedetails=leavelistsaverepository.getleavelistdetails(empid);
		
		
		//Users userdetails = userRepository.getuserdetails(request.getEmployeid());
		
		LeaveResponse response=new LeaveResponse();	
		
		response.setEmpid(leavedetails.getEmpid());
		response.setMailid(leavedetails.getMailid());
		response.setFromdate(leavedetails.getFromdate());
		response.setTodate(leavedetails.getTodate());
		response.setLeavetype(leavedetails.getLeavetype());
		response.setCc(leavedetails.getCc());
		response.setApplieddate(leavedetails.getApplieddate());
		response.setAllottedfromdate(leavedetails.getAllottedfromdate());
		response.setAllottedtodate(leavedetails.getAllottedtodate());
		response.setAllotteddays(leavedetails.getAllotteddays());
		response.setTotaldays(leavedetails.getTotaldays());
		response.setTomailid(leavedetails.getTomailid());
		response.setContent(leavedetails.getContent());
		response.setSubject(leavedetails.getSubject());
		
		
		// TODO Auto-generated method stub
		return response;
	}
	
	
	

}
