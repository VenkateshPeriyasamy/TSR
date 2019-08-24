package org.orgw.simples.service;

import java.util.List;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.LeaveTypeMasterRequest;
import org.orgw.simples.data.LeaveTypeMasterResponse;

public interface ILeaveTypeMasterService {

	LeaveTypeMasterResponse typemasterrequest(LeaveTypeMasterRequest request);

	List<LeaveTypeMasterResponse> typemasterlist(LeaveTypeMasterRequest request) throws BaseException;

}
