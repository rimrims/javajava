package com.yedam.java.ch0701_05;

public class SupersonicAirPlane extends Airplane { // 상속

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) { // 오버라이딩
			System.out.println("초음속 비행 모드");
		} else {
			super.fly(); // 오버라이딩 전의 원래 부모 메소드 사용
							// 한번에 수정 가능하다는 장점.
		}
	}

	public void test() { // 일반 메소드(오버라이딩x)에서도 super사용가능
		super.fly();
	}

}
