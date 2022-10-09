package com.vti.entity;

public class OuterClass {
	public void show() {
		InnerClass innerclass = new InnerClass();
		innerclass.show();
	}
	
	public class InnerClass{
		public void show() {
			System.out.println("Đây là Inner Class");
		}
	}
}
