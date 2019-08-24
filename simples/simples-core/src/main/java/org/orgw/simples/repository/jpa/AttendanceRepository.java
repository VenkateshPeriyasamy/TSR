package org.orgw.simples.repository.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.orgw.simples.core.util.UtilHelper;
import org.orgw.simples.repository.IAttendanceRepository;
import org.orgw.simples.repository.model.Attendance;
import org.orgw.simples.repository.model.EmailDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AttendanceRepository extends AbstractBaseRepository<Attendance> implements IAttendanceRepository {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Override
	public Attendance getattendancedetails(String id) {
		 try{
		        return this.getEntityManager().createQuery("select sc from Attendance sc where sc.id=:id ", Attendance.class)
		        		.setParameter("id", id)
		        		//.setParameter("status", "1")
		        		.getSingleResult();
				}catch(NoResultException  e){
					LOG.debug("AttendanceRepository :: by getattendanceetails :: NoResultException");
				}
				return null;
	}
	@Override
	public Attendance getEmployeeDetailByDate(String empid, String date) {
		try{
	        return this.getEntityManager().createQuery("select sc from Attendance sc where sc.empid=:empid and sc.date=:date ", Attendance.class)
	        		.setParameter("empid", empid)
	        		.setParameter("date", date)
	        		.getSingleResult();
			}catch(NoResultException  e){
				LOG.debug("AttendanceRepository :: by getEmployeeDetailByDate :: NoResultException");
			}
		return null;
	}

	
	@Override
	public List<Attendance> getweeklist(String date,String empid) {
	
		String modifieddate = UtilHelper.getmodifileddate(date);
		
		try{
	        return this.getEntityManager().createQuery("select sc from Attendance sc where sc.empid=:empid and sc.date>=:olddate and sc.date<=:currentdate", Attendance.class)
	        		.setParameter("empid", empid)
	        		.setParameter("olddate", modifieddate)
	        		.setParameter("currentdate", date)
	        		.getResultList();
			}catch(NoResultException  e){
				LOG.debug("AttendanceRepository :: by getweeklist :: NoResultException");        
			}
		
		return new ArrayList<Attendance>();
		 
	}
	@Override
	public List<Attendance> getattendance() {
		
		//List<Attendance> attendancelist = new ArrayList<Attendance>();
		
		try{
			
			return this.getEntityManager().createQuery("select sc from Attendance sc join sc.attendancefirstname ur where  sc.status=:status ", Attendance.class)
					.setParameter("status", "1")
	        		.getResultList();
			}catch(NoResultException  e){
				LOG.debug("AttendanceRepository :: by getattendance :: NoResultException");
			}
		// TODO Auto-generated method stub
		return new ArrayList<Attendance>();
		
		
		
		
	}
}
