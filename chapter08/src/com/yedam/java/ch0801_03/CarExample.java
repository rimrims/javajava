package com.yedam.java.ch0801_03;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("===================");
		
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire(); // 필드의 다형성
		
		myCar.run();
	}
}
