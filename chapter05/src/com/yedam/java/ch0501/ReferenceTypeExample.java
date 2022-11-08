package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// null과 NullPointerException
		String str = null;
//		System.out.println("길이 : " + str.length()); // NullPointerException
		// 실행해보기 전까지는 오류 모름.
		
		//String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
			// 객체 '하나'의 주소를 참조변수가 공유한 것
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2가 문자열이 같음");
		}
		
		
		System.out.println("------------------------------------");
		
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		} // 서로 다른 객체의 주소를 참조함.
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 문자열이 같음");
		} // 그러나 문자열 자체는 같음(실제로 들고 있는 값 비교)
	}
}
