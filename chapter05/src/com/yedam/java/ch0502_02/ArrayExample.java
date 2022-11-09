package com.yedam.java.ch0502_02;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		
		//다차원 배열
		
		int[][] mathScores = new int[2][3]; // int[]의 배열이 값인 배열
											// int 배열 3개가 2개.
		
		//1. 변수 사용함
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores["+i+"]");
			int[] mathScore = mathScores[i];
			
			for(int j=0; j<mathScore.length; j++) {
				System.out.print("\t mathScore["+ j + "] :");
				System.out.println(mathScore[j]);
			}
		}
		
		System.out.println("-----------------------------------------");
		
		//2. 변수 사용 x
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores["+i+"]");
			
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.print("\t mathScores[" + i + "][" + j + "] :");
				System.out.println(mathScores[i][j]);
			}
		}		
		
		System.out.println("------------------------------------------");
		
		int[][] scoreList = {
								{86, 65},
								{58, 95, 73}
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for(int j=0; j<scoreList[i].length; j++) {
				System.out.print(scoreList[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		int[][] englishScore = new int[2][]; // 서랍장 칸 2개
		englishScore[0] = new int[3]; // 내부 칸막이 3개
		englishScore[1] = new int[2]; // 		  2개
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.print("englishScore[" + i + "]" + "[" + j + "] : ");
				System.out.println(englishScore[i][j]);
			}
		}
		
		System.out.println("------------------------------------------");
		
		//String 배열
		
		String[] strArray = new String[3];
		strArray[0] = "Java"; // java객체생성
		strArray[1] = "Java"; // 힙 영역에 java객체 있는지 확인 후 같은 주소 참조
		strArray[2] = new String("Java"); // new연산자 붙으면 힙 영역 확인x, 바로 새로운 객체 생성
		
		System.out.println(strArray[0] == strArray[1]); // true. 같은 주소 참조하니까
		System.out.println(strArray[1] == strArray[2]); // false. 문자열 자체는 같지만 다른 주소.
		System.out.println(strArray[1].equals(strArray[2])); // true. 문자열 자체 비교
		
		System.out.println("------------------------------------------");
		
		//for문으로 배열 복사
		int[] oldIntAry = {1, 2, 3};
		int[] newIntAry = new int[5];
		
		for(int i=0; i < oldIntAry.length ; i++) { // 배열 복사할 때는 작은 쪽에 크기 맞춤(oldIntAry 기준)
			newIntAry[i] = oldIntAry[i];
		}
		
//		for(int i=1; i < oldIntAry.length ; i++) { // 
//			newIntAry[i] = oldIntAry[i];
//		}
		
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		
		System.out.println("------------------------------------------");
		
		//System.arraycopy()로 배열 복사
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry,0,newStrAry,2,oldStrAry.length);
		//복사할 배열,복사할 배열의 시작 인덱스,새로운 배열,원본데이터에서 몇개의길이복사할건지.
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		System.out.println("------------------------------------------");
		
		//향상된 for문 : 배열의 모든 값을 사용해야 할 때. (인덱스는 필요없을 때)
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
//		int index = -1;
		for(int score : scores) { // 값을 담을 임시 배열 : 값을 가지고 오고 싶은 배열
			System.out.println(score);
			sum += score;
//			System.out.println("인덱스 : " + ++index);
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}
}
