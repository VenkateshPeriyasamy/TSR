package org.orgw.simples.service;

import java.util.List;

import org.orgw.simples.data.CreateTestRequest;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.UserResponse;

public interface IUserService {

	UserResponse addUser(CreateTestRequest request);

	UserResponse leaveapprove(CreateTestRequest request);

	UserResponse saveleavedetails(CreateTestRequest request);

	List<UserResponse> employeeleavedetails(CreateTestRequest request);

	

	

}
