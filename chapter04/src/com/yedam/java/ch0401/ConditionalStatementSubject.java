package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		// 문제1 ) 두 개의 정수가 주어졌을 때
		//		  두 정수의 합이 자연수이면 (1 이상의 정수)
		//		  'Natural Number'를 출력하는 코드를 작성하세요.
		
		int a = 8;
		int b = 2;
		
		if(a + b > 0) {
			System.out.println("Natural Number");
		}
		
		// 문제2 ) 두 개의 정수가 주어졌을 때
	 	//		  두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요.
		
		if(a > b) {
			System.out.println("a > b");
		}else if(a < b) {
			System.out.println("a < b");
		}else {
			System.out.println("a = b");
		}
		
		// 문제3 ) 체질량 지수인 BMI에 따라 비만도를 네 가지 단계롤 구분
		// 		 BMI = 체중 / (키(단위:m) * 키(m)) 
		//		 저체중(18.5미만), 정상(18.5 이상 25미만),
		//		 과체중(25이상 30미만), 비만(30이상)
		
		double m = 170;
		double kg = 80;
		double BMI = kg / (m/100 * m/100);
		
		if(BMI < 18.5) { // 범위 지정하는 조건문은 switch문으로 안됨! 정확한 값으로 떨어져야 함.
			System.out.println("저체중");
		}else if(BMI < 25) {
			System.out.println("정상");
		}else if(BMI < 30) {
			System.out.println("과체중");	
		}else {
			System.out.println("비만");
		}
		
		// 문제4 ) 선택한 단의 6번째 값을 출력하는 코드
//				  ex) 2단일 경우 2 X 6 = 12
//				  단, 출력문에는 변수 사용하지 않는다.
		
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
//			int num = (int)(Math.random()*9)+1;
			
			switch(num) {
			case 1:
				System.out.println("1 X 6 = 6");
//				System.out.printf("%d X 6 = %d",1 , 1*6);
				break;
			case 2:
				System.out.println("2 * 6 = 12");
				break;
			case 3:
				System.out.println("3 * 6 = 18");
				break;
			case 4:
				System.out.println("4 * 6 = 24");
				break;
			case 5:
				System.out.println("5 * 6 = 30");
				break;
			case 6:
				System.out.println("6 * 6 = 36");
				break;
			case 7:
				System.out.println("7 * 6 = 42");
				break;
			case 8:
				System.out.println("8 * 6 = 48");
				break;
			default:
				System.out.println("9 * 6 = 54");
			}
			
			// 문제5 ) 다음과 같이 점수 범위에 따라 등급을 구분
			//		  해당 점수에 대한 등급을 출력하는 코드
			//		  90점 이상 100점 이하 : A등급,
			//		  80점 이상 90점 미만 : B등급,
			//		  70점 이상 80점 미만 : C등급,
			//		  60점 이상 70점 미만 : D등급,
			//		  60점 미만 : E등급
			
			int d = 90;
			int score = d / 10;

			switch(score) {
			case 10:
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println(("C등급"));
				break;
			case 6:
				System.out.println(("D등급"));
				break;
			default:
				System.out.println("E등급");
			}
					
	}

}
