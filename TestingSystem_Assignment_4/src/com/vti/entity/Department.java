package com.vti.entity;

public class Department {
	private int id;
	private String name;
	Account[] accounts;
	
	
// Question 1: exersice	
//	Tạo constructor cho department:
//	a) không có parameters
	public Department() {
		
	}
//	b) Có 1 parameter là nameDepartment và default id của
//	Department = 0
	public Department(String nameDepartment) {
		this.name = nameDepartment;
		this.id = 0;
	}
	
	
	// set id
	public void setId(int id) {
		this.id = id;
	}
	
	// get id
	public int getId() {
		return id;
	}
	
	
	// set Name
	public void setName(String name) {
		this.name = name;
	}
	
	// get name
	public String getName() {
		return name;
	}
	
 
	

}
