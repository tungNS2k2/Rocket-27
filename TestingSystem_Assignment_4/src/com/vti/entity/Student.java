package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private float diemHocLuc;
	
	
	
	// set id
	public void setId(int id) {
		this.id = id;
	}
	// get id
	public int getId() {
		return id;
	}
	
	
//	set name
	public void setName(String name) {
		this.name = name;
	}
	// get name
	public String getName() {
		return name;
	}
	
	// set homeTown
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	
//	get hometown
	public String getHomeTown() {
		return homeTown;
	}
	
	
	
//	b. Tạo constructor cho phép khi khởi tạo mỗi student thì người
//	dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
	public Student(int id, String name, String homeTown) {
		this.id = id;
		this.name = name;
		this.homeTown = homeTown;
		this.diemHocLuc = 0;
	}
	
	
//	c. Tạo 1 method cho phép set điểm vào
	public void setDiem(int diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
	// Tạo 1 method cho phép cộng thêm điểm
	
	public void setCongDiem(int diemHocLuc) {
		this.diemHocLuc += diemHocLuc;
	}
	
	
//	e. Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	
	public void printStudetn() {
		System.out.println("id: " + id + " Name: " + name + " HomeTown: " + homeTown + " Diểm học lực: " + diemHocLuc);
	}
	
	
}
