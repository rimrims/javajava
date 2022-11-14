package com.yedam.java.ch0801_01;

public class WashingExample {
	public static void main(String[] args) {
		
		WashingMachine wm = new LGWashingMachine();
		
		washing(new LGWashingMachine()); // wm에 객체 들어감
//		washing(new SamsungWashingMachine());
		
	}
	
	public static void washing(WashingMachine wm) { // 매개변수에 어떤 객체를 넣느냐에 따라 기능 달라짐.(다형성)
		wm.startBtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.stopBtn();
	}
}
