package com.yedam.java.ch0604;

public class Car {
	
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() { // 가스 잔량확인 메소드
		if(gas == 0) { // 필드의 가스를 가리킴. 메소드에 가스 가리키는 것 없기 때문
			System.out.println("gas가 없습니다.");
			return false; // 메소드에서 return 만나면 무조건 메소드 종료
		}
		
		System.out.println("gas가 있습니다.");
		return true;
	}
	/*
	void run() {
		while(true) {
			if(this.gas>0) {
				System.out.println("달립니다. (gas잔량 : " + this.gas + ")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas잔량 : " + this.gas + ")");
				return; // 메소드 자체를 종료 cf. break : 해당 반복문만 종료.
//				System.out.println("종료합니다."); // return구문 뒤는 항상 실행되지 않음. like exit.
			}
		}
	}
	*/
	
	void run() {
		while(true) {
			if(isLeftGas()) {
				System.out.println("달립니다. (gas잔량 : " + this.gas + ")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas잔량 : " + this.gas + ")");
				return; // 메소드 자체를 종료 cf. break : 해당 반복문만 종료.
//				System.out.println("종료합니다."); // return구문 뒤는 항상 실행되지 않음. like exit.
			}
		}
	}
}
