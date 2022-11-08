package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1 ) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = {10, 53, 26, 85, 75};
		
		int sum = 0;
		double avg = 0;
		for(int i=0; i<array.length; i++) { // 배열 반복문은 인덱스 시작과 같은 0으로 시작.
			sum += array[i];
		}
		avg = sum / (double)array.length; // sum을 모두 구하고 평균 구해야하므로 for문 밖에서
		System.out.printf("배열의 총합은 %d이고 평균은 %.2f입니다.\n",sum,avg);
		
		
		// 문제2 ) 배열의 최댓값 최솟값 구하기
		
		int max = array[0];
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			//최댓값
			if(array[i] > max) {
				max = array[i];
			}
			//최솟값
			if(array[i] < min) { // 각각 다른 if문으로. 최댓값 최솟값 서로 연관성 없음
				min = array[i];
			}
		}
		System.out.printf("배열의 최댓값은 %d이고 최솟값은 %d입니다.\n",max,min);
		
		//문제3 ) 문제2에서 구한 최댓값과 최솟값이 몇 번째 값인지를 구하세요. cf)인덱스값구하기
		
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			if(max == array[i]) {
				maxIndex = i+1; // index는 0부터, 순서(크기)는 1부터 시작하기 때문.
			}
			if(min == array[i]) {
				minIndex = i+1;
			}
		}
		System.out.printf("최댓값 %d는 %d번째, 최솟값 %d는 %d번째입니다. \n",max,maxIndex,min,minIndex);
		
		//문제4 ) 
	}
}
