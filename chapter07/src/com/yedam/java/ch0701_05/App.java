package com.yedam.java.ch0701_05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly();
		
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
	}

}
