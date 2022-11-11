package com.yedam.java.ch0701;

import com.yedam.java.ch0701_02.Parent; // 다른 패키지의 클래스를 연결

public class Child2 extends Parent{ // 다른 패키지에서 부모 연결

	//필드
	
	//생성자
	
	//메소드
	void getInfo() {
//		System.out.println(firstName + lastName + bloodType + age);
		//default는 같은 패키지에서는 사용 가능하지만 다른 패키지에서는 사용 불가.
		//그러나 protected는 다른 패키지라도 부모에게 상속받으면 사용 가능
		//public은 다 가넝
	}
}
