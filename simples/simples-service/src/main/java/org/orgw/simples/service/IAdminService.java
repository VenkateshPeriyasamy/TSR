package org.orgw.simples.service;

import org.orgw.simples.core.exception.ValidationException;
import org.orgw.simples.data.AdminRequest;
import org.orgw.simples.data.AdminResponse;

public interface IAdminService {

	AdminResponse loginadmin(AdminRequest request) throws ValidationException;



	
}
