package com.yedam.java.ch0401;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		// 기본 if문
		int score = 90;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		System.out.println("if문 상관없이 실행됩니다.");
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
//		if(score < 90) System.out.println("점수가 90보다 작습니다."); // 허용되긴 함.
//		if(score < 90)
//			System.out.println("점수가 90보다 작습니다."); // 얘도 허용되긴 함. 한 줄까지
		
		System.out.println("------------------------------------------");
		
		//if-else문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println("------------------------------------------");
		
		//if-else if-else문 : 조건이 연계되어있는지 확인 후 세운다
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score >= 80) { // score < 90 && score >= 80
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score >= 70) { // score < 80 && score >= 70
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다.");
		}else { // score < 70
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("------------------------------------------");
		
		/* p.139
		 1) 0.0 <= Math.random() < 1.0 //Math.random()의 범위
		 2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		 3) (int)0 <= (int)(Math.random() * 10) < (int)10
		 4) (int)0 + 1 <= (int)(math.random() * 10) + 1 < (int)10 + 1
		 5) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		 
		 => (int)(Math.random() * count ) + start // 공식처럼 익힌다.!!!!
		 										// count : 가져 올 값 개수
		 										// start : 시작하는 수
		  
		 */
		// 주사위
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		
		System.out.println("------------------------------------------");

		// switch문
		num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		case 1: // num의 값이 1일 때
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default :
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("------------------------------------------");
		
		//break문이 없는 case : break가 없으면 밑으로 쭉 실행. ex) 랜덤값 9인 경우, 9,10,디폴트까지 실행
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시각 : " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		System.out.println("------------------------------------------");
		
		//char타입의 switch문 : 사용자가 소문자와 대문자 입력해도 같은 값 나오게
		// 쇼핑몰 : 우수회원 - A / 일반회원 - B / 손님
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");
		}
		
		System.out.println("------------------------------------------");
		
		//String 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}
}
