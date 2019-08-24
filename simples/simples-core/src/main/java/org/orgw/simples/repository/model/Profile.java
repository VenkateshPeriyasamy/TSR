package org.orgw.simples.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="profile")
@Entity

public class Profile implements Serializable{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private String id;
    @Column
    private String empid;
    @Column
    private String designation;
    @Column
    private String address;
    @Column
    private String company_mail;
    @Column
    private String date_of_joining;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String mobile;
    @Column
    private String personal_mail;
    @Column
    private String status;
    @Column
    private String dob;

    public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
   
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCompany_mail() {
        return company_mail;
    }
    public void setCompany_mail(String company_mail) {
        this.company_mail = company_mail;
    }
    public String getDate_of_joining() {
        return date_of_joining;
    }
    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
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
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPersonal_mail() {
        return personal_mail;
    }
    public void setPersonal_mail(String personal_mail) {
        this.personal_mail = personal_mail;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
	
	

}
