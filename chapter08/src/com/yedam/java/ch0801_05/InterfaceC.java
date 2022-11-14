package com.yedam.java.ch0801_05;

public interface InterfaceC extends InterfaceA, InterfaceB{ // 반응이 없는 이유: 인터페이스는 상속만 받을 수 있음. 재정의는 클래스에서!
	public void methodC();
}
