package org.orgw.simples.service.model;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.repository.ILeaveListRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.service.ILeaveListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class LeaveListService implements ILeaveListService {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ILeaveListRepository leavelistrepository;
	
	

	@Override
	public List<LeaveResponse> leavelist(LeaveRequest request) throws BaseException {
		// TODO Auto-generated method stub
		
		
		List<LeaveResponse>  leavelist =  new ArrayList<LeaveResponse>();
		
		List<EmailDetails> emailDetails = leavelistrepository.getemaildetails();
		
		
		for(EmailDetails entity : emailDetails){
		
		LeaveResponse entitys=new LeaveResponse();
		entitys.setId(entity.getId());
        entitys.setEmpid(entity.getEmpid());
        entitys.setMailid(entity.getMailid());
        entitys.setFromdate(entity.getFromdate());
        entitys.setTodate(entity.getTodate());
        entitys.setTotaldays(entity.getTotaldays());
        entitys.setAllottedfromdate(entity.getAllottedfromdate());
        entitys.setAllottedtodate(entity.getAllotteddays());
        entitys.setAllotteddays(entity.getAllotteddays());
        entitys.setCc(entity.getCc());
        entitys.setApplieddate(entity.getApplieddate());
        entitys.setContent(entity.getUserfirstname().getSickleave());
        entitys.setSubject(entity.getUserfirstname().getCasualleave());
        entitys.setEarnedleave(entity.getUserfirstname().getEarnedleave());
        entitys.setMedicalleave(entity.getUserfirstname().getMedicalleave());
        entitys.setMaternityleave(entity.getUserfirstname().getMaternityleave());
        entitys.setLeavetype(entity.getLeavetype());
        entitys.setLeavestatus(entity.getLeavestatus());
        entitys.setFirstname(entity.getUserfirstname().getFirstname());
        entitys.setLastname(entity.getUserfirstname().getLastname());
        entitys.setSltaken(entity.getUserfirstname().getSltaken());
        entitys.setCltaken(entity.getUserfirstname().getCltaken());
        entitys.setEltaken(entity.getUserfirstname().getEltaken());
        entitys.setMdltaken(entity.getUserfirstname().getMdltaken());
        entitys.setMtltaken(entity.getUserfirstname().getMtltaken());
		leavelist.add(entitys);
		}
		
		return leavelist;
	}


	@Override
    public List<LeaveResponse> employeelist(LeaveRequest request) throws BaseException {
        // TODO Auto-generated method stub
        List<LeaveResponse>  leavelist =  new ArrayList<LeaveResponse>();
        
        List<EmailDetails> emailDetails = leavelistrepository.getemployeelist(request.getEmpid());
        
        
        for(EmailDetails entity : emailDetails){
        
        LeaveResponse entitys=new LeaveResponse();
        entitys.setId(entity.getId());
       entitys.setEmpid(entity.getEmpid());
       entitys.setMailid(entity.getMailid());
       entitys.setTomailid(entity.getTomailid());
       entitys.setFromdate(entity.getFromdate());
       entitys.setTodate(entity.getTodate());
       entitys.setTotaldays(entity.getTotaldays());
       entitys.setAllottedfromdate(entity.getAllottedfromdate());
       entitys.setAllottedtodate(entity.getAllotteddays());
       entitys.setAllotteddays(entity.getAllotteddays());
       entitys.setCc(entity.getCc());
       entitys.setApplieddate(entity.getApplieddate());
       entitys.setContent(entity.getContent());
       entitys.setSubject(entity.getSubject());
       entitys.setLeavetype(entity.getLeavetype());
       entitys.setLeavestatus(entity.getLeavestatus());
       entitys.setSltaken(entity.getSltaken());
      // entitys.setFirstname(entity.getUserfirstname().getFirstname());
      // entitys.setLastname(entity.getUserfirstname().getLastname());
        leavelist.add(entitys);
        }
        
        return leavelist;
    }

	
	
	
	

}
