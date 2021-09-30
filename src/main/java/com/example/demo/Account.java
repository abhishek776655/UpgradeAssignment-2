package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Account {
	
	public Account(){}
		
	public Account(String ownerName, String address, float balance, Status status, AccountType accountType) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balance = balance;
		this.status = status;
		this.accountType = accountType;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	
	private String ownerName;
	private String address;
	private float balance;
	
	@CreationTimestamp
	private Date createdDate;
	private Status status;
	private AccountType accountType;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
