package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AracahDTO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	    Long id;
	
@Column
String rollno;
@Column
String name;
@Column
String dob;
@Column
String indosno;
@Column
String passedout;
@Column
String email;
@Column
String mobilenumber;
@Column
String department;
@Column
String course;
@Column
String batchno;


@Override
public String toString() {
	return "AracahDTO [id=" + id + ", rollno=" + rollno + ", name=" + name + ", dob=" + dob + ", indosno=" + indosno
			+ ", passedout=" + passedout + ", email=" + email + ", mobilenumber=" + mobilenumber + ", department="
			+ department + ", course=" + course + ", batchno=" + batchno + "]";
}
public AracahDTO(){
	
}
public AracahDTO( String rollno, String name, String dob, String indosno, String passedout, String email,
		String mobilenumber, String department, String course,String batchno) {
	super();
	
	this.rollno = rollno;
	this.name = name;
	this.dob = dob;
	this.indosno = indosno;
	this.passedout = passedout;
	this.email = email;
	this.mobilenumber = mobilenumber;
	this.department = department;
	this.course = course;
	this.batchno = batchno;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((batchno == null) ? 0 : batchno.hashCode());
	result = prime * result + ((course == null) ? 0 : course.hashCode());
	result = prime * result + ((department == null) ? 0 : department.hashCode());
	result = prime * result + ((dob == null) ? 0 : dob.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((indosno == null) ? 0 : indosno.hashCode());
	result = prime * result + ((mobilenumber == null) ? 0 : mobilenumber.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((passedout == null) ? 0 : passedout.hashCode());
	result = prime * result + ((rollno == null) ? 0 : rollno.hashCode());
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
	AracahDTO other = (AracahDTO) obj;
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
	if (dob == null) {
		if (other.dob != null)
			return false;
	} else if (!dob.equals(other.dob))
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
	if (indosno == null) {
		if (other.indosno != null)
			return false;
	} else if (!indosno.equals(other.indosno))
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
	if (passedout == null) {
		if (other.passedout != null)
			return false;
	} else if (!passedout.equals(other.passedout))
		return false;
	if (rollno == null) {
		if (other.rollno != null)
			return false;
	} else if (!rollno.equals(other.rollno))
		return false;
	return true;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getIndosno() {
	return indosno;
}
public void setIndosno(String indosno) {
	this.indosno = indosno;
}
public String getpassedout() {
	return passedout;
}
public void setpassedout(String passedout) {
	this.passedout = passedout;
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


public String getBatchno() {
	return batchno;
}
public void setBatchno(String batchno) {
	this.batchno = batchno;
}





}