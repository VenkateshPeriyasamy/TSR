package org.orgw.simples.data;

import java.io.Serializable;



public class MasterSettingRequest implements Serializable {
	
	private String empid;
	
	private String firstname;
	
	private String lastname;
	
	//private String password;
	
	private String dateofjoining;
	
	private String designation;
	
	private String mobile;
	
	private String personalmail;
	
	private String companymail;

	private String dob;
	
	private String address;
	
	private String status;

	//private String dateTime;
	
	//private String ip;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPersonalmail() {
		return personalmail;
	}

	public void setPersonalmail(String personalmail) {
		this.personalmail = personalmail;
	}

	public String getCompanymail() {
		return companymail;
	}

	public void setCompanymail(String companymail) {
		this.companymail = companymail;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
*/


	

	

}
