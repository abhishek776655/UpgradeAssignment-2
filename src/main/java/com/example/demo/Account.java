package com.example.demo;

import java.util.Date;

public class Account {
	public Account(String ownerName, String address, double balance, String status) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balance = balance;
		this.createdDate = new Date();
		this.status = status;
	}
	private String ownerName;
	private String address;
	private double balance;
	private Date createdDate;
	private String status;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
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
