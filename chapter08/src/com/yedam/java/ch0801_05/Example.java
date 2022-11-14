package com.yedam.java.ch0801_05;

public class Example {
	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // A만 사용가능
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC(); // 다 가능한 이유 : 인터페이스C는 A와 B를 상속받았기 때문에. 자식은 부모것 사용가능
	}
}
