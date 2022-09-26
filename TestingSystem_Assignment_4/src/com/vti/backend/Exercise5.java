package com.vti.backend;

import com.vti.entity.GenDer;

public class Exercise5 {
	public class CanBo{
		private String hoTen;
		private int tuoi;
		private GenDer gioiTinh;
		private String diaChi;
		
		
		public CanBo() {
			
		}
		
		
		// set họ tên
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		
		// get họ Tên
		public String getHoTen() {
			return hoTen;
		}
		
		
		// set tuổi
		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}
		
		
		// get tuoi
		
		public int getTuoi() {
			return tuoi;
		}
		
		
		
		// set giới tính
		public void setGioiTinh(GenDer gioiTinh) {
			this.gioiTinh = gioiTinh;
		}
		
		
		
		// get Giới tính
		public GenDer getGioiTinh() {
			return gioiTinh;
		}
		
		
		// set dịa chỉ
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		
		
		// get Dịa Chỉ
		public String getDiaChi() {
			return diaChi;
		}
		
		
	}
	
	public class CongNhan extends CanBo{
		private int bac;
		
		
		public CongNhan() {
			
		}
		
		public CongNhan(String name, int tuoi, GenDer gioiTinh, String diaChi, int bac) {
			super();
			this.bac = bac;
			
			
		}
		
		
	}
	
	
}
