package com.yedam.java.ch0701_03;

public class App {
	public static void main(String[] args) {
		
		Member member = new Member("고길동","123123-456456"); // 자식 클래스 인스턴스화
		
		//부모 객체의 필드 사용
		System.out.println("name : " + member.name);
		System.out.println("ssn : " + member.ssn);
		
		//자식 객체의 필드 사용
		System.out.println("memberNo : " + member.stdNo);
	}
}
