package org.orgw.simples.repository;

import org.orgw.simples.repository.model.EmailDetails;

public interface ILeaveListSaveRepository extends DataRepository<EmailDetails> {

	EmailDetails getleavelistdetails(String empid);
	
	

}
