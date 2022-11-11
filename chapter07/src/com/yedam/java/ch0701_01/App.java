package com.yedam.java.ch0701_01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellPhone dmb = new DmbCellPhone("고아라폰","화이트",10);
		
		//부모 클래스 필드 사용
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//자식 클래스 필드 사용
		System.out.println("채널 : " + dmb.channel);
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 전 김또치입니다");
		dmb.powerOff();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		//자식만 인스턴스화 해도 부모의 필드와 메소드 가져와서 사용 가능하다! 부모-자식 상속
		//부모 private요소는 안됨.
		
		
	}

}
