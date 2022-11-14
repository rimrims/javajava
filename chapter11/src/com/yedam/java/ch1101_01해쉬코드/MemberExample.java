package com.yedam.java.ch1101_01해쉬코드;

import java.util.HashMap;

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
		
		HashMap<Member, String> member = new HashMap<>();
		//ex. new Member("1") -> 주소가 10, 해쉬코드 1
		
		member.put(new Member("1"), "홍길동");
		//ex. new Member("1") -> 주소가 10, 해쉬코드 1
		
		String value = member.get(new Member("1"));
		System.out.println(value);
	}
}
