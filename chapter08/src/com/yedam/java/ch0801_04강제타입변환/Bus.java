package com.yedam.java.ch0801_04강제타입변환;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}
	
	public void checkFare() { // 구현 클래스 자체 메소드
		System.out.println("승차요금을 확인합니다.");
	}

}
