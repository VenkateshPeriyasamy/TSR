package org.orgw.simples.repository;

import org.orgw.simples.repository.model.Admin;


public interface IAdminRepository extends DataRepository<Admin> {

	Admin getadminlogin(String empid);

	Admin getadminlogin(String empid, String password);

}
