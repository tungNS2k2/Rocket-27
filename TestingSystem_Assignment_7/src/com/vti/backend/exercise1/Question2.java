package com.vti.backend.exercise1;

import java.util.ArrayList;

import com.vti.entity.Student;

public class Question2 {
	public void question2() {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		
//		B1: Các Student sẽ nộp quỹ, mỗi Student 100k
		System.out.println("Mỗi sinh viên nộp 100k: ");
		Student.setMoneyGroup(300);
		System.out.println(Student.getMoneyGroup());
		
//		B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		System.out.println("Tổng quỹ: ");
		
		
		Student.setMoneyGroup(Student.getMoneyGroup() - 50);
		System.out.println(Student.getMoneyGroup());
//		B3: Student thứ 2 lấy 20k đi mua bánh mì
		
		Student.setMoneyGroup(Student.getMoneyGroup() - 20);
		System.out.println("Tổng quỹ sau khi student 2 lấy 20k đi mua bánh mì:");
		System.out.println(Student.getMoneyGroup());
//		B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
		Student.setMoneyGroup(Student.getMoneyGroup() - 150);
		System.out.println("Tổng quỹ sau khi student lấy 150k đi mua đồ dùng học tập cho nhóm là: ");
		System.out.println(Student.getMoneyGroup());
		
//		B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
		Student.setMoneyGroup(Student.getMoneyGroup() + 150);
		System.out.println("Tổng quỹ mới sau khi mỗi người đóng 50k: " + Student.getMoneyGroup());
		
		
	}
}
