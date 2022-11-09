package com.yedam.java.ch0603;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	/*
	public Car(String model, String color) { // 매개변수로 값 받아옴. 생성자 만들어짐, 받아와서 값 덮어씀
		this.model = model; // this: 필드의 model가리킴.
							// (클래스의 필드값x, 인스턴스 생성 후 그 인스턴스의 필드값 수정)
							// 메소드와 생성자 안에서만 this 가능
		this.color = color; // this는 힙 영역의 인스턴스를 건드리는것. 클래스 수정되는 것x
	}
	*/
	
//	======================================================================
	public Car() {
		
	} // 기본 생성자 (기본값으로 인스턴스 호출하려고 할 때, 이미 다른 생성자 있으면 만들어줘야함)
	
	//생성자 오버로딩
	public Car(String model) {
//		this.model = model;
//		this.company = "웨스턴" ; // this는 오버로딩 가장 첫 줄에
		this(model, "은색" , 250);
		// this.~ : 인스턴스의 필드 호출 
		// this(괄호): 인스턴스의 생성자 호출
	}
	
	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	
	public Car(String model, String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
