package com.hcl.ing.dto;

import java.io.Serializable;

public class Account implements Serializable {

	private long accountNo;
	private String accountName;
	private String branch;
	private String ifsc;
	private String country;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", branch=" + branch + ", ifsc="
				+ ifsc + ", country=" + country + "]";
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
