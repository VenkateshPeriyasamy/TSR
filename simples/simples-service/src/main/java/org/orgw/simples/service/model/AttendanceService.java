package org.orgw.simples.service.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.AttendanceRequest;
import org.orgw.simples.data.AttendanceResponse;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.repository.IAttendanceRepository;
import org.orgw.simples.repository.ITestRepository;
import org.orgw.simples.repository.IUserRepository;
import org.orgw.simples.repository.model.Attendance;
import org.orgw.simples.repository.model.EmailDetails;
import org.orgw.simples.repository.model.Users;
import org.orgw.simples.service.IAttendanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AttendanceService implements IAttendanceService
{
private final Logger LOG = LoggerFactory.getLogger(getClass());
@Autowired
IAttendanceRepository attendanceRepository;
@Autowired
IUserRepository userRepository;
@Autowired
ITestRepository testRepository;
@Override
public AttendanceResponse addAttendance(AttendanceRequest attendanceRequest) {
  this.LOG.debug("Attendance" + attendanceRequest.getEmpid());
  
  this.LOG.debug("Attendance" + attendanceRequest.getDate());
  Attendance employee = this.attendanceRepository.getEmployeeDetailByDate(attendanceRequest.getEmpid(), attendanceRequest.getDate());
  String id;
  if (employee == null)
  {
    Attendance attendance = new Attendance();
    attendance.setEmpid(attendanceRequest.getEmpid());
    attendance.setCheckin(attendanceRequest.getCheckin());
    attendance.setCheckout(attendanceRequest.getCheckout());
    attendance.setTotaltime(attendanceRequest.getTotaltime());
    attendance.setDate(attendanceRequest.getDate());
    attendance.setStatus("1");
    
    Users user=new Users();
    user=userRepository.getuserdetails(attendanceRequest.getEmpid());
    
    attendance.setAttendancefirstname(user);
    
    
    this.attendanceRepository.save(attendance);
    this.attendanceRepository.refresh(attendance);
    
    id = attendance.getEmpid();
  }
  else
  {
    employee.setDate(attendanceRequest.getDate());
    this.attendanceRepository.update(employee);
    id = employee.getEmpid();
  }
  return attendancedetails(attendanceRequest, id);
}

private AttendanceResponse attendancedetails(AttendanceRequest attendanceRequest, String id) {
  Attendance attendancedetails = this.attendanceRepository.getEmployeeDetailByDate(attendanceRequest.getEmpid(), attendanceRequest.getDate());
  
  AttendanceResponse attendance = new AttendanceResponse();
  
  attendance.setId(attendancedetails.getId());
  attendance.setEmpid(attendancedetails.getEmpid());
  attendance.setCheckin(attendancedetails.getCheckin());
  attendance.setCheckout(attendancedetails.getCheckout());
  attendance.setTotaltime(attendancedetails.getTotaltime());
  attendance.setDate(attendancedetails.getDate());
  
  return attendance;
}
@Override
public AttendanceResponse checkin(AttendanceRequest attendanceRequest)throws BaseException {
  Attendance employee = this.attendanceRepository.getEmployeeDetailByDate(attendanceRequest.getEmpid(), attendanceRequest.getDate());
  if (employee.getCheckin() == null)
  {
    employee.setCheckin(attendanceRequest.getCheckin());
    
    this.attendanceRepository.update(employee);
  }
  return attendancedetails(attendanceRequest, employee.getId());
}
@Override
public AttendanceResponse checkout(AttendanceRequest attendanceRequest) throws BaseException {
  Attendance employecheckout = this.attendanceRepository.getEmployeeDetailByDate(attendanceRequest.getEmpid(), attendanceRequest.getDate());
  
  employecheckout.setCheckout(attendanceRequest.getCheckout());
  employecheckout.setTotaltime(attendanceRequest.getTotaltime());
   employecheckout.setExtratime(attendanceRequest.getExtratime());
   employecheckout.setLaggingtime(attendanceRequest.getLaggingtime());
  this.attendanceRepository.update(employecheckout);
  
  return attendancedetails(attendanceRequest, employecheckout.getId());
}
@Override
public AttendanceResponse getattendance(AttendanceRequest attendanceRequest) throws BaseException {
  Attendance attendancedetails = this.attendanceRepository.getattendancedetails(attendanceRequest.getAttendid());
  
  AttendanceResponse attendance = new AttendanceResponse();
  
  attendance.setId(attendancedetails.getId());
  attendance.setEmpid(attendancedetails.getEmpid());
  attendance.setCheckin(attendancedetails.getCheckin());
  attendance.setCheckout(attendancedetails.getCheckout());
  attendance.setTotaltime(attendancedetails.getTotaltime());
  attendance.setDate(attendancedetails.getDate());
  
  return attendance;
}
@Override
public List<AttendanceResponse> weeklist(AttendanceRequest attendanceRequest) throws BaseException {
	
	
	List<AttendanceResponse>  weeklist =  new ArrayList<AttendanceResponse>();
	List<Attendance> attendancedetails = attendanceRepository.getweeklist(attendanceRequest.getDate(),attendanceRequest.getEmpid());
	
	
	
	for(Attendance entity : attendancedetails){
		
		AttendanceResponse entitys=new AttendanceResponse();
		entitys.setEmpid(entity.getEmpid());
		entitys.setDate(entity.getDate());
		entitys.setCheckin(entity.getCheckin());
		entitys.setCheckout(entity.getCheckout());
		entitys.setTotaltime(entity.getTotaltime());
		weeklist.add(entitys);
		}
	
		return weeklist;
	}
@Override
public List<AttendanceResponse> attendancedetails(AttendanceRequest attendance) throws BaseException {

	List<AttendanceResponse> attendancelist = new ArrayList<AttendanceResponse>();

	List<Attendance> mastersetting = attendanceRepository.getattendance();

	for (Attendance entity : mastersetting) {

		AttendanceResponse entitys = new AttendanceResponse();
		
		Users datas = testRepository.getbyEmpname(entity.getEmpid());
		

		
		entitys.setCheckin(entity.getCheckin());
		entitys.setCheckout(entity.getCheckout());
		entitys.setDate(entity.getDate());
		entitys.setId(entity.getId());
		entitys.setEmpid(entity.getEmpid());
		entitys.setTotaltime(entity.getTotaltime());
		entitys.setExtratime(entity.getExtratime());
		entitys.setLaggingtime(entity.getLaggingtime());
		entitys.setStatus(entity.getStatus());
	    entitys.setFirstname(entity.getAttendancefirstname().getFirstname());
	    entitys.setLastname(entity.getAttendancefirstname().getLastname());
		attendancelist.add(entitys);
	}
	return attendancelist;
}

@Override
public List<AttendanceResponse> attendancelist(AttendanceRequest attendance) throws BaseException {
	//List<Attendance> attendancelist =   attendanceRepository.getattendancelist();

	return null;
}

}