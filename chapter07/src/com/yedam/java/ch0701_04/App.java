package com.yedam.java.ch0701_04;

public class App {
	public static void main(String[] args) {
	
		Compute com = new Compute();
		
		double result = com.areaCircle(10); // 자식에서 오버라이딩 한 메소드로 출력됨
		System.out.println(result);
	}
}
