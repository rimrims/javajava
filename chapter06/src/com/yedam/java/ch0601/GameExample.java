package com.yedam.java.ch0601;

public class GameExample {
	public static void main(String[] args) {
		
		Game user1 = new Game();
		user1.id = "예담이";
		user1.passwd = "1234";
		
		Game user2 = new Game("예담이2");
		user2.passwd = "4321";
		
		Game user3 = new Game("예담이3","4567");
		
		user1.getInfo();
		user2.getInfo();
		user3.getInfo();
		
		//static(정적,고정)필드 사용
		System.out.println("=====================static 필드 호출");
		System.out.println(Game.GameName); // 정적 필드 호출(인스턴스화 하지 않음)
	}
}
