package com.vti.entity;

public class KhoiThi {
	private String name;
	private String monThi;
	
	
	
	public KhoiThi(){
		
	}
	
	public KhoiThi(String name) {
		
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getMonThi() {
		switch(name) {
		case "A":
			this.monThi = "Toán, Lý, Hóa";
			break;
		case "B":
			this.monThi = "Toán, Hóa, Sinh";
			break;
		case "C":
			this.monThi = "Văn, Sử, Địa";
			break;
		}
		return monThi;
	}
}
