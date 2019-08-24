package org.orgw.simples.repository;

import java.util.List;

import org.orgw.simples.repository.model.Attendance;

public interface IAttendanceRepository extends DataRepository<Attendance>{

	 Attendance getattendancedetails(String checkin); 

	Attendance getEmployeeDetailByDate(String empid, String date);
	List<Attendance> getweeklist(String olddate,String empid);

//	Attendance getattendancedetails(String attendid, String empid);

	List<Attendance> getattendance();
}
