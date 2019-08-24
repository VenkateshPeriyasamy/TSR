package org.orgw.simples.service.model;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.ProfileRequest;
import org.orgw.simples.data.ProfileResponse;

import org.orgw.simples.repository.IProfileRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.Profile;
import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.IProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfileService implements IProfileService {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	IUserRepository userRepository;
    
//    @Override
//    public ProfileResponse addProfile(ProfileRequest request) throws BaseException{
//        
//        Profile newprofile= new Profile();
//        
//        newprofile.setEmpid(request.getEmpid());
//        newprofile.setDesignation(request.getDesignation());
//        newprofile.setFirstname(request.getFirstname());
//        newprofile.setLastname(request.getLastname());
//        newprofile.setAddress(request.getAddress());
//        newprofile.setDate_of_joining(request.getDate_of_joining());
//        newprofile.setDob(request.getDob());
//        newprofile.setCompany_mail(request.getCompany_mail());
//        newprofile.setMobile(request.getMobile());
//        newprofile.setPersonal_mail(request.getPersonal_mail());
//        newprofile.setStatus(request.getStatus());
//        userRepository.save(newprofile);
//        userRepository.refresh(newprofile);
//        
//        return getmemberdetails(request);
//        
//    }
    private ProfileResponse getmemberdetails(ProfileRequest request) throws BaseException {
                     
          return null;
    }
    @Override
    public ProfileResponse profileRequest(ProfileRequest request) throws BaseException {
         Users details = userRepository.getprodetails(request.getEmpid());
          
           ProfileResponse profiledetails = new ProfileResponse();
          
           profiledetails.setEmpid(details.getEmpid());
           profiledetails.setDesignation(details.getDesignation());
           profiledetails.setFirstname(details.getFirstname());
           profiledetails.setLastname(details.getLastname());
           profiledetails.setAddress(details.getAddress());
           profiledetails.setDob(details.getDob());
           profiledetails.setDate_of_joining(details.getDateofjoining());   
           profiledetails.setCompany_mail(details.getCompanymail());
           profiledetails.setMobile(details.getMobile());
           profiledetails.setPersonal_mail(details.getPersonalmail());
           profiledetails.setStatus(details.getStatus());
           profiledetails.setCasualleave(details.getCasualleave());
           profiledetails.setEarnedleave(details.getEarnedleave());
           profiledetails.setSickleave(details.getSickleave());
           profiledetails.setMedicalleave(details.getMedicalleave());
           profiledetails.setMaternityleave(details.getMaternityleave());
           profiledetails.setCltaken(details.getCltaken());
           profiledetails.setEltaken(details.getEltaken());
           profiledetails.setSltaken(details.getSltaken());
           profiledetails.setMdltaken(details.getMdltaken());
           profiledetails.setMtltaken(details.getMtltaken());
          
        return profiledetails;
    }
	@Override
	public ProfileResponse addProfile(ProfileRequest request) throws BaseException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
