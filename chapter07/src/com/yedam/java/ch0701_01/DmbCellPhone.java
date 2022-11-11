package com.yedam.java.ch0701_01;

public class DmbCellPhone extends CellPhone{ // 상속

	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//super(); : 생략된것.
		this.model = model; // 부모 클래스 필드를 가져와서 데이터 넣어줌.
		this.color = color; // 부모 클래스 필드
		this.channel = channel; // 자식 클래스 필드
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
}
