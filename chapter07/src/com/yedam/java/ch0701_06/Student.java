package com.yedam.java.ch0701_06;

//public final class Student { // 상속되지 않는 클래스
public class Student { 

	//메소드
	public void setScore() {
		System.out.println("성적을 입력합니다.");
	}
	public final void getScore() { // 오버라이딩 불가
		System.out.println("성적을 출력합니다.");
	}
}
