package com.vti.fontend;

import com.vti.entity.*;

public class Demo_Question1_Exercise3 {
	
	public static void main(String[] args) {
		System.out.println("Khởi tạo CPU");
		CPU cpu = new CPU(10);
		
		CPU.Processor pro1 = cpu.new Processor(4, "intel");
		CPU.Ram ram = cpu.new Ram(16, "Kingston");
		
		
		System.out.println("Thông tin Processor");
		System.out.println("Cache processor: " + pro1.getCache());
		System.out.println("Clock speed ram: " + ram.getClockSpeed());
		
	}
	
}
