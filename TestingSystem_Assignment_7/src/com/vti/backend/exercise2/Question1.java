package com.vti.backend.exercise2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 1 số nguyên: ");
		int a = scanner.nextInt();
		
		Double sumInt = MyMath.sum(a); 
		System.out.println("tổng của số nguyên vừa nhập với số pi là: " + sumInt);
	}
}
