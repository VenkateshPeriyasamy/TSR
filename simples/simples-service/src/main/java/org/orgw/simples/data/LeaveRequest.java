package org.orgw.simples.data;

import java.io.Serializable;

public class LeaveRequest implements Serializable {
	
	private String id;
	private String empid;
	private String mailid;
    private String tomailid;
    private String fromdate;
    private String todate;
    private String totaldays;
    private String cc;
    private String leavetype;
    private String subject;
    private String allottedfromdate;
    private String allottedtodate;
    private String applieddate;
    private String allotteddays;
    private String content;
    private String firstname;
    private String lastname;
    private String leavestatus;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
	public String getTomailid() {
		return tomailid;
	}
	public void setTomailid(String tomailid) {
		this.tomailid = tomailid;
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
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	public String getApplieddate() {
		return applieddate;
	}
	public void setApplieddate(String applieddate) {
		this.applieddate = applieddate;
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
	
		
}
