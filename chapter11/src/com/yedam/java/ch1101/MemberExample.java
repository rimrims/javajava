package com.yedam.java.ch1101;

public class MemberExample {
	public static void main(String[] args) {
		//객체 동등 비교 조건 -> 값이 같다 or 다르다
		//강제 타입 변환
		//Object -> 여러 클래스
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		}else {
			System.out.println("obj1과 obj2는 같지 않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj2는 동등");
		}else {
			System.out.println("obj1과 obj2는 같지 않음");
		}
	}
}
