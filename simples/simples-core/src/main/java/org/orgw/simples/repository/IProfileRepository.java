package org.orgw.simples.repository;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.repository.model.Profile;

public interface IProfileRepository extends DataRepository<Profile>{

	Profile getprodetails(String empid)throws BaseException;



	
}
