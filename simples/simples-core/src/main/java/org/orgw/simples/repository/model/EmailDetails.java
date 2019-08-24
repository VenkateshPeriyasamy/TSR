package org.orgw.simples.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="leaveform")
@Entity


public class EmailDetails  implements Serializable{
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String id;
	@Column(name = "empid")
	private String empid;
	
	@Column(name = "mailid")
	private String mailid;
	
	@Column(name = "tomailid")
	private String tomailid;
	
	@Column(name = "fromdate")
	private String fromdate;
	
	@Column(name = "todate")
	private String todate;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	@Column(name="cc")
	private String cc;
	
	@Column(name = "leavetype")
	private String leavetype;
	
	@Column (name="applieddate")
	private String applieddate;
	
	@Column (name="totaldays")
	private String totaldays;
	
	@Column (name="allottedfromdate")
	private String allottedfromdate;
	
	@Column (name="allottedtodate")
	private String allottedtodate;
	
	@Column (name="allotteddays")
	private String allotteddays;
	
	@Column (name="content")
	private String content;
	
	@Column (name="subject")
	private String subject;
	
	@Column (name="status")
	private String status;
	
	@Column (name="leavestatus")
	private String leavestatus;
	
	@Column (name="sltaken")
	private String sltaken;
	
	
	
	public String getSltaken() {
		return sltaken;
	}
	public void setSltaken(String sltaken) {
		this.sltaken = sltaken;
	}
	public String getLeavestatus() {
		return leavestatus;
	}
	public void setLeavestatus(String leavestatus) {
		this.leavestatus = leavestatus;
	}
	@ManyToOne
    @JoinColumn(name = "firstnameid", referencedColumnName = "id")
    Users userfirstname;
	
	public Users getUserfirstname() {
		return userfirstname;
	}
	public void setUserfirstname(Users userfirstname) {
		this.userfirstname = userfirstname;
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

	public String getTomailid() {
		return tomailid;
	}
	public void setTomailid(String tomailid) {
		this.tomailid = tomailid;
	}
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
	}
	public String getAllottedfromdate() {
		return allottedfromdate;
	}
	public void setAllottedfromdate(String allottedfromdate) {
		this.allottedfromdate = allottedfromdate;
	}
	public String getAllottedtodate() {
		return allottedtodate;
	}
	public void setAllottedtodate(String allottedtodate) {
		this.allottedtodate = allottedtodate;
	}
	public String getAllotteddays() {
		return allotteddays;
	}
	public void setAllotteddays(String allotteddays) {
		this.allotteddays = allotteddays;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	public String getApplieddate() {
		return applieddate;
	}
	public void setApplieddate(String applieddate) {
		this.applieddate = applieddate;
	}

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}

}
