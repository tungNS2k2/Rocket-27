package com.vti.backend.exercise1;

import java.util.ArrayList;

import com.vti.entity.Student;

public class Question1 {

	public void question1() {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn c");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		System.out.println("Thông tin của các sinh viên: ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
		System.out.println("Chuyển các student sang đang học công nghệ!");
		Student.setCollege("Đại học công nghệ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
	}

}
