package org.orgw.simples.controller.test;

import org.apache.log4j.Logger;
import org.orgw.simples.controller.BaseController;
import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.CreateTestRequest;
import org.orgw.simples.data.ProfileRequest;
import org.orgw.simples.data.Response;
import org.orgw.simples.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProfileController extends BaseController{
	private final Logger log = Logger.getLogger(getClass());

	
	@Autowired
	IProfileService profileService;
	
	@RequestMapping(value="/user/profile", method= {RequestMethod.GET,RequestMethod.POST})
	public Response profile(@RequestBody ProfileRequest request)throws BaseException {
		
		return response(profileService.profileRequest(request));
				
	}

	@Override
	protected String getServiceCode() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
