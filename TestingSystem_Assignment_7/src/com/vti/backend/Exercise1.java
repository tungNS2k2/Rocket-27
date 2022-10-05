package com.vti.backend;

import java.util.Scanner;

import com.vti.backend.exercise1.Question1;
import com.vti.backend.exercise1.Question2;
import com.vti.backend.exercise1.Question4;
import com.vti.entity.MyMath;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// question 1
		System.out.println("\n\n Question 1: ");
		Question1 question1 = new Question1();
		question1.question1();
		
		
		// Question 2:
		System.out.println("\n\n Question 2: ");
		Question2 question2 = new Question2();
		question2.question2();
		
		
		//Question 3
		System.out.println("\n \n Question 3: ");
		int a, b;
		System.out.println("Nhập số thứ nhất:");
		a = sc.nextInt();
		System.out.println("Nhập số thứ hai:");
		b = sc.nextInt();
		int	maxInt = MyMath.max(a, b);
		int minInt = MyMath.min(a,b);
		int sumInt = MyMath.sum(a, b);
		System.out.println("Max là: " + maxInt);
		System.out.println("Min là : " + minInt);
		System.out.println("sum là: " + sumInt);
		
		
		System.out.println("\n\nQuestion4: ");
		Question4 question4 = new Question4();
		question4.question4();
		
		
		
	}
}
	