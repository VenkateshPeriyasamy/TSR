package org.orgw.simples.data;

import java.io.Serializable;

public class AttendanceResponse implements Serializable {
	
	private String empid;
	private String id;
	private String checkin;
	private String checkout;
	private String totaltime;
	private String date;
	private String status;
	private String firstname;
	private String lastname;
	private String extratime;
	private String laggingtime;
	
	public String getExtratime() {
		return extratime;
	}
	public void setExtratime(String extratime) {
		this.extratime = extratime;
	}
	public String getLaggingtime() {
		return laggingtime;
	}
	public void setLaggingtime(String laggingtime) {
		this.laggingtime = laggingtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(String totaltime) {
		this.totaltime = totaltime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
