package com.vti.entity;

public class ThiSinh extends KhoiThi{
	private int soBD;
	private String hoTen;
	private String diaChi;
	private int mucUuTien;
	private KhoiThi khoiThi;
	
	
	public ThiSinh() {
		
	}
	
	public ThiSinh(int soBD, String hoTen, String diaChi, int mucUuTien, String name) {
		this.soBD = soBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		super.setName(name);
	}

	public int getSoBD() {
		return soBD;
	}

	public void setSoBD(int soBD) {
		this.soBD = soBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public KhoiThi getKhoiThi() {
		return khoiThi;
	}

	public void setKhoiThi(KhoiThi khoiThi) {
		this.khoiThi = khoiThi;
	}
	
	
	
	
	public String toString() {
		return "SBD: " + soBD + "Họ Tên: " + hoTen + "Địa chỉ: " + diaChi + " Mức ưu tiên: " + mucUuTien  + super.getName() + " " + super.getMonThi(); 
	}
	
	
	
}
