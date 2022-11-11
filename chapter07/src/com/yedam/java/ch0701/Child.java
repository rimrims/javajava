package com.yedam.java.ch0701;

public class Child extends Parent{
	
	//필드
	public String lastName;
	public int age;
	
	//생성자
	
	//메소드
	
	@Override // : 자식이 부모 클래스 메소드 재정의. 부모클래스랑같이보기
	public void method1() { // 리턴타입, 메소드이름, 매개변수는 그대로 들고가야함. 중괄호내만 변경가능.
		System.out.println("Child 클래스 재정의된 method1 호출");
	}
	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
}
