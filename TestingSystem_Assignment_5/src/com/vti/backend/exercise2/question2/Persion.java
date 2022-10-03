package com.vti.backend.exercise2.question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Persion implements IPersion {
	String name;
	Gender gender;
	String address;
	LocalDate birthDay;
	
	public Persion() {
		
	}
	
	public Persion(String name, Gender gender, String address, LocalDate birthDay) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin từ bàn phím: ");
		System.out.println("Tên: ");
		this.name = scanner.next();
		System.out.println("Giới tính: \n 1.Nam, 2.Nữ, 3.Khác: ");
		int flagGender = scanner.nextInt();
		switch(flagGender) {
		case 1:
			this.gender = Gender.MALE;
			break;
		case 2:
			this.gender = Gender.FEMALE;
			break;
		case 3: 
			this.gender = Gender.UNKNOWN;
			break;
		}
		
		
		System.out.println("Ngày sinh nhập theo định dạng yyyy-MM-dd: ");
		this.birthDay = LocalDate.parse(scanner.next());
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return "persion [name = " + name + " gender = " + gender + " address = " + address + " birthDay = " + birthDay + "]";
	} 
	
	
	
}
