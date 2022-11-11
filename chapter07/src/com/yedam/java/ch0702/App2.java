package com.yedam.java.ch0702;

public class App2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire KTire = new KumhoTire("Left",20);
		
		//Tire 객체에 자식 객체인 hTire
		//tire
		Tire tire = hTire; // Tire 규격(부모클래스) 다 쓰되 자식에서 오버라이딩한 내용으로 쓰고싶다.
		System.out.println(tire.roll());
		
		tire = KTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
		
		//필드의 다형성 : 한가지 타입으로 여러개의 필드
//		1. 상속
//		2. 자식클래스에서 오버라이딩
//		3. 다양한 필드로 수정가능
		
	}
}
