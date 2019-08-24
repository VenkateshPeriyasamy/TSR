package org.orgw.simples.data;

import java.io.Serializable;

public class LeaveManageRequest implements Serializable{

	  
    private String empid;
private String leaveid;
   public String getLeaveid() {
    return leaveid;
}
public void setLeaveid(String leaveid) {
    this.leaveid = leaveid;
}
    private String designation;
   private int sl;
   private int cl;
   private int el;
   private int mdl;
   private int mtl;
   private int slavailable;
   private int clavailable;
   private int elavailable;
   private int mdlavailable;
   private int mtlavailable;
   private int totalleave;
   private String status;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
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

}
