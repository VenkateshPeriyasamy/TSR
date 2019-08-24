   package org.orgw.simples.repository.jpa;

  
import javax.persistence.NoResultException;

import org.orgw.simples.repository.IAdminRepository;
import org.orgw.simples.repository.model.Admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
@Repository
public class AdminRepository  extends AbstractBaseRepository<Admin>implements IAdminRepository{

	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Override        
	public Admin getadminlogin(String empid) {
		// TODO Auto-generated method stub
		try{
	        return this.getEntityManager().createQuery("select sc from Admin sc where sc.empid=:empid ", Admin.class)
	        		.setParameter("empid", empid)
	        		
	        		.getSingleResult();
			}catch(NoResultException  e){
				LOG.debug("AdminRepository :: by getadminlogin :: NoResultException");
			}
		return null;
	}
	@Override
	public Admin getadminlogin(String empid, String password) {
		// TODO Auto-generated method stub
		try{
	        return this.getEntityManager().createQuery("select sc from Admin sc where sc.empid=:empid and sc.password=:password", Admin.class)
	        		.setParameter("empid", empid)
	        		.setParameter("password", password)
	        		
	        		.getSingleResult();
			}catch(NoResultException  e){
				LOG.debug("AdminRepository :: by getadminlogin :: NoResultException");
			}
		return null;
	}

	

	
}
