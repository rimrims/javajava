package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value); // 6자리 표기. 앞은 공백으로
		System.out.printf("상품의 가격:%-6d원\n", value); // 오른쪽부터 6자리
		System.out.printf("상품의 가격:%06d원\n", value); // 6자리 표기. 앞은 0으로 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10, area);

		Scanner sc = new Scanner(System.in); // ctrl+shift+o -> java.util.Scanner

		/*
//		String str1 = sc.nextLine(); // 콘솔창에서 입력 가능 한줄씩
		String str = sc.next(); // nextLine은 엔터키 값까지 받음. next는 엔터키 값 x. 두 개 중복 사용 불가
		int var = sc.nextInt(); 
		System.out.println("입력 : " + str + "," + var);
		*/
		
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("입력 : " + (x+y));
		*/
		
		/*
		System.out.print("첫번째 : "); // 
		String x = sc.nextLine();
		System.out.print("두번째 : ");
		String y = sc.nextLine();
		int result = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println("결과 : " + result);
		*/
		
		String inputData;
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열:  %s\n", inputData);
			if(inputData.equals("exit")) { // inputData == "exit"면,
				break;
			}
		}
		System.out.println("종료");
	}

}
