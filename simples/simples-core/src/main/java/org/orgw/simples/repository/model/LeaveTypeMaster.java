package org.orgw.simples.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="leavetypemaster")
@Entity
public class LeaveTypeMaster implements Serializable {
	
	@Id
	   @Column(name = "leavemasterid", nullable = false)
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int leaveid;

	
	@Column (name="status")
	private int status;
		@Column(name="leave_type_id")
		private String leave_type_id;
		@Column(name="leave_name")
		private String leave_name;
		@Column(name="no_of_days")
		private int no_of_days;
		
		public int getLeaveid() {
			return leaveid;
		}
		public void setLeaveid(int leaveid) {
			this.leaveid = leaveid;
		}
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

	
}
