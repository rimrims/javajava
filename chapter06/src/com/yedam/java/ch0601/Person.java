package com.yedam.java.ch0601;

public class Person {
	final String nation = "korea"; // final붙이면 상수처럼 값이 변하지 않음. 무조건 korea
	final String ssn; // 주민등록번호
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn; // 인스턴스 만들면서 매개변수에 넣은 값이 final로(상수) 고정돼버림
		this.name = name;
	}
}
