package org.orgw.simples.service;

import java.util.List;

import org.orgw.simples.data.LeaveResponse;
import org.orgw.simples.data.MasterSettingRequest;
import org.orgw.simples.data.MasterSettingResponse;

public interface IMasterSettingService {

	List<MasterSettingResponse> mastersettinglist(MasterSettingRequest request);

	MasterSettingResponse mastercreaterecord(MasterSettingRequest request);

	MasterSettingResponse geteditlist(MasterSettingRequest editrequest);

}
