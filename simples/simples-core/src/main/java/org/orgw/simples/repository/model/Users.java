    package org.orgw.simples.repository.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="employee")
@Entity

public class Users implements Serializable{
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String id;
	
	@Column(name = "empid")
	private String empid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "ip")
	private String ip;	
	
	@Column(name = "datetime")
	private String dateTime;
	
	@Column(name = "status")
	private String status;

	@Column(name = "firstname")
    private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "dateofjoining")
	private String dateofjoining;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "personalmail")
	private String personalmail;
	
	@Column(name = "companymail")
	private String companymail;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "address")
	private String address;
	
	@Column(name="sickleave")
	private String sickleave;
	
	@Column(name="casualleave")
	private String casualleave;
	
	@Column(name="earnedleave")
	private String earnedleave;
	
	@Column(name="maternityleave")
	private String maternityleave;
	
	@Column(name="medicalleave")
	private String medicalleave;
	
	@Column(name="totalleavetaken")
	private String totalleavetaken;
	
	@Column(name="sltaken")
	private String sltaken;
	
	@Column(name="cltaken")
	private String cltaken;
	      
	@Column(name="mtltaken")
	private String mtltaken;
	
	@Column(name="mdltaken")
	private String mdltaken;
	
	@Column(name="eltaken")
	private String eltaken;
	
	public String getTotalleavetaken() {
		return totalleavetaken;
	}

	public void setTotalleavetaken(String totalleavetaken) {
		this.totalleavetaken = totalleavetaken;
	}

	public String getSltaken() {
		return sltaken;
	}

	public void setSltaken(String sltaken) {
		this.sltaken = sltaken;
	}

	public String getCltaken() {
		return cltaken;
	}

	public void setCltaken(String cltaken) {
		this.cltaken = cltaken;
	}
	
	public String getMtltaken() {
		return mtltaken;
	}

	public void setMtltaken(String mtltaken) {
		this.mtltaken = mtltaken;
	}

	public String getMdltaken() {
		return mdltaken;
	}

	public void setMdltaken(String mdltaken) {
		this.mdltaken = mdltaken;
	}

	public String getEltaken() {
		return eltaken;
	}

	public void setEltaken(String eltaken) {
		this.eltaken = eltaken;
	}



	//private List<String> listofid;
	private String listid;
	
	

	/*public void setListid(String listid) {
		this.listid = listid;
	}

	public List<String> getListofid() {
		return listofid;
	}

	public void setListofid(List<String> listofid) {
		this.listofid = listofid;
	}*/

	public String getListid() {
		return listid;
	}

	public void setListid(String listid) {
		this.listid = listid;
	}

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

	public String getId() {
		return id; 
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCasualleave() {
		return casualleave;
	}

	public void setCasualleave(String casualleave) {
		this.casualleave = casualleave;
	}

	public String getSickleave() {
		return sickleave;
	}

	public void setSickleave(String sickleave) {
		this.sickleave = sickleave;
	}

	public String getEarnedleave() {
		return earnedleave;
	}

	public void setEarnedleave(String earnedleave) {
		this.earnedleave = earnedleave;
	}

	public String getMaternityleave() {
		return maternityleave;
	}

	public void setMaternityleave(String maternityleave) {
		this.maternityleave = maternityleave;
	}

	public String getMedicalleave() {
		return medicalleave;
	}

	public void setMedicalleave(String medicalleave) {
		this.medicalleave = medicalleave;
	}


}
