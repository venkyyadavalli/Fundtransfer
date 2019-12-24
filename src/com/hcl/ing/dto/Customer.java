package com.hcl.ing.dto;

import java.io.Serializable;

public class Customer implements Serializable {

	private long cId;
	private String cName;
	private long phoneNo;
	private String email;
	private long accountNo;
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", accountNo=" + accountNo + "]";
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
