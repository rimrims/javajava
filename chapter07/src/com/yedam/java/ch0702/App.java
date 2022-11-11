package com.yedam.java.ch0702;

public class App {
	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemTire = car.run(); // return값으로 위치를 알 수 있게 함.
			switch (problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				
				//펑크
				//자식클래스인 한국타이어로 교체
				//부모클래스에서 오버라이딩한 내용을 바꿔끼우게됨
				//자동타입변환으로인해 가능
				
				car.frontLeftTire = new HankookTire("앞왼쪽",15); // 자동 타입 변환 (규격(타입)이 같음)
				//HankookTire tire = new HankookTire("앞왼쪽",15);
				//car.frontLeftTire = tire;							//같은 구문
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------------------------");
		}

	}
}
