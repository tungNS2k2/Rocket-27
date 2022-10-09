package com.vti.entity;

public class Student {
	public static int COUNT = 0;
	private int id;
	private String name;
	
	
	public Student(String name) {
		this.id = ++COUNT;
		this.name = name;
	}

@Deprecated
	public int getId() {
		return id;
	}

@Deprecated
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Id:  " + id + " Name: "+ name;
	}
	
	
}
