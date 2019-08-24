package org.orgw.simples.controller.test;

import java.net.InetAddress;

import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.CreateTestRequest;
import org.orgw.simples.data.LeaveRequest;
import org.orgw.simples.data.Response;
import org.orgw.simples.service.ITestCreateService;
import org.orgw.simples.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateTestController extends BaseController {

    
    @Autowired
    ITestCreateService createService;
    
    @Autowired
    IUserService userService;
    
    
    @PostMapping (value="user/create", produces = "application/json; charset-UTF-8")
    public Response userAdd(@RequestBody  CreateTestRequest  request  ) throws BaseException {

        return response (userService.addUser(request));
    }
    @PostMapping (value="user/approve", produces = "application/json; charset-UTF-8")
    public Response approve(@RequestBody  CreateTestRequest  request  ) throws BaseException {

        return response (this.userService.leaveapprove(request));
    }
    
    @PostMapping (value="user/saveleavetype", produces = "application/json; charset-UTF-8")
       public Response saveleavetype(@RequestBody  CreateTestRequest  request  ) throws BaseException {
            
            return response (this.userService.saveleavedetails(request));
        }
    @PostMapping(value="/user/employeeleavedetails", produces="application/json; charset=UTF-8")
    public Response employeeleavedetailslist(@RequestBody CreateTestRequest request) throws BaseException {
    	return response(userService.employeeleavedetails(request));
    }
   

    @Override
    protected String getServiceCode() {
        // TODO Auto-generated method stub
        return "CreateTestAdd";
    }

    
}