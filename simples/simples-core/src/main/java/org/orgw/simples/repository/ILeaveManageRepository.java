package org.orgw.simples.repository;

import java.util.List;

import org.orgw.simples.repository.model.LeaveManage;

public interface ILeaveManageRepository  extends DataRepository<LeaveManage>{

    LeaveManage getmanagedetails(String empid);
    List<LeaveManage> getleavemanagelist(String empid);

    List<LeaveManage> getleavemanagelist();

	
	LeaveManage getmanagedetail();
	LeaveManage getmanagedetail(String leaveid);
    
}


