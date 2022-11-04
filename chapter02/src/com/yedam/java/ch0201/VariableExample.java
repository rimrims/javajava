package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		// main치고 컨트롤스페이스 누르면 자동 생성
		/* 변수의
		   사용 범위 */
		
		int value1 = 15;
		
		if(value1 > 10) {
			int value2;
			value2 = value1 - 10;
		}
		
		int result = value1 + value2 + 5; // 변수 선언 위치가 잘못되어 오류
		
		System.out.println(value1 +", "+ value2+", " + result);
		
		//==========================================
		
		int v1 = 0;
		if(v1 == 0) {
			v1 = 1;
			int v2 = 0;
			if(v2 == 0) {
				v2 = 2;
				int v3 = v1 + v2;
				System.out.println(v1 + "+" + v2 + "=" + v3);
			}
			System.out.println(v1 + "+" + v2 + "=" + v3);
		}
		System.out.println(v1 + "+" + v2 + "=" + v3);
	}
}
