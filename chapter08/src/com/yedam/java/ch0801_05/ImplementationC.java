package com.yedam.java.ch0801_05;

public class ImplementationC implements InterfaceC { // 인터페이스 A,B,C 모두 구현해줘야함

	@Override
	public void methodA() {
		System.out.println("methodA 실행");

	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");

	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");

	}

}
