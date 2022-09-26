package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	private int id;
	private int code;
	private String title;
	private CategoryQuestion category;
	private int duration;
	private Account account;
	private LocalDate createDate;
	
	
	//set id
	public void setId(int id) {
		this.id = id;
	}
	
	// get id
	public int getId() {
		return id;
	}
	
	
	// set Code
	public void setCode(int code) {
		this.code = code;
	}
	
	// get code
	public int getCode() {
		return code;
	}
	
	
	// set title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// get title
	public String getTitle() {
		return title;
	}
	
	
	// set  categoryQuestion
	public void setcategoryQuestion(CategoryQuestion category) {
		this.category = category;
	}
	
//	get categoryQuestion
	public CategoryQuestion getCategoryQuestion() {
		return category;
	}
	
	// set time thi
	public void setDruation(int duration) {
		this.duration = duration;
	}
	
	//get duration 
	public int getDuration() {
		return duration;
	}
	
	
//	set nguoi tao exam
	public void setCreator(Account account) {
		this.account = account;
	}
	// get creator
	public Account getCreator() {
		return account;
	}
	
	// set ngay tao
	public void setCreateDate(LocalDate creatDate) {
		this.createDate = creatDate;
	}
	
	// get creatdate
	public LocalDate getCreateDate() {
		return createDate;
	}
}
