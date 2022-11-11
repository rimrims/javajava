package com.yedam.java.ch0702;

public class Tire {
	//필드
	public int maxRotation; // 최대 회전 수
	public int accRotation; // 누적 회전 수
	public String location; // 타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accRotation; // 호출되면 한 바퀴 돔
		if(accRotation < maxRotation) {
			System.out.println(location + "타이어 수명"
					+ (maxRotation - accRotation) + "회");
			return true;
		}else {
			System.out.println(" ### " + location + " Tire 펑크 ###");
			return false;
		}
	}
}
