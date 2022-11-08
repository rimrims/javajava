package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		
		// 실행 시 런 컨피그레이션으로
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("입력값 : " + args[0]);
		String strNum1 = args[0];
		String strNum2 = args[1]; // argument에서 공백 띄워서 두개 넣어줌
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2); // 참조 -> 기본타입으로 파싱
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}
