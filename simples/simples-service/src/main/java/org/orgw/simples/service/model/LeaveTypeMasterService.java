package org.orgw.simples.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.LeaveTypeMasterRequest;
import org.orgw.simples.data.LeaveTypeMasterResponse;
import org.orgw.simples.repository.ILeaveTypeMasterRepository;
import org.orgw.simples.repository.model.LeaveManage;
import org.orgw.simples.repository.model.LeaveTypeMaster;
import org.orgw.simples.service.ILeaveTypeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class LeaveTypeMasterService implements ILeaveTypeMasterService {
	
	@Autowired
	ILeaveTypeMasterRepository ileavetypemasterrepository;

	@Override
	public LeaveTypeMasterResponse typemasterrequest(LeaveTypeMasterRequest request) {
		
		LeaveTypeMaster entity=ileavetypemasterrepository.editleavemaster(request.getLeave_type_id());
		
		entity.setLeave_type_id(request.getLeave_type_id());
		entity.setLeave_name(request.getLeave_name());
		entity.setNo_of_days(request.getNo_of_days());
		entity.setStatus(1);
		      
        ileavetypemasterrepository.update(entity);
        
        
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<LeaveTypeMasterResponse> typemasterlist(LeaveTypeMasterRequest request)  throws BaseException {
		
		
        List<LeaveTypeMasterResponse> masterlist=new ArrayList<LeaveTypeMasterResponse>();
		
		List<LeaveTypeMaster> master=ileavetypemasterrepository.getmaster();
		
		for(LeaveTypeMaster entity:master) {
		
			LeaveTypeMasterResponse masterresponse=new LeaveTypeMasterResponse();
			masterresponse.setLeaveid(entity.getLeaveid());
			masterresponse.setLeave_name(entity.getLeave_name());
			masterresponse.setLeave_type_id(entity.getLeave_type_id());
			masterresponse.setNo_of_days(entity.getNo_of_days());
			
			
			masterlist.add(masterresponse);
		}
		return masterlist;
	}
	

}
