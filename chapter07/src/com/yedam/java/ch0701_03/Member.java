package com.yedam.java.ch0701_03;

public class Member extends People{
	
	
	public int stdNo;
	
	public Member(String name,String ssn) { // 부모 클래스의 필드를 매개변수로.
		super(name,ssn); // 자식 클래스에서 부모 클래스 사용하려면 부모 클래스 생성자도 필요. (부모객체도 생성돼야함)
						// name과 ssn이 부모 필드로 들어감.
						// 기본 생성자는 자동으로 super()가 생성됨.
		this.stdNo = stdNo;
	}
}
