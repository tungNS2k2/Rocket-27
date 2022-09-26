package com.vti.entity;

public class GroupAccount {
	private Account account;
	private Group group;
	
	
	
	// set account
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	
	
//	set group
	public void setGroup(Group group) {
		this.group = group;
	}
	
	// get group
	public Group getGroup() {
		return group;
	}
}
