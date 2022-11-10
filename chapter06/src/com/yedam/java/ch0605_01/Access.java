package com.yedam.java.ch0605_01;

public class Access {
	//대상 : 모든 속성, 필드, 메소드, 생성자 등등 자바의 모든 전부
	
	//public : 누구나, 어디서든 접근 가능
	//private : 내가 속한 클래스 내부에서만 사용 가능
	//protected : 상속받은 상태에서 부모-자식간 사용 가능(패키지 달라도 사용 가능)
	//			 같은 패키지 내에서 사용가능
	//default : 같은 패키지 내에서 사용가능, 패키지 다르면 사용 불가
	
	//필드
	public String free;
	private String privacy;
	protected String parent;
	String basic; // 안 쓰면 default임.
	
	//생성자
	
	//메소드
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy(); // 클래스 내에서만 사용 가능한 메소드를 다른 메소드에 넣어서
				  // 다른 클래스에서도 사용 가능하도록 함.
	}
	
	private void privacy() {
		System.out.println("접근 불가합니다.");
	}
}
