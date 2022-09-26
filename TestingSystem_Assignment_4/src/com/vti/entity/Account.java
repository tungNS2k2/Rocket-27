package com.vti.entity;

import java.time.*;

public class Account {
	private int id;
	private String userName;
	private String fullName;
	private String email;
	private Position position;
	private Department department;
	private LocalDate createDate;
	
	
	
//	Question 2:
//		Tạo constructor cho Account:
//		a) Không có parameters
	public Account() {
		
	}
	
//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
		public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}
	
	
//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
	
	
	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}
//		d) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, createDate
	public Account(int id, String email, String userName, String firstName, Position position, String lastName) {
		this.id = id;
		this.email = email;
		this.position = position;
		this.fullName = firstName + lastName;
	}
	
	

	
	
	
	
	// set id
	public void setId(int id) {
		this.id = id;
	}
	//  get id
	public int getId() {
		return id;
	}
	
	//set name
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	// get fullName
	public String getfullName() {
		return fullName;
	}
	
	// get email
	public void setEmail (String email) {
		this.email = email;
	}
	// set email
	public String getEmail() {
		return email;
	}
	
	// set positon
	public void setPosition(Position position) {
		this.position = position;
	}
	
//	get position
	public Position getPosition() {
		return position;
	}
	
//	set department
	public void setDepartment(Department department) {
		this.department = department;
	}
	// get department
	public Department getDepartment() {
		return department;
	}
	
	// set userName
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// get userName
	public String getUserName() {
		return userName;
	}
	
	// set joinDate
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
//	get create date
	public LocalDate getCreateDate() {
		return createDate;
	}
}
