package com.vti.entity;

public class CPU {
	private float price;
	
	
	public CPU(float price) {
		this.price = price;
	}
	
	public class Processor{
		private int coreAmount;
		private String menufacture;
		
		
		public Processor(int coreAmount, String menufacture) {
			this.coreAmount = coreAmount;
			this.menufacture = menufacture;
		}
		
		
		public double getCache() {
			return 4.3;
		}
		
		
	}
	
	
	public class Ram{
		private int memory;
		private String menufacture;
		
		
		public Ram(int memory, String menufacture){
			this.memory = memory;
			this.menufacture = menufacture;
		}
		
		public double getClockSpeed() {
			return 5.5;
		}
		
		
	}
}
