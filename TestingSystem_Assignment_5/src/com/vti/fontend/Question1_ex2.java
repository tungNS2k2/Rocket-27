package com.vti.fontend;

import java.util.ArrayList;

import com.vti.entity.Student;

public class Question1_ex2 {
public static void main(String[] args) {
	ArrayList<Student> students = new ArrayList<Student>();
	students.add(new Student(1, "Nguyễn Văn 1", 1));
	students.add(new Student(2, "Nguyễn Văn 2", 2));
	students.add(new Student(3, "Nguyễn Văn 3", 3));
	students.add(new Student(4, "Nguyễn Văn 4", 4));
	students.add(new Student(5, "Nguyễn Văn 5", 5));
	students.add(new Student(6, "Nguyễn Văn 6", 6));
	students.add(new Student(7, "Nguyễn Văn 7", 7));
	students.add(new Student(8, "Nguyễn Văn 8", 8));
	students.add(new Student(9, "Nguyễn Văn 9", 9));
	students.add(new Student(10, "Nguyễn Văn 10", 10));
	
	
	
	for (Student student : students) {
		student.diemDanh();
	}
	
	for (Student student : students) {
		if(student.getGroup() == 1)
			student.hocBai();
	}
	
	for (Student student : students) {
		if(student.getGroup() == 2)
			student.diDonVeSinh();
	}
}
}
