package org.orgw.simples.repository.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractBaseRepository<Users> implements IUserRepository  {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @Override
    public Users getuserdetails(String empid) {

         try{
            return this.getEntityManager().createQuery("select sc from Users sc where sc.empid=:empid", Users.class)
                    .setParameter("empid", empid)
//                    .setParameter("status", "1")
                    .getSingleResult();
            }catch(NoResultException  e){
                LOG.debug("UserRepository :: by getuserdetails :: NoResultException");
            }
            return null;
        
    }

    @Override
    public List<Users> getemployeedetails( ) {
        try{
            return this.getEntityManager().createQuery("select sc from Users sc where sc.status=:status  ", Users.class)
                    .setParameter("status", "1")
                    .getResultList();
            }catch(NoResultException  e){
                LOG.debug("UserRepository :: by getemployeedetails :: NoResultException");
            }
        return new ArrayList<Users>();
    }
    
    @Override
    public Users getcreatedetails(String empid) {
        
        try{
            return this.getEntityManager().createQuery("select sc from Users sc where sc.empid=:empid  " , Users.class)
                    .setParameter("empid", empid)
                    
                    .getSingleResult();
            }catch(NoResultException  e){
                LOG.debug("UserRepository :: by getcreatedetails :: NoResultException");
            }
            return null;
        
        
    }

    @Override
    public List<Users> getemployeedetails(String firstname) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Users editdetails(String empid) {
        
        try{
            return this.getEntityManager().createQuery("select sc from Users sc where sc.empid=:empid" , Users.class)
                    .setParameter("empid", empid)
                    
                    .getSingleResult();
            }catch(NoResultException  e){
                LOG.debug("UserRepository :: by editdetails :: NoResultException");
            }
        
        return null;
    }

    @Override
    public Users getupdatedetails(String empid) {
         try{
                return this.getEntityManager().createQuery("select sc from Users sc where sc.empid=:empid and sc.status=:status", Users.class)
                        .setParameter("empid", empid)
                        .setParameter("status", "1")
                        .getSingleResult();
                }catch(NoResultException  e){
                    LOG.debug("UserRepository :: by getuserdetails :: NoResultException");
                }
                return null;
    }
    
    @Override
       public Users getprodetails(String empid) {
            try{
                   return this.getEntityManager().createQuery("select sc from Users sc where sc.empid=:empid ", Users.class)
                           .setParameter("empid", empid)
                           //.setParameter("status", "1")
                           .getSingleResult();
                   }catch(NoResultException  e){
                       LOG.debug("UserRepository :: by getprodetails :: NoResultException");
                   }
                   return null;
       }

	@Override
	public List<Users> getemployeeleavedetails() {
		try{
            return this.getEntityManager().createQuery("select sc from Users sc where sc.status=:status  ", Users.class)
                    .setParameter("status", "1")
                    .getResultList();
            }catch(NoResultException  e){
                LOG.debug("UserRepository :: by getemployeedetails :: NoResultException");
            }
        return new ArrayList<Users>(); 
	}

	@Override
	public List<Users> getemployeeleavedetails(String empid) {
		// TODO Auto-generated method stub
		return null;
	}



    
}