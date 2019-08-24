package org.orgw.simples.repository.jpa;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.orgw.simples.repository.ILeaveListRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;



@Repository
public class LeaveListRepository extends AbstractBaseRepository<EmailDetails> implements ILeaveListRepository {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<EmailDetails> getemployeelist(String empid) {
		
		try{
	        return this.getEntityManager().createQuery("select sc from EmailDetails sc where sc.empid=:id", EmailDetails.class)
	        		.setParameter("id", empid)
	        		.getResultList();
			}catch(NoResultException  e){
				LOG.debug("LeaveListRepository :: by getleavelist :: NoResultException");
			}
		
		return new ArrayList<EmailDetails>();
		 
	}
	
	@Override
	public List<EmailDetails> getemaildetails() {
		try{
			return this.getEntityManager().createQuery("select sc from EmailDetails sc join sc.userfirstname ur where sc.status=:status" + 
					"", EmailDetails.class)
					.setParameter("status", "1")
	        		.getResultList();
			}catch(NoResultException  e){
				LOG.debug("LeaveListRepository :: by getemaildetails :: NoResultException");
			}
		return new ArrayList<EmailDetails>();
	}

	@Override 
	public List<EmailDetails> getleavelist(String empid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

