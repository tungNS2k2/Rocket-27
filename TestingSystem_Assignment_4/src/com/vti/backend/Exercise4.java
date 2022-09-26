package com.vti.backend;

public class Exercise4 {
	// class Circle
	public class Circle{
		
		private double radius = 1.0;
		private String color = "red";
		
		// Circle()
		public Circle() {
			
		}
		
//		Circle(radius: double)
		public Circle(double radius) {
			this.radius = radius;
		}
		// circle(radius: double, color: String)
		public Circle (double radius, String color) {
			this.radius = radius;
			this.color = color;
		}
		
		// set radius
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		// get radius
		public double getRadius() {
			return radius;
		}
		
		// set color
		public void setColor(String color) {
			this.color = color;
		}
		
//		get color
		public String getColor() {
			return color;
		}
		
//		get area
		public double getArea() {
			return radius;
		}
		
		
		// get toString
		public String getToString() {
			return color;
		}
		
	}
	
	
	public class 	Account{
		private int id;
		private String name;
		private int balance;
		
		
		public Account(int id, String name, int balance) {
			this.id = id;
			this.name = name;
			this.balance =balance;
		}
		
		

		
//		get id
		public int getId() {
			return id;
		}
		
//		get name
		public String getName() {
			return name;
		}
		
		public int getBalance() {
			return balance;
		}
		
		
		public void credit(int amount) {
			
		}
		
		public void debit(int amount) {
			
		}
		
		public void tranfe(Account account, int amount) {
			
		}
		
	}
	
	
	public class Date{
		private int day;
		private int month;
		private int year;
		
		
		public Date(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		public int getDay() {
			return day;
		}
		
		
		public int getMonth() {
			return month;
		}
		
		
		public int getYear() {
			return year;
		}
		
		
		public void setDay(int day) {
			this.day = day;
		}
		
		public void setMonth(int month) {
			this.month = month;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		
		public String toString() {
			return	day + " " + month + " " + year;
		}
		
		public boolean isLeapYear() {
			if(this.year %4== 0 && this.year %100 != 0) {
				return true;
			}
			return false;
		}
		
		
		
	}
	
	
	
	
	
	
	
	public static void Question2() {
		
	}
}
