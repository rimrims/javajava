package com.yedam.java.ch0701_04;

public class Compute extends Calculator{ // 상속

	@Override // 우클릭 소스에서 자동작성
	double areaCircle(double r) {
		System.out.println("Compute 오버라이드 실행");
		return r*r*Math.PI;
	}

	
}
