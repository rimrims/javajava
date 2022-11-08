package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		// 로또번호 예측 프로그램 - 6개
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int count = 0;

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.새로고침|2.번호예측|3.번호삭제|4.번호출력|5.분석|6.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또번호를 담을 수 있는 배열 초기화
				numList = new int[6]; // numlist에 값 있든말든 초기화
			} else if (selectNo == 2) { // 1~45 중 랜덤한 값을 하나씩 가져옴
				if(count < numList.length) {
					int num = (int)(Math.random()*45)+1;
					numList[count++] = num;
					System.out.println("현재 가져온 수의 개수 : " + count);
				}else {
					System.out.println("더 이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존 값 중 가장 최근 값 삭제

			} else if (selectNo == 4) { // 배열의 값을 전부 출력

			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇 번 중복되었는지

			} else if (selectNo == 6) {
				run = false;
			} else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("메뉴를 확인하고 다시 입력하세요.");
			}
		}
	}
}
