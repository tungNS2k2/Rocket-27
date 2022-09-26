package com.vti.entity;

import java.time.LocalDate;

public class Question {
	private int id;
	private String content;
	private CategoryQuestion category;
	private TypeQuestion type;
	private Account account;
	private LocalDate createDate;
	
	
	
//	set get id
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String setContent() {
		return content;
	}
	
	
	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}
	
	public CategoryQuestion getCategory() {
		return category;
	}
	
	
	public void setType(TypeQuestion type) {
		this.type = type;
	}
	
	
	public TypeQuestion	getType() {
		return type;
	}
	
	
	
	// set Account
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
	
	
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	public LocalDate getcreateDate() {
		return createDate;
	}
}
