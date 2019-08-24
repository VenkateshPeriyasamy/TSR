package org.orgw.simples.repository;

import java.util.List;

import org.orgw.simples.repository.model.EmailDetails;

public interface ILeaveListRepository extends DataRepository<EmailDetails> {

	List<EmailDetails> getleavelist(String empid);

	
	List<EmailDetails> getemaildetails();


	List<EmailDetails> getemployeelist(String empid);
	

}