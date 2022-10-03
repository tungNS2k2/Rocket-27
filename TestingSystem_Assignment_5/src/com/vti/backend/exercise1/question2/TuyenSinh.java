package com.vti.backend.exercise1.question2;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.KhoiThi;
import com.vti.entity.ThiSinh;

public class TuyenSinh implements ITuyenSinh{
	public ArrayList<ThiSinh> listThiSinh = new ArrayList<ThiSinh>() {};
	Scanner scanner= new Scanner(System.in);
	public void ChucNang() {
		while(true) {
		System.out.println("Chức Năng: ");
		System.out.println("1: thêm mới thí sinh: ");
		System.out.println("2: hiển thị thí sinh: ");
		System.out.println("3: tìm kiếm theo số báo danh");
		System.out.println("4: thoát khỏi chương trình");
		
		
		int luaChon = scanner.nextInt();
		
	
		switch(luaChon) {
		case 1:
			themThiSinh();
			break;
		case 2:
			hienThi();
			break;
		case 3:
			timKiem();
			break;
		case 4:
			System.out.println("Đã thoát khỏi chương trình!");
			return;
		}
	}
	}

	@Override
	public void themThiSinh() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số báo danh");
		int soBD = scanner.nextInt();
		
		System.out.println("Nhập họ tên: ");
		String hoTen = scanner.next();
		
		System.out.println("Nhập địa chỉ: ");
		String diaChi = scanner.next();
		
		
		System.out.println("Nhập mức ưu tiên: ");
		int mucUuTien = scanner.nextInt();
		
		System.out.println("Nhập khối thi");
		String tenKhoi = scanner.next();
		
		ThiSinh thiSinh = new ThiSinh(soBD, hoTen, diaChi, mucUuTien, tenKhoi);
		listThiSinh.add(thiSinh);
		
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		for (ThiSinh thiSinh : listThiSinh) {
			thiSinh.toString();
			
		}
		
	}

	@Override
	public void timKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập số báo danh cần thìm");
		
		int soBD = scanner.nextInt();
		for (ThiSinh thiSinh : listThiSinh) {
			if(thiSinh.getSoBD() == soBD) {
				thiSinh.toString();
			}
		}
	}
}
