 package org.orgw.simples.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.MasterSettingRequest;
import org.orgw.simples.data.MasterSettingResponse;
import org.orgw.simples.repository.IUserRepository;

import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.IMasterSettingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MasterSettingService  implements IMasterSettingService{
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	IUserRepository userRepository;
	

	@Override
	public List<MasterSettingResponse> mastersettinglist(MasterSettingRequest request) {
		    	  
	    	  List<MasterSettingResponse>  employeelist =  new ArrayList<MasterSettingResponse>();
	    	  
	    	  List<Users> mastersetting= userRepository.getemployeedetails();
	    	  
	    	for(Users entity:  mastersetting) {
	    		MasterSettingResponse entitys=new MasterSettingResponse();
	    		
	    		entitys.setEmpid(entity.getEmpid());
	    		entitys.setStatus(entity.getStatus());
	    		entitys.setFirstname(entity.getFirstname());
	    		entitys.setLastname(entity.getLastname());
	    		entitys.setDateofjoining(entity.getDateofjoining());
	    		entitys.setDesignation(entity.getDesignation());
	    		entitys.setMobile(entity.getMobile());
	    		entitys.setPersonalmail(entity.getPersonalmail());
	    		entitys.setCompanymail(entity.getCompanymail());
	    		entitys.setDob(entity.getDob());
	    		entitys.setAddress(entity.getAddress());
	    		entitys.setSickleave(entity.getSickleave());
	    		entitys.setCasualleave(entity.getCasualleave());
	    		entitys.setEarnedleave(entity.getEarnedleave());
	    		entitys.setMedicalleave(entity.getMedicalleave());
	    		entitys.setMaternityleave(entity.getMaternityleave());
	    		
	    		
	 
	    		
	    	
	    		
	    		employeelist.add(entitys);
	    		
	    	}
	    	return employeelist;
			
	    	  
	      }
		// TODO Auto-generated method stub


	@Override
	public MasterSettingResponse mastercreaterecord(MasterSettingRequest request) {
		
		
		Users entity=new Users();
		entity.setEmpid(request.getEmpid());
		//entity.setPassword(request.getPassword());
		entity.setFirstname(request.getFirstname());
		entity.setLastname(request.getLastname());
		//entity.setDateTime(request.getDateTime());
		//entity.setIp(request.getIp());
		entity.setDesignation(request.getDesignation());
		entity.setDateofjoining(request.getDateofjoining());
		entity.setMobile(request.getMobile());
		entity.setPersonalmail(request.getPersonalmail());
		entity.setCompanymail(request.getCompanymail());
		entity.setDob(request.getDob());
		entity.setAddress(request.getAddress());
		entity.setStatus(request.getStatus());

		userRepository.save(entity);
		userRepository.refresh(entity);
		
		
		return createdetails(request);
	}
	
	
	
	
		private MasterSettingResponse createdetails(MasterSettingRequest request) {
			
			Users create=userRepository.getcreatedetails((request.getEmpid()));
			
			
			MasterSettingResponse response=new MasterSettingResponse();
			response.setEmpid(create.getEmpid());
//			response.setId(create.getId());
			//response.setPassword(create.getPassword());
			//response.setDateTime(create.getDateTime());
			//response.setIp(create.getIp());
			response.setFirstname(create.getFirstname());
			response.setLastname(create.getLastname());
			response.setDesignation(create.getDesignation());
			response.setDateofjoining(create.getDateofjoining());
			response.setMobile(create.getMobile());
			response.setPersonalmail(create.getPersonalmail());
			response.setCompanymail(create.getCompanymail());
			response.setDob(create.getDob());
			response.setAddress(create.getAddress());
			response.setStatus(create.getStatus());
			
			return response;
		}


		@Override
		public MasterSettingResponse geteditlist(MasterSettingRequest editrequest) {
			
			
            Users entity=userRepository.editdetails(editrequest.getEmpid());
			
			entity.setEmpid(editrequest.getEmpid());
			entity.setFirstname(editrequest.getFirstname());
			entity.setLastname(editrequest.getLastname());
			entity.setDesignation(editrequest.getDesignation());
			entity.setDateofjoining(editrequest.getDateofjoining());
			entity.setMobile(editrequest.getMobile());
			entity.setPersonalmail(editrequest.getPersonalmail());
			entity.setCompanymail(editrequest.getCompanymail());
			entity.setDob(editrequest.getDob());
			entity.setAddress(editrequest.getAddress());
		

			userRepository.update(entity);

			return null;
		}
		
	

}
