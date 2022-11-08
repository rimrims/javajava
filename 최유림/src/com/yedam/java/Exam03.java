package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operater = '+';
		
		if(operater == '+') {
			int sum = num1 + num2;
			System.out.println(sum);
		}else if(operater == '-') {
			int a = num1 - num2;
			System.out.println(a);
		}else if(operater == '*') {
			int b = num1 * num2;
			System.out.println(b);
		}else if(operater == '/') {
			int div = num1 / num2;
			System.out.println(div);
		}
	}

}
