package com.yedam.java.ch0801_02;

public class MyClass {

	//필드
	RemoteControl rc = new Television();
	
	//생성자
	public MyClass() {
		
	}
	public MyClass(RemoteControl rc) { // 생성자 오버로딩
		this.rc = rc;
		rc.turnOn();
		rc.turnOff(); // 같은 인터페이스로부터 상속받아서 이름 같음. 효율적. 사용하기 편함
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new Audio(); 
		rc.turnOn();
		rc.turnOff();
	}
	void methodB(RemoteControl rc) { // 매개변수를 통해 객체화해서도 사용가능
		rc.turnOn();
		rc.turnOff();
	}
}
