package org.orgw.simples.data;

import java.io.Serializable;
import java.util.List;

public class CreateTestRequest implements Serializable {

	private String empid;
	private String password;
	private String ip;
	private String casualleave;
    private String sickleave;
    private String earnedleave;
    private String maternityleave;
    private String medicalleave;
    private String totalleavetaken;
    private String sltaken;
    private String cltaken;
    private String mtltaken;
    private String mdltaken;
    private String eltaken;
    
    public String getTotalleavetaken() {
		return totalleavetaken;
	}
	public void setTotalleavetaken(String totalleavetaken) {
		this.totalleavetaken = totalleavetaken;
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


	//private List<String> listofid;
    private String listid;
	
	
	public String getListid() {
		return listid;
	}
	public void setListid(String listid) {
		this.listid = listid;
	}
	/*public List<String> getListofid() {
		return listofid;
	}
	public void setListofid(List<String> listofid) {
		this.listofid = listofid;
	}*/
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
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
}
