package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		/* 자동 타입 변환 : 작은 타입 -> 큰 타입 변환 (값 손실 x)*/
		byte byteValue = 10;
		//char intValue = byteValue; // 오류. char는 음수 안됨
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		//강제 타입 변환
		intValue = 44032; //유니코드
		charValue = (char)intValue;
		System.out.println(charValue); //가 출력
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); // 값 손실 일어남
		
		//정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y; // 연산하면서 int타입됨. byte에 안 들어감
		int result2 = x + y; // 이 방법이 제일 자연스러움
		byte result3 = (byte)(x+y);
		System.out.println(result2 + "," + result3);
		
		char charValue1 = 'A'; // 유니코드 '65'
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드 : " + intResult);
		System.out.println("출력문자 : " + (char)intResult); // 유니코드 '66'
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;		
		long longResult = value1 + value2 + value3; //가장 큰 타입에 넣어줘야.
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1; // 연산하면서 double됨. int에 안 들어감
		
		int intVar1 = 10;
//		int resultVar1 = intVar1/4;
		double resultVar1 = intVar1/4.0; // 연산값 하나를 double타입으로 바꿈
		System.out.println("10/4 결과 : " + resultVar1); // 2.5
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1 / y1; // 연산값 하나를 강제타입변환.
		System.out.println("1/2 결과 : " + result1); // 0.5
		
		// 문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8"; // 한 글자만 문자열로 바꾸면 string으로 값 받아오기 가능.
		System.out.println(str1); // 128
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3); // 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4); // 1010
		
		//기본타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		String strV1 = String.valueOf(10); // String 변환
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23; // String변환 편법
		System.out.println(strV4);
	}

}
