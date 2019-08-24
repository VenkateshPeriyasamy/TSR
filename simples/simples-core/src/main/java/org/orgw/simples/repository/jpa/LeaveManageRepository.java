package org.orgw.simples.repository.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.orgw.simples.repository.ILeaveManageRepository;
import org.orgw.simples.repository.model.LeaveManage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LeaveManageRepository extends AbstractBaseRepository<LeaveManage> implements ILeaveManageRepository{
    
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @Override
    public LeaveManage getmanagedetails(String empid) {

        try {
            return this.getEntityManager().createQuery("select sc from LeaveManage sc where sc.empid=:empid and sc.status=:status", LeaveManage.class)
                    .setParameter("empid", empid)
                    .setParameter("status", "1")
               .getSingleResult();
        
        }catch(NoResultException e) {
            LOG.debug("LeaveManageRepository :: by getmanageusers :: NoResultException");
        }
        return null;
    }
    @Override
    public List<LeaveManage> getleavemanagelist() {
        // TODO Auto-generated method stub
        try {
            return this.getEntityManager().createQuery("select sc from LeaveManage sc join sc.leavefirstname where sc.status=:status" , LeaveManage.class)
                   
                    .setParameter("status", "1")
                             .getResultList();
       }catch(NoResultException e) {
           LOG.debug("LeaveManageRepository :: by getleavemanagelist :: NoResultException");
       }
        return new ArrayList<LeaveManage>();
    }
   
	@Override
	public LeaveManage getmanagedetail(String leaveid) {
		// TODO Auto-generated method stub
		
		try {

	           return this.getEntityManager().createQuery("select sc from LeaveManage sc where sc.leaveid=:leaveid", LeaveManage.class)
	                   .setParameter("leaveid", leaveid)
	                   //.setParameter("status", "1")
	              .getSingleResult();

	       }catch(NoResultException e) {
	           LOG.debug("LeaveManageRepository :: by getmanagedetails :: NoResultException");
	       }
		return null;
	}
	@Override
	public LeaveManage getmanagedetail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<LeaveManage> getleavemanagelist(String empid) {
		// TODO Auto-generated method stub
		return null;
	}
    

}


