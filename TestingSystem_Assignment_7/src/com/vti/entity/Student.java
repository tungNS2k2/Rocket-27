package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private static String college;
	private static long moneyGroup;
	
	
	public static long getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(long moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	public Student() {
		
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.college = "Đại học bách khoa";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}
	
	
	public String toString() {
		return "Id: " + getId() + " name: " + getName() + " College: " + getCollege();
	}
	
	
	public String getCollect() {
		return Student.college;
		}
	public void setCollect(String newCollect) {
	Student.college = newCollect;
	}
	
}
