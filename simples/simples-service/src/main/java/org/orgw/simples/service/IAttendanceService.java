package org.orgw.simples.service;

import java.util.List;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.AttendanceRequest;
import org.orgw.simples.data.AttendanceResponse;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;

public interface IAttendanceService {

	AttendanceResponse addAttendance(AttendanceRequest attendanceRequest) throws BaseException;
	AttendanceResponse checkin(AttendanceRequest paramAttendanceRequest) throws BaseException;
	AttendanceResponse checkout(AttendanceRequest paramAttendanceRequest) throws BaseException;
	AttendanceResponse getattendance(AttendanceRequest paramAttendanceRequest) throws BaseException;
	List<AttendanceResponse> weeklist(AttendanceRequest request) throws BaseException;
	List<AttendanceResponse> attendancedetails(AttendanceRequest attendance) throws BaseException;
	List<AttendanceResponse> attendancelist(AttendanceRequest attendance) throws BaseException;
 
}
