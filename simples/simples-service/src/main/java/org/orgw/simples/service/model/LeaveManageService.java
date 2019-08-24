package org.orgw.simples.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.LeaveManageResponse;
import org.orgw.simples.repository.ILeaveManageRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.LeaveManage;
import org.orgw.simples.service.ILeaveManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LeaveManageService implements ILeaveManageService{
    
    @Autowired
    ILeaveManageRepository leaveManageRepository;
    
    
    @Autowired
	IUserRepository userRepository;
    
    @Override
    public LeaveManageResponse addLeaveManage(LeaveManageRequest request) {
        
        LeaveManage leavemanage = new LeaveManage();
        
        leavemanage.setEmpid(request.getEmpid());
        
        leavemanage.setDesignation(request.getDesignation());
        leavemanage.setSl(request.getSl());
        leavemanage.setCl(request.getCl());
        leavemanage.setEl(request.getEl());

      
        leaveManageRepository.save(leavemanage);
        leaveManageRepository.refresh(leavemanage);
        
        return getleavemanagedetails(request);
        
    }
    
	/*
	 * @Override public LeaveManageResponse leavemanagerequest(LeaveManageRequest
	 * request) { // TODO Auto-generated method stub return null; }
	 */
    public LeaveManageResponse getleavemanagedetails(LeaveManageRequest request) {
        

        LeaveManage managedetails = leaveManageRepository.getmanagedetails(request.getEmpid());
        
        LeaveManageResponse manage = new LeaveManageResponse();
        
        manage.setEmpid(managedetails.getEmpid());
    
        manage.setDesignation(managedetails.getDesignation());
        manage.setSl(managedetails.getSl());
        manage.setCl(managedetails.getCl());
        manage.setEl(managedetails.getEl());
       
        
        return manage;
    
    }

    
    @Override
    public List<LeaveManageResponse> managelist(LeaveManageRequest request) throws BaseException {
 	   
 	   List<LeaveManageResponse> managelist=new ArrayList<LeaveManageResponse>();
 	   
 	   
 	   List<LeaveManage> leavemanage = leaveManageRepository.getleavemanagelist();
 	   
 	   
 	   for(LeaveManage entity:leavemanage) {
 		   
 		   LeaveManageResponse entitys=new LeaveManageResponse();
 		   entitys.setEmpid(entity.getEmpid());
 		   entity.setFirstname(entity.getLeavefirstname().getFirstname());
 		   entity.setLastname(entity.getLeavefirstname().getLastname());
 		   entity.setDateofjoining(entity.getLeavefirstname().getDateofjoining());
 		   entity.setDesignation(entity.getDesignation());
 		   entitys.setSl(entity.getSl());
 		   entitys.setCl(entity.getCl());
 		   entitys.setEl(entity.getEl());
 		   entitys.setStatus(entity.getStatus());  
 		   entitys.setMdl(entity.getMdl());
 		   entitys.setMtl(entity.getMdl());
// 		   entitys.setSlavailable(entity.getSlavailable());
// 		   entitys.setClavailable(entity.getClavailable());
// 		   entitys.setElavailable(entity.getElavailable());
// 		   entitys.setMdlavailable(entity.getMdlavailable());
// 		   entitys.setMtlavailable(entity.getMtlavailable());
// 		   entitys.setTotalleave(entity.getTotalleave());
 		   managelist.add(entitys);
 		   
 		   
		
 	   }
		return managelist;
 

 
    }
    

}