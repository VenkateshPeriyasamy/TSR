package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ContactDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	
	@Column
	String name;
	@Column
	String email;
	@Column
	String mobilenumber;
	@Column
	String batchno;
//	public ContactDTO(Long id, String name, String email, String mobilenumber, String batchno, String department,
//			String course, String message, String attachment, String presentorganization, String designation,
//			String presentlocation) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.mobilenumber = mobilenumber;
//		this.batchno = batchno;
//		this.department = department;
//		this.course = course;
//		this.message = message;
//		this.attachment = attachment;
//		this.presentorganization = presentorganization;
//		this.designation = designation;
//		this.presentlocation = presentlocation;
//	}

	@Column
	String department;
	@Column
	String course;
	@Column
	String message;
	@Column
	String attachment;
	@Column 
	String presentorganization;
	@Column
	String designation;
	@Column
	String presentlocation;

	public ContactDTO(String name, String email, String mobilenumber,String batchno, String department, String course, String message,
			String attachment, String presentorganization, String designation, String presentlocation) {
		super();
		this.name = name;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.batchno = batchno;
		this.department = department;
		this.course = course;
		this.message = message;
		this.attachment = attachment;
		this.presentorganization = presentorganization;
		this.designation = designation;
		this.presentlocation = presentlocation;
	}

	public ContactDTO() {

	}

	@Override
	public String toString() {
		return "ContactDTO [id=" + id + ", name=" + name + ", email=" + email + ", mobilenumber=" + mobilenumber
				+ ", batchno=" + batchno + ", department=" + department + ", course=" + course + ", message=" + message
				+ ", attachment=" + attachment + ", presentorganization=" + presentorganization + ", designation="
				+ designation + ", presentlocation=" + presentlocation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((batchno == null) ? 0 : batchno.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((mobilenumber == null) ? 0 : mobilenumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((presentlocation == null) ? 0 : presentlocation.hashCode());
		result = prime * result + ((presentorganization == null) ? 0 : presentorganization.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDTO other = (ContactDTO) obj;
		if (attachment == null) {
			if (other.attachment != null)
				return false;
		} else if (!attachment.equals(other.attachment))
			return false;
		if (batchno == null) {
			if (other.batchno != null)
				return false;
		} else if (!batchno.equals(other.batchno))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (mobilenumber == null) {
			if (other.mobilenumber != null)
				return false;
		} else if (!mobilenumber.equals(other.mobilenumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (presentlocation == null) {
			if (other.presentlocation != null)
				return false;
		} else if (!presentlocation.equals(other.presentlocation))
			return false;
		if (presentorganization == null) {
			if (other.presentorganization != null)
				return false;
		} else if (!presentorganization.equals(other.presentorganization))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getPresentorganization() {
		return presentorganization;
	}

	public void setPresentorganization(String presentorganization) {
		this.presentorganization = presentorganization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPresentlocation() {
		return presentlocation;
	}

	public void setPresentlocation(String presentlocation) {
		this.presentlocation = presentlocation;
	}

	
}
