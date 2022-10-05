package com.vti.entity;

public class MyMath {
	public static int max(int a, int b) {
		if(a > b) 
			return a;
		else if(a < b) 
			return b;
		else 
			System.out.println("hai số bằng nhau!");
		return 0;
	}
	
	
	
	public static int min(int a, int b) {
		if(a > b) 
			return b;
		else if(a < b) 
			return b;
		else 
			System.out.println("hai số bằng nhau!");
		return 0;
	}
	
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
