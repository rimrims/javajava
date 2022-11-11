package com.yedam.java.ch0702;

public class App3 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//bus, taxi - > vehicle 부모클래스 모심
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//= driver.drive(Vehicle vehicle = new Bus());
		driver.drive(bus);
		driver.drive(taxi);
	}

}
