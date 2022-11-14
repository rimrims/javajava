package com.yedam.java.ch0801_02;

public class MyClassExample {
	public static void main(String[] args) {
//		p.380 코드랑 같이 확인
		
		System.out.println("1)-----");
		
		MyClass mc = new MyClass();
		mc.rc.turnOn(); // 객체안의 객체의 메소드
		mc.rc.turnOff();
		
		System.out.println("2)-----");
		MyClass mc2 = new MyClass(new Audio()); // 생성자 내의 메소드 실행됨
		
		System.out.println("3)-----");
		
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("4)-----");
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television()); // 메소드 통해 구현객체 생성
		
		
		
		
	}
}
