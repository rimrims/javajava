package com.yedam.java.ch0601;

public class Car { // 하나의 파일은 하나의 클래스를 가짐.
	
	//필드 : 속성
	int maxSpeed = 100;
	String color = "red";
	
	//생성자 : 메소드와 다른 점 - 리턴값 존재 x, 본인 이름 존재 x
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	//메소드 : 동작(기능). 본인의 이름 존재. 리턴값 존재
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
}
