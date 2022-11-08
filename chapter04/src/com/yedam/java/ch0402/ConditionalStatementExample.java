package com.yedam.java.ch0402;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		
//		for(;;) {
//			System.out.println("루프 반복");
//		}

		int x = 1;
		for (; x <= 100; x += 15) { // 1 16 31 46 61 76 91
			System.out.println("출력");
		}
		System.out.println("x : " + x); // for문이 false돼서 106

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1~100까지의 합계 : " + sum);

		// float 타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) { // 정확한 값 안 나옴. 가능하면 int로 타입변환하고 사용.
			System.out.println(f);
		}

		// 구구단을 2~9단까지 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}

		// While문

		// 1 ~ 10까지 출력
		int cnt = 1; // 조건식에 필요한 변수를 밖에서 꼭 선언한다!
		while (cnt <= 10) {
			System.out.println(cnt);
			cnt++; // 증감식 필수
		}

		cnt = 0;
		while (cnt <= 9) {
			cnt++;
			System.out.println(cnt);
		}

		// 1부터 100까지 출력, 1부터 100까지 합을 출력
		sum = 0;
		cnt = 1;
		while (cnt <= 100) {
			System.out.println(cnt);
			sum += cnt;

			cnt++; // 증감식은 제일 마지막에!
		}
		System.out.println("1~" + (cnt - 1) + "까지 합 : " + sum);

		// 주사위 두 개를 굴립니다. 합이 3이 될 때까지 계속 굴림.

//		int a1 = (int)(Math.random()*6+1);
//		int a2 = (int)(Math.random()*6+1);
//		
//		if(a1 + a2 == 3) {
//			
//		}

		int index = 1;

		while(index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		} // false라서 실행 x
		
		do { // 무조건 1번은 실행되어야 할 때
			System.out.println("do~while 반복문이" + index + "번 실행됩니다.");
		}while(index != 1);
		
		//break문으로 while문 종료
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) break;
		}
		
		// 이중 for문에서 break문 사용
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "=" + lower);
				if(lower == 'g') {
					break; // 바깥과 안 for문 중 어디를 stop해야하는지 확인하고 break 걸어주기
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		System.out.println("-----------------------------------------");
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) { // 바깥 for문에 이름을 붙임.
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "=" + lower);
				if(lower == 'g') {
					break Outter; // 바깥 for문을 stop시키겠다.
				}
			}
			System.out.println("1) 안쪽 for문 종료"); // 출력 x.
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		//continue를 사용한 for문
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue;
			System.out.println(i);
		}
//			if(i%2 != 0) {
//				System.out.println(i);
//			}
			
	}
}
