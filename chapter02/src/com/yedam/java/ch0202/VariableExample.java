package com.yedam.java.ch0202; // 다른 패키지에서는 이름 동일한 클래스 만들 수 있음

public class VariableExample {

	public static void main(String[] args) {
		// 정수형 byte 타입 -128~127
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		// byte var5 = 128; // int를 byte로 변환할 수 없다
		System.out.println(var1);
		// System.out.println(var5);
		
		//long var60 = 100000000000; // 리터럴로 들어오는 정수값은 모두 int로 인식.
		long var6 = 100000000000L; // 이렇게 써야함.
		long var7 = 1000000; // int내의 값이므로 L 안 붙여도 가능
		
		//정수형 char타입 (유니코드라서 정수형)
		
		char v1 = 'A'; // 작은따옴표에 char타입 담을 수 있음. 큰따옴표x
		//char v10 = 65 와 같음.
		char v2 = '가';
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// String 객체이지만 변수처럼 저장가능
		String name = "홍길동"; //
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length()); // 문자열 길이
		System.out.println(job);
		System.out.println(job.charAt(3)); // 몇번째 문자열 반환할건지
		
		//char VS String
		//char v4 = "A"; // 오류. 작은따옴표로 해야. 큰따옴표는 String으로 인식
		String v5 = ""; // 특수문자, 공백도 가능. 그냥 큰따옴표로 감싸면 됨. char타입은 공백안됨.
		
		String str1 = "누군가 \"안녕\"하면서 인사했다.";
		
		//float
		float num1 = 3.14F; // f붙여야됨
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789; // 같은 수
		
		System.out.println(varF);
		System.out.println(varD); // double타입이 더 정밀한 값
		
		//boolean
		
		boolean stop = ( 1 > 2 ); //true, false, 표현식(1>2 등)도 가능
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}
}
