package org.orgw.simples.data;

import java.io.Serializable;

public class AdminRequest implements Serializable {
	
	private String empid;
	private String password;

	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
