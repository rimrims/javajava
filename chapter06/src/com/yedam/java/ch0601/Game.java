package com.yedam.java.ch0601;

public class Game {
	
	//필드 (인스턴스화 되면 인스턴스 필드로 지칭함)
	static String GameName = "마인크래프트"; // 정적 필드 : 객체 생성하지 않고 바로 호출 가능.
//	String GameName = "마인크래프트";
	String server = "한국";
	String id;
	String passwd;
	
	//생성자
	
	//오버로딩
	public Game() { // 기본 생성자 (클래스 기본값으로 객체 생성)
		
	}
	public Game(String id) {
		this.id = id;	//정확히 얘기하면 클래스의 필드가 아니라 '인스턴스 필드'에 매개변수 내용 넣음.
	}
	public Game(String id,String passwd) { // 매개변수 개수
		this.id = id;
		this.passwd = passwd;
	}
	
	//메소드 -> 인스턴스화 -> 인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " + GameName);
		System.out.println("id : " + id);
		System.out.println("password : " + passwd);
	}
	void getInfo(String temp) {
		
	}
	
}
