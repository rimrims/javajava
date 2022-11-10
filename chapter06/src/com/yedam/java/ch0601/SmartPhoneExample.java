package com.yedam.java.ch0601;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone(); // 객체 생성하면서 iphone14Pro가 힙 영역에 생성. 스택 영역에 객체의 주소가 저장됨.
		
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name + "입니다.");
		
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		System.out.println("==============================================");
		
		SmartPhone zfilp4 = new SmartPhone();
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zfilp4.name); // String이니까 초기값 null
		
		zfilp4.name = "zflip4";
		zfilp4.maker = "삼성";
		zfilp4.price = 900000;
		
		zfilp4.call();
		zfilp4.hangUp();
		
		System.out.println("==============================================");
		
		System.out.println(iphone14Pro); // 객체는 정보가 뜨는 게 아니라 주소가 뜸.
		System.out.println(zfilp4);
	}
}
