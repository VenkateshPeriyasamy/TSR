package org.orgw.simples.service;

import java.util.List;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.LeaveManageResponse;

public interface ILeaveManageService {
	
	  LeaveManageResponse addLeaveManage(LeaveManageRequest request)throws BaseException;

	   // LeaveManageResponse leavemanagerequest(LeaveManageRequest request);

		LeaveManageResponse getleavemanagedetails(LeaveManageRequest request) throws BaseException;

//	    LeaveManageResponse leavemanagerequest(LeaveManageRequest request)throws BaseException;
	//
//	    LeaveManageResponse leavemanageresponse(LeaveManageRequest request)throws BaseException;
        List<LeaveManageResponse> managelist(LeaveManageRequest request) throws BaseException;

	}


