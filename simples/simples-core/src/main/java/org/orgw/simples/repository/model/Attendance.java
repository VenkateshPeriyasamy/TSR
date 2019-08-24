package org.orgw.simples.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="attendance")
@Entity

public class Attendance {
	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String id;
	
	
	@Column(name="empid")
	private String empid;
	

	@Column(name="Checkin")
	private String checkin;
	
	@Column(name="Checkout")
	private String checkout;
	
	@Column(name="totaltime")
	private String totaltime;
	
	@Column(name="date")
	private String date;

	@Column (name="status")
	private String status;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="extratime")
	private String extratime;
	
	@Column (name="laggingtime")
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

	@ManyToOne
    @JoinColumn(name = "firstnameid", referencedColumnName = "id")
    Users attendancefirstname;
	
	
	public Users getAttendancefirstname() {
		return attendancefirstname;
	}

	public void setAttendancefirstname(Users attendancefirstname) {
		this.attendancefirstname = attendancefirstname;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	

}
