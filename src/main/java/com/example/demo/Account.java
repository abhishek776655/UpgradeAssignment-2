package com.example.demo;

import java.util.Date;

public class Account {
	public Account(String ownerName, Address address, float balance, Status status, AccountType accountType) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balance = balance;
		this.createdDate = new Date();
		this.status = status;
		this.accountType = accountType;
	}
	
	private String ownerName;
	private Address address;
	private float balance;
	private Date createdDate;
	private Status status;
	private AccountType accountType;
 	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public Status getStatus() {
		return status;
	}
	public AccountType getAccountType() {
		return accountType;
	}

}
