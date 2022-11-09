package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); // 리턴값과 매개변수 없음
		
//		myCalc.plus(1.5, 5.6); // 타입에 맞게 매개변수 값 넣어줌.
//		myCalc.plus(5, 6); // 되지만 리턴값 x
		int sumRes = myCalc.plus(5, 6); // 자동타입변환가능 (float,double,int로 바로 받는 것 가능)
		System.out.println("sum : " + sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide : " + diviRes);
		
		System.out.println("-----------------------------------");
		//
		
		Computer myCom = new Computer(); // 객체 생성
		
		int[] values1 = {1,2,3}; // 배열 만듦
		int intResult1 = myCom.sum1(values1); // 배열 통째로 인스턴스에 넘겨줌
		System.out.println("intResult1 : " + intResult1);
		
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5}); // 변수 선언과 동시에 인스턴스에 배열 넘김.
		System.out.println("intResult2 : " + intResult2);
		
		int intResult3 = myCom.sum2(1,2,3); // 숫자 나열만 해도 호출됨. 자동으로 배열로 바뀜
		System.out.println("intResult2 : " + intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5);
		System.out.println("intResult4 : " + intResult4);
		
		//
		
		myCalc.execute();
		
		//
		
		double result1 = myCalc.areaRectangle(10); // 정사각형 넓이 구하는 메소드 호출
		
		double result2 = myCalc.areaRectangle(10, 20); // 직사각형 넓이 구하는 메소드 호출
				
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}
}
