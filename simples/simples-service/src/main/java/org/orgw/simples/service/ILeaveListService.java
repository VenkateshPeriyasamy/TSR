package org.orgw.simples.service;


import java.util.List;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.LeaveResponse;

public interface ILeaveListService {

	


	List<LeaveResponse> leavelist(LeaveRequest request) throws BaseException;

	List<LeaveResponse> employeelist(LeaveRequest request) throws BaseException;

}
