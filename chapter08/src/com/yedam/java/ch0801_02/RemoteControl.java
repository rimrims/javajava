package com.yedam.java.ch0801_02;

public interface RemoteControl { // 기본 설계도
	
	// 상수
	//public static final PI = 3.14;
	
	// 추상 메소드
	//public void method1();
	
	// 기본 설계도
	// 대규모 프로젝트(번역)
	// A : 영어 -> 한글(메소드 이름: 번역 )
	// B : 영어 -> 일본어(메소드 : method1())
	// C : 영어 -> 중국어(메소드 : method2())
	
	// 프로젝트 완료
	// => 똑같은 메소드 이름으로 구현
	
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // 인터페이스에서는 static final 안 써도 같은 성질 가짐.
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); // 인터페이스에서는 abstract 안 써도 같은 성질 가짐.
}
