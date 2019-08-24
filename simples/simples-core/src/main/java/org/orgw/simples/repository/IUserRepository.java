package org.orgw.simples.repository;

import java.util.List;

import org.orgw.simples.repository.model.Users;

public interface IUserRepository extends DataRepository<Users> {

    Users getuserdetails(String empid);
    List<Users> getemployeedetails(String firstname);

    List<Users> getemployeedetails();

    Users getcreatedetails(String empid);
    Users editdetails(String empid);
    Users getupdatedetails(String empid);
    Users getprodetails(String empid);
	List<Users> getemployeeleavedetails();
	List<Users> getemployeeleavedetails(String empid);
	
    


    
}