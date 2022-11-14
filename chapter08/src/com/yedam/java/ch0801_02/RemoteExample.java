package com.yedam.java.ch0801_02;

public class RemoteExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new Television(); // 구현 클래스. 인터페이스는 자기 자신을 객체화할 수 없음. 자동타입변환처럼 해야함.(인터페이스 타입으로 객체화)

//		rc = new Audio(); // 구현 클래스 변경. rc를 Audio 객체로 덮어씌움. 아래는 Audio 내용으로 출력됨.
						// 하나의 객체로 다양한 기능 구현
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television(); // Search 인터페이스에서 오버라이딩된 메소드만 사용 가능
		
		search.search("google.com");
		
		// 같은 기능이지만 다른 이름의 메소드로 하면 알아보기 어려움.
		// 인터페이스로 메소드 이름은 같지만 내용은 다른 메소드로 구현.
		
//		==========================================================================================
		
//		Television tv = new Television();
//		
//		tv.turnOn();
//		tv.setVolume(11);
//		tv.turnOff();
//		
//		Audio au = new Audio();
//		
//		au.turnOn();
//		au.setVolume(11);
//		au.turnOff();  // 이렇게 되면 객체를 여러 개 생성해서 사용해야함. 비효율적.
		
//		===========================================================================================
		
		// 추상 클래스 vs 인터페이스
		// 추상 클래스(extends) -> 필드, 생성자, 메소드(클래스라서 상속 하나만 가능.)
		// 인터페이스(implements) -> 상수, 추상 메소드(상속 여러 개 받을 수 있음. 다중상속)
		
	}
}
