package org.orgw.simples.repository.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;


import org.orgw.simples.repository.ILeaveTypeMasterRepository;
import org.orgw.simples.repository.model.LeaveTypeMaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LeaveTypeMasterRepository  extends AbstractBaseRepository<LeaveTypeMaster> implements ILeaveTypeMasterRepository {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public LeaveTypeMaster getmasterrequest(String leave_type_id ) {
		
		try{
	        return this.getEntityManager().createQuery("select sc from LeaveTypeMaster sc where sc.leave_type_id=:leave_type_id", LeaveTypeMaster.class)
	        		.setParameter("leave_type_id", leave_type_id)
	        		//.setParameter("status", "1")
	        		.getSingleResult();
			}catch(NoResultException  e){
				LOG.debug("LeaveTypeMasterRepository :: by getmasterrequest :: NoResultException");
			}
	
		return null;
	}

	@Override
	public LeaveTypeMaster getmasterrequest(int sl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LeaveTypeMaster> getmaster() {
		try{
			return this.getEntityManager().createQuery("select sc from LeaveTypeMaster sc where  sc.status=:status ", LeaveTypeMaster.class)
					.setParameter("status", 1)
	        		.getResultList();
			}catch(NoResultException  e){
				LOG.debug("LeaveTypeMasterRepository :: by getmaster :: NoResultException");
			}
		return new ArrayList<LeaveTypeMaster>();
	}

	@Override
	public LeaveTypeMaster editleavemaster(String leave_type_id) {
		// TODO Auto-generated method stub
		try{
			return this.getEntityManager().createQuery("select sc from LeaveTypeMaster sc where  sc.leave_type_id=:leave_type_id ", LeaveTypeMaster.class)
					.setParameter("leave_type_id", leave_type_id)
	        		.getSingleResult();
			}catch(NoResultException  e){
				LOG.debug("LeaveTypeMasterRepository :: by editleavemaster :: NoResultException");
			}
		return null;
		
	}

//	@Override
//	public LeaveTypeMaster getmasterrequest(String leaveid) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
