package com.vti.backend.exercise1;

import com.vti.entity.Student;

public class Question4 {
	public void question4() {
		Student student = new Student();
		System.out.println("college: " + student.getCollect());
		
		System.out.println("thay đổi giá trị college: ");
		student.setCollect("Đại học công nghiệp hà nội!");
		
		System.out.println("new college: " + student.getCollect());
	}
}
