package com.yedam.java.ch0601;

public class ConstantNo {
	
	//필드
	static final double PI = 3.14; // final : 값 고정됨, 관례처럼 대문자, 언더바로 씀
	static final int EARTH_ROUND = 46250;
	static final int LIGHT_SPEED = 127000;
	
	String words = "This is Java";
	char word = 'Y';
	
	//생성자
	
	//메소드
	//static 필드의 사용 범위
	static void getCircle(int radius) { // 정적 메소드
		//원넓이 : pi * r * r
		System.out.println("원의 넓이 : " + (PI*radius*radius)); // 정적 필드를 가져와서 사용, 매개변수있음
		
	}
	
	//메소드에 static 필드 호출
	public void allData() {
		double result = PI + EARTH_ROUND + LIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
		String getWord = words + String.valueOf(word); // 불가능.
	}
}
