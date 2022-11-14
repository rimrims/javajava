package com.yedam.java.ch0801_04;

public class Driver {
	
	public void drive(Vehicle vehicle) { // 인터페이스를 매개변수로 하면 다양한 객체를 넣어서 사용가능함.
										// 매개변수의 다형성
		if(vehicle instanceof Bus) { // 참조클래스가 Bus면 true 아니면 false
			Bus bus = (Bus) vehicle; // 맞으면 강제타입변환
			bus.checkFare(); // 클래스 자체 메소드 사용가능
		}
		vehicle.run();
	}
}
