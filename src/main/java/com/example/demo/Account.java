package com.example.demo;

import java.util.Date;

public class Account {
	public Account(String ownerName, Address address, double balance, String status,String accountType) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balance = balance;
		this.createdDate = new Date();
		this.status = status;
		this.accountType = accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	private String ownerName;
	private Address address;
	private double balance;
	private Date createdDate;
	private String accountType;
	private String status;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
