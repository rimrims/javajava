package com.yedam.java.ch0603;

public class MainExample {
	public static void main(String[] args) {
		Car myCar = new Car("모닝","하늘색");  // 매개변수로 값 줌.
											// 클래스는 그대로지만 힙 영역의 인스턴스(객체)의 속성이 대체된 것.
		
		System.out.println("제조회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		
		System.out.println("-------------------------------------------");
		
		Car newCar = new Car(); // 같은 클래스의 다른 인스턴스 호출(기본생성자)
//		오류 : The constructor Car() is undefined : 생성자가 정의되지 않음. 기본 생성자 만들면 호출 가능
		
		System.out.println("제조회사 :" + newCar.company);
		System.out.println("모델명 : " + newCar.model);
		System.out.println("색깔 : " + newCar.color);
		
		System.out.println("-------------------------------------------");
		
		Car subCar = new Car("아이오닉", "하얀색");
		System.out.println("제조회사 : " + subCar.company);
		System.out.println("모델명 : " + subCar.model);
		System.out.println("색깔 : " + subCar.color);
	}
}
