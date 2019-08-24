package org.orgw.simples.data;

import java.io.Serializable;

public class ProfileResponse implements Serializable{
    
    private String empid;
    private String designation;
    private String address;
    private String company_mail;
    private String date_of_joining;
    private String firstname;
    private String lastname;
    private String mobile;
    private String personal_mail;
    private String status;
    private String dob;
	private String casualleave;
    private String sickleave;
    private String earnedleave;
    private String maternityleave;
    private String medicalleave;
    private String sltaken;
    private String cltaken;
    private String mtltaken;
    private String mdltaken;
    private String eltaken;
   
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
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
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