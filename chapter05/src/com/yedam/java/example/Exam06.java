package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		// 책 201p 6번

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] scores = null; // while문안에 선언하면 안됨! 배열에 학생수 받아 놓은 게 null값이 됨. 널포인터익셉션 오류 
		int studentNum = 0;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) { // switch문으로 하려면 boolean으로
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break; // break는 본인 반복문만 끝냄. while자체는 안 끝남
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i , scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					//최고점수
					if(max < scores[i]) {
						max = scores[i];
					}
					
					//총합
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : " + sum/(double)scores.length);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료");

	}
}
