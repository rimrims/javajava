package com.yedam.java.ch0702;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override // 한국타이어에 맞게 수정
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 "
					+ (maxRotation-accRotation)+ "회");
			return true;
		}else {
			System.out.println("###" + location + "HankookTire 펑크 ###");
			return false;
		}
	}
}
