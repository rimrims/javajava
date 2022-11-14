package com.yedam.java.ch0801_04;

public class DriveExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println("===========================");
		
		Vehicle vhc = new Bus(); // 인터페이스에 정의된 메소드 중 Bus클래스에서 오버라이딩된 메소드만 사용할것이다
		
		vhc.run();
//		vhc.checkFare(); // 오류. 오버라이딩 메소드 아니고 자체 메소드임. 사용하려면? 강제타입변환
		
		//강제타입변환
		Bus bus2 = (Bus) vhc; // 변환하고자하는 클래스 캐스팅괄호
		
		bus2.run();
		bus2.checkFare();
		
		
		System.out.println("==========================");
		
		//객체 타입 확인 : instanceof
		
		driver.drive(bus);
		driver.drive(taxi); // if문 충족x
	}
}
