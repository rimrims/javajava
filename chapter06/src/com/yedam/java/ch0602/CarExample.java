package com.yedam.java.ch0602;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car(); // 인스턴스화 (객체 생성)
							  // 생성자가 없는데 어떻게 인스턴스화? 자바가 자동으로 만들어줌
		
		System.out.println("제작회사 : " + myCar.company); //도트 연산자로 필드나 메소드 호출 가능
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed); // Car 클래스에서 값 설정 x, 초기값 0
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		Car newCar = new Car(); // 같은 클래스의 새로운 객체
		System.out.println("새로운 차의 현재속도 : " + newCar.speed); // 초기값
		
		String str = new String("Con");
		
	}
}
