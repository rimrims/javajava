package com.yedam.java.ch0601;

//import 강제 등록(다른 패키지의 클래스를 가져오고 싶을 때)
import com.yedam.java.ch0604.Computer; // 방법1

public class Application_shoes {

	//필드
	int staticTest = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application_shoes ap = new Application_shoes(); // 자기자신의 필드 가져오고 싶을때는 객체생성해서 사용해야함
		
		ap.staticTest = 2; // 방법2
		
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		//인스턴스화 시키면 static 메소드와 필드 사용가능함.
		ConstantNo csno = new ConstantNo(); // 
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);
		
		//은행 고객 정보를 관리하는 클래스
		//1) main 2) Customer 3) Bank
		
		//1) main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당 은행의 금리를 저장
		//	(현재 잔액 + (현재 잔액 * 금리))
		//3) Customer -> 고객의 정보를 저장
		//	이름, 은행명, 계좌, 잔액의 필드
		//	getInfo() : 입력한 정보 출력
		// withDraw() : 출금할 때 정보를 출력
		
	}

}
