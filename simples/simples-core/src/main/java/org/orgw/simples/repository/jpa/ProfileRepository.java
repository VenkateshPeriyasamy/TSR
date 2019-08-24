package org.orgw.simples.repository.jpa;

import javax.persistence.NoResultException;

import org.orgw.simples.repository.IProfileRepository;

import org.orgw.simples.repository.model.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
@Repository
public class ProfileRepository extends AbstractBaseRepository<Profile> implements IProfileRepository {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Override
	public Profile getprodetails(String empid)
	{
		 try{
		        return this.getEntityManager().createQuery("select sc from Profile sc where sc.empid=:empid ", Profile.class)
		        		.setParameter("empid", empid)
		        		//.setParameter("status", "1")
		        		.getSingleResult();
				}catch(NoResultException  e){
					LOG.debug("ProfileRepository :: by getprodetails :: NoResultException");
				}
				return null;
	}

}
