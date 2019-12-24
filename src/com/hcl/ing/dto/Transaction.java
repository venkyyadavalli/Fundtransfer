package com.hcl.ing.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {

	private long txId;
	private LocalDate date;
	private Double txAmount;
	public long getTxId() {
		return txId;
	}
	public void setTxId(long txId) {
		this.txId = txId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getTxAmount() {
		return txAmount;
	}
	public void setTxAmount(Double txAmount) {
		this.txAmount = txAmount;
	}
	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", date=" + date + ", txAmount=" + txAmount + "]";
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
