package org.orgw.simples.repository;

import java.util.List;

import org.orgw.simples.repository.model.LeaveManage;
import org.orgw.simples.repository.model.LeaveTypeMaster;

public interface ILeaveTypeMasterRepository  extends DataRepository<LeaveTypeMaster>{

	

//	LeaveTypeMaster getmasterrequest(String leaveid);

	LeaveTypeMaster getmasterrequest(int sl);

	LeaveTypeMaster getmasterrequest(String leave_type_id);

	List<LeaveTypeMaster> getmaster();

	LeaveTypeMaster editleavemaster(String leave_type_id);

	

	

}
