package org.orgw.simples.repository.jpa;

import javax.persistence.NoResultException;

import org.orgw.simples.repository.ILeaveListSaveRepository;
import org.orgw.simples.repository.model.EmailDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LeaveListSaveRepository extends AbstractBaseRepository<EmailDetails> implements ILeaveListSaveRepository{

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Override
	public EmailDetails getleavelistdetails(String empid) {
		 try{
		        return this.getEntityManager().createQuery("select sc from EmailDetails sc where sc.empid=:empid", EmailDetails.class)
		        		.setParameter("empid", empid)
		        		.setParameter("status", "1")
		        		.getSingleResult();
				}catch(NoResultException  e){
					LOG.debug("LeaveRequestRepository :: by getleaverequestdetails :: NoResultException");
				}
				return null;
			
		}
	}
	
	


