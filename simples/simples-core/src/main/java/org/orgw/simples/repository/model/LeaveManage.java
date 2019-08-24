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

@Table(name="leavemanage")
@Entity
public class LeaveManage implements Serializable{
    
	  @Id
	   @Column(name = "leaveid", nullable = false)
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private String leaveid;

	   @Column(name = "empid")
	   private String empid;

	   @Column(name = "designation")
	   private String designation;
	   
	   @Column(name = "sl")
	   private int sl;
	    
	   @Column(name = "cl")
	   private int cl;
	   
	   @Column(name = "el")
	   private int el;
	   
	   @Column (name = "mdl")
	   private int mdl;
	   
	   @Column (name = "mtl")
	   private int mtl;
	   
	   @Column (name = "slavailable")
	   private int slavailable;
	   
	   @Column (name = "clavailable")
	   private int clavailable;
	   
	   @Column (name = "elavailable")
	   private int elavailable;
	   
	   @Column (name = "mdlavailable")
	   private int mdlavailable;
	   
	   @Column (name = "mtlavailable")
	   private int mtlavailable;
	   
	   @Column (name = "totalleave")
	   private int totalleave;
	   
	   @Column (name="status")
	   private String status;
	   
	   @Column(name="firstname")
	   private String firstname;
		
	   @Column(name="lastname")
	   private String lastname;
	   
	   @Column(name = "dateofjoining")
	   private String dateofjoining;
	   
	   @ManyToOne
	   @JoinColumn(name = "firstnameid", referencedColumnName = "id")
	   Users leavefirstname;
	   
	   public Users getLeavefirstname() {
			return leavefirstname;
		}
	   public void setLeavefirstname(Users leavefirstname) {
			this.leavefirstname = leavefirstname;
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
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	
		
	    public String getStatus() {
	        return status;
	    }
	    public void setStatus(String status) {
	        this.status = status;
	    }
	    public String getLeaveid() {
	        return leaveid;
	    }
	    public void setLeaveid(String leaveid) {
	        this.leaveid = leaveid;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
	    public int getSl() {
	        return sl;
	    }
	    public void setSl(int sl) {
	        this.sl = sl;
	    }
	    public int getCl() {
	        return cl;
	    }
	    public void setCl(int cl) {
	        this.cl = cl;
	    }
	    public int getEl() {
	        return el;
	    }
	    public void setEl(int el) {
	        this.el = el;
	    }
	    public int getMdl() {
	        return mdl;
	    }
	    public void setMdl(int mdl) {
	        this.mdl = mdl;
	    }
	    public int getMtl() {
	        return mtl;
	    }
	    public void setMtl(int mtl) {
	        this.mtl = mtl;
	    }
	    public int getSlavailable() {
	        return slavailable;
	    }
	    public void setSlavailable(int slavailable) {
	        this.slavailable = slavailable;
	    }
	    public int getClavailable() {
	        return clavailable;
	    }
	    public void setClavailable(int clavailable) {
	        this.clavailable = clavailable;
	    }
	    public int getElavailable() {
	        return elavailable;
	    }
	    public void setElavailable(int elavailable) {
	        this.elavailable = elavailable;
	    }
	    public int getMdlavailable() {
	        return mdlavailable;
	    }
	    public void setMdlavailable(int mdlavailable) {
	        this.mdlavailable = mdlavailable;
	    }
	    public int getMtlavailable() {
	        return mtlavailable;
	    }
	    public void setMtlavailable(int mtlavailable) {
	        this.mtlavailable = mtlavailable;
	    }
	    public int getTotalleave() {
	        return totalleave;
	    }
	    public void setTotalleave(int totalleave) {
	        this.totalleave = totalleave;
	    }
		public String getEmpid() {
			return empid;
		}
		public void setEmpid(String empid) {
			this.empid = empid;
		}
	
	   
	    
    
}