package com.yedam.java.ch0402;

import java.util.Scanner;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		// 문제1) 책 161p 5번
		//*
		//**
		//***
		//****
		//*****
		
		String tree = ""; // 문자열도 누적 가능
		for(int i=1; i<=5; i++) {
			tree += "*"; // 문자열 결합 이용
			System.out.println(tree);
		}
		
		for(int i=1; i<=5; i++) { // line
			for(int j=1; j<=i; j++) { // "*" 출력
				System.out.print("*"); // 줄바꿈 안되도록 print로 출력
			}
			System.out.println(); // 줄바꿈.
		}
		
		System.out.println("-------------------------------");
		
		//문제2 ) for문을 이용해서 1부터 100까지의 정수 중에서
		//		2의 배수가 아닌 숫자의 개수를 구하세요.
		
		int cnt = 0; // 전역변수로 선언
		/*
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		*/
		
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) continue; // 조건 만족하면 다시 for문으로 돌아감
			cnt++;
		}
		System.out.println(cnt);
		
		System.out.println("-------------------------------");
		
		//문제3) 책 161p 4번
		//		중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해 중
		//		첫 번째로 구해지는 값을 (x,y)의 형태로 출력
		//		단, x와 y는 10 이하의 자연수
		
		Outter:for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println(x + "," + y);
					break Outter;
				}
			}
		}
		
		System.out.println("-------------------------------");
		
		// 문제4) do~while문과 Math.random() 함수를 이용
		//		 1 ~ 10의 정수 중 7이라는 수가 나올 때까지 숫자를 출력
		
			int s;
			do {
				s = (int)(Math.random()*10)+1;
				System.out.println(s);
			}while(s != 7); // true면 do로 돌아감. false가 되면 반복문 종료
			
			System.out.println("-------------------------------");
			
			// 문제5 ) 책 161p 3번
//			while문과 Math.random() 함수를 이용
//			2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력
//			숫자의 합이 5일 경우에 종료, 아닌 경우에는 계속 던짐
//			최종으로 주사위를 몇 번 던졌는지 횟수를 출력
//			숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)
			
			int count = 0;
			int num1 = 0;
			int num2 = 0;
			
			while(num1 + num2 != 5) {
				num1 = (int)(Math.random()*6)+1;
				num2 = (int)(Math.random()*6)+1;
				count++;
				System.out.printf("(%d,%d)\n", num1,num2);
				if(num1 + num2 == 5) {
					break;
				}
			}
			System.out.println("주사위를 던진 횟수는 총 " + count + "번 입니다.");
			
			//문제6 ) 책 161p 6번
			//    * -> 1번째 줄, 공백 3,별 1
			//   ** -> 2번째 줄, 공백 2,별 2
			//  *** -> 3번째 줄, 공백 1,별 3
			// **** -> 4번째 줄, 공백 0,별 4
										//공백과 별 더하면 4 된다는 규칙
			
			for(int i=1; i<=4; i++) { // line
				for(int j=1; j<=4; j++) { // 내부 요소(문자 4개)
					if(j<=(4-i)) { // 다시 생각해보기
						System.out.print(" "); // 줄바꿈 방지로 print로
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
			//문제7 ) 161p 7번
			
			boolean run = true;
			int balance = 0;
			Scanner scanner = new Scanner(System.in);
			
			while(run) {
				System.out.println("-------------------------");
				System.out.println("1.예금|2.출금|3.잔고|4.종료");
				System.out.println("-------------------------");
				System.out.print("선택> ");
				int selectNo = Integer.parseInt(scanner.nextLine());
				// 캐스팅괄호로 안되는 이유: nextLine으로 받으면 string(객체-참조타입)이라 기본타입으로 바꾸려면 메소드를 이용. 기본타입끼리, 참조타입끼리는 캐스팅괄호로 가능. 
				if(selectNo == 1) {
					//메뉴 : 예금
					System.out.print("예금액> ");
					int money = Integer.parseInt(scanner.nextLine());
					balance += money;
					
				}else if(selectNo == 2) {
					//메뉴 : 출금
					System.out.print("출금액> ");
					int money = Integer.parseInt(scanner.nextLine());
					balance -= money;
					
				}else if(selectNo == 3) {
					//메뉴 : 잔고
					System.out.println("잔고> " + balance);
					
				}else if(selectNo == 4){
					//메뉴 : 종료
					run = false;
					
				}else {
					//기타입력
					System.out.println("정해진 메뉴(1~4)에서 선택해주세요.");
				}
			}
			System.out.println("프로그램 종료");
	}
}
