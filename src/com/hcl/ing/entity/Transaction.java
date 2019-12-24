package com.hcl.ing.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tx_id")
	private long txId;
	
	@Column(name="tx_date")
	private LocalDate date;
	
	@Column(name="tx_amount")
	private Double txAmount;
	
	@OneToMany
	@JoinColumn(name="acc_id")
	private Account account;

	/**
	 * @return the txId
	 */
	public long getTxId() {
		return txId;
	}

	/**
	 * @param txId the txId to set
	 */
	public void setTxId(long txId) {
		this.txId = txId;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the txAmount
	 */
	public Double getTxAmount() {
		return txAmount;
	}

	/**
	 * @param txAmount the txAmount to set
	 */
	public void setTxAmount(Double txAmount) {
		this.txAmount = txAmount;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", date=" + date + ", txAmount=" + txAmount + ", account=" + account + "]";
	}
	
	
	
	

}
