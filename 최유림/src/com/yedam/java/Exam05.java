package com.yedam.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int cnt = 0; // 배열에 값 몇 개 넣었는지.

		while (run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료");
			System.out.println("메뉴> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("주사위 크기> ");
				int a = Integer.parseInt(sc.nextLine());
					if(a<5 || a>10) {
						System.out.println("범위는 5~10입니다. 재입력해주세요.");
					}
				numList = new int[a];
				cnt = 0;
			}else if(selectNo == 2) {
				for(int i=1; i<=numList.length; i++) {
					int b = (int)(Math.random()*6)+1;
					numList[i] = b;
					cnt++;
					if(b == 5) {
						System.out.printf("5가 나올 때까지 주사위를 %d번 굴렸습니다.\n",cnt);
						break;
					}
				}
			}else if(selectNo == 3) {
				int[] list = new int[numList.length];
				
				for(int i=0; i<cnt; i++) {
					int index = numList[i] - 1;
					list[index]++;
				}
					
				for(int j=0; j<list.length; j++) {
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (j+1), list[j]);
				}
			}else if(selectNo == 4) {
				for(int i=0; i<=list.length; i++) {
					
				}
				
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}

}
