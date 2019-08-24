package org.orgw.simples.controller.test;

import org.apache.log4j.Logger;
import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.LeaveManageRequest;
import org.orgw.simples.data.Response;
import org.orgw.simples.service.ILeaveManageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveManageController extends BaseController{
    
    private final Logger  log = Logger.getLogger(getClass());
    @Autowired
    ILeaveManageService leaveManageService;
    @Autowired
    
    ILeaveManageService manageService;
    
     @RequestMapping(path="/user/manageleave",method=RequestMethod.POST, produces = "application/json; charset-UTF-8")
     public Response leavemanageRequest(@RequestBody LeaveManageRequest request)throws BaseException{
         return response(manageService.addLeaveManage(request));
        
     }
     @PostMapping(path="/leavemange/list",produces = "application/json; charset=UTF-8")
     public Response leavemanagelist(@RequestBody LeaveManageRequest request) throws BaseException{
         return response(leaveManageService.managelist(request));
        
     }

    @Override
    protected String getServiceCode() {
        // TODO Auto-generated method stub
        return "Manage Leave";
    }

}
