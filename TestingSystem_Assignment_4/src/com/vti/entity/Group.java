package com.vti.entity;

import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account account;
	private LocalDate joinDate;
	
	
	
	// set id
	public void setId(int id) {
		this.id = id;
	}
	
	// get id
	public int getId() {
		return id;
	}
	
	
	// set name
	public void setName(String name) {
		this.name = name;
	}
	
	// get name
	public String getName() {
		return name;
	}
	
	
	// set join Date
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate; 
	}
	
	public LocalDate getJoinDate() {
		return	joinDate;
	}
	
	
	
	// set creator
	public void setAccount(Account account) {
		this.account = account;
	}
	
	// get account
	public Account getAccount() {
		return account;
	}
	
}
