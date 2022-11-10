package com.yedam.java.ch0605_03;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member mem = new Member();
		
//		1)mem의 인스턴스 필드에 접근가능한지 확인
//		2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());
	}

}
