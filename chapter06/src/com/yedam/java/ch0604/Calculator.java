package com.yedam.java.ch0604;

public class Calculator {
	//매소드
	void powerOn() { // 리턴값 매소드이름()
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y){ // 리턴값 매소드이름(매개변수)
		int result = x + y;
		return result;
		// return: 인스턴스에서 매개변수를 넣어서 메소드 실행. 새로운 변수에 리턴값을 받는다.
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y; // 정수 나눴을 때 실수형인 경우 대비
		return result; 
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
//	------------------------------------------------------------

	double avg(int x,int y){
		int sum = plus(x,y);
		double result = sum / 2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10); // 메소드 안에서 메소드 호출
		println("실행결과 :" + result); // 메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	//메소드 오버로딩
	
	double areaRectangle(double width) {
		return width * width; // 정사각형 넓이
	}
	
	double areaRectangle(double width, double height) {
		return width * height; // 직사각형 넓이
	}
	
	
	
}
