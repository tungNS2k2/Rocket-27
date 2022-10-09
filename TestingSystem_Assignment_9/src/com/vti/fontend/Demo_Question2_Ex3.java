package com.vti.fontend;

import com.vti.entity.Car;

public class Demo_Question2_Ex3 {
	public static void main(String[] args) {
		Car car = new Car("Mazaha", "BWM");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println("thông tin xe" + car);
		System.out.println("thông tin động cơ " + engine);
	}
}
