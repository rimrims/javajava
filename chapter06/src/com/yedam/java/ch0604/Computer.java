package com.yedam.java.ch0604;

public class Computer {
	
	//매소드. 몇 개의 값이 들어올 지 모를 때
	
//	1. 배열 만들어서 호출
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
//	2. 그냥 매개변수 넣어주면 배열로 만들어져서 호출됨
	int sum2(int ... values) { // ... : 몇 개든 받을 수 있음. 뒤에 오는 변수에 배열로 받아짐.
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
