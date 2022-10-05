package com.vti.backend.exercise2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("khởi tạo ID: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		
		System.out.println("Nhập tên: ");
		String name = scanner.next();
		
		System.out.println("nhập tuổi: ");
		int tuoi = scanner.nextInt();
		
		System.out.println("Nhập quê quán: ");
		String queQuan = scanner.next();
		
		Student student = new Student(id, name, tuoi, queQuan);
		
		System.out.println(student.toString());
	}
}
