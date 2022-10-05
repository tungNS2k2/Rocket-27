package com.vti.backend.exercise2;

public class Student {
	private final int id;
	private String name;
	private int tuoi;
	private String queQuan;
	
	
	
//	constructor có parameter
	public Student(int id, String name,int tuoi, String queQuan){
		this.id = id;
		this.name = name;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}

// return name
	public String getName() {
		return name;
	}

// set name
	public void setName(String name) {
		this.name = name;
	}

// return tuoi
	public int getTuoi() {
		return tuoi;
	}

// set tuoi
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

// return queQuan
	public String getQueQuan() {
		return queQuan;
	}

// set queQuan
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public int getId() {
		return id;
	}
	
	
	public String toString() {
		return "id: " + id + " Name: " + name + " Tuổi: " + tuoi + " Que Quan: " + queQuan; 
	}	
}
