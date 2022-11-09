package com.yedam.java.ch0603;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	public Car(String model, String color) { // 매개변수로 값 받아옴. 생성자 만들어짐, 받아와서 값 덮어씀
		this.model = model; // this: 필드의 model가리킴. 메소드와 생성자 안에서만 this 가능
		this.color = color; // this는 힙 영역의 인스턴스를 건드리는것. 클래스 수정되는 것x
	}
	
	public Car() {}
}
