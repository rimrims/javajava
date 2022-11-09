package com.yedam.java.ch0601;

public class CarExample {
	public static void main(String[] args) { // 실행파일에는 메인이 꼭 있어야.
		Car car1 = new Car(); //클래스 변수 = new 클래스(); => 생성자 호출 => 객체생성
		System.out.println("최대 스피드 : " + car1.maxSpeed);
		System.out.println("색깔 : " + car1.color); // 필드 호출
		car1.run(); // 메소드 호출
		
		System.out.println("--------------------------------------");
		
		Car car2 = new Car(); // 같은 클래스를 참조해서 새로운 인스턴스 생성 -> 위와 동일한 객체 아님
		System.out.println("최대 스피드 : " + car2.maxSpeed);
		System.out.println("색깔 : " + car2.color); // 필드 호출
		car2.run(); // 메소드 호출
		
		System.out.println("--------------------------------------");
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조함");
		}
		if(car1 != car2) {
			System.out.println("car1과 car2는 다른 객체를 참조함");
		}
		
		// 스택에서 car1 호출 -> 메소드 영역 가서 클래스(설계도)봄 -> 힙 영역에 새로운 인스턴스 생성
		// 스택에서 car2 호출 -> 메소드 가서 클래스(설계도)봄 -> 힙 영역에 새로운 인스턴스 생성
		// => 서로 다른 객체 생성. 같은 클래스라도 각 인스턴스 수정가능. 클래스를 수정하는 경우 적음
		// ex) 티볼리 만들기 (같은 설계도, 다른 옵션)
	}
}
