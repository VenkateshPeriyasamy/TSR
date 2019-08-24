package org.orgw.simples.service.model;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.SimplesConstant;
import org.orgw.simples.core.exception.ValidationException;
import org.orgw.simples.data.AdminRequest;
import org.orgw.simples.data.AdminResponse;
import org.orgw.simples.repository.IAdminRepository;
import org.orgw.simples.repository.model.Admin;
import org.orgw.simples.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
 
public class AdminService implements  IAdminService{
	
	@Autowired 
	IAdminRepository adminrepository;

	@Override
	public AdminResponse loginadmin(AdminRequest request) throws ValidationException {
		
		Admin admin=adminrepository.getadminlogin(request.getEmpid(),request.getPassword());
			
		if((admin.getEmpid().equals(request.getEmpid())) && (admin.getPassword().equals(request.getPassword()))) {
			
			AdminResponse response=new AdminResponse();
			response.setEmpid(request.getEmpid());
			response.setPassword(request.getPassword());
			return response;
			
		}
		return null;
		
		
	}

	
}
