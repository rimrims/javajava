package com.yedam.java.cj0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// 배열 선언 -> 모든 타입을 값으로 가질 수 있음
		int[] intAry = null; // 객체라서 null값 가능
//		System.out.println("intAry[0] : " + intAry[0]); // NullPointerException
		// 애초에 null인데 왜 접근?
		
		//값을 초기화하면서 배열을 생성
		int[] scores = {83, 90, 87};
		
		//배열 값 프린트
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		//배열값 총합
		int sum = 0;
		for(int i=0; i<3; i++) { // index는 0부터, 크기(길이)는 1부터 
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		//주의사항
		int[] scoreList;
//		scoreList = {83, 90, 87}; // 불가
		scoreList = new int[] {83, 90, 87}; // 배열도 객체기 때문에 new연산자를 이용해서 값 줘야함.
		
		//클래스 관련
		User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;
		
		/* js에서는
		let user = {
				name : '홍길동',
				age : 25,
				height : 175.7
		};
		*/ //java에서는 안됨
	}
	
}
