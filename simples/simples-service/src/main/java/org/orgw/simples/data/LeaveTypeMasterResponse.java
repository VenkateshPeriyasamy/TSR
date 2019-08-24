package org.orgw.simples.data;

import java.io.Serializable;

public class LeaveTypeMasterResponse implements Serializable{
	
	private int leaveid;
	private String leave_type_id;
	private String leave_name;
	private int no_of_days;
	private int status;
	public String getLeave_type_id() {
		return leave_type_id;
	}
	public void setLeave_type_id(String leave_type_id) {
		this.leave_type_id = leave_type_id;
	}
	public String getLeave_name() {
		return leave_name;
	}
	public void setLeave_name(String leave_name) {
		this.leave_name = leave_name;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getLeaveid() {
		return leaveid;
	}
	public void setLeaveid(int leaveid) {
		this.leaveid = leaveid;
	}
	

}
