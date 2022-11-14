package com.yedam.java.ch0801_02;

public class Television implements RemoteControl, Search{// 인터페이스는 이렇게! 인터페이스 내용은 모두 오버라이딩 해야함.
															// 빨간 줄 눌러서 추가

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; // 최대볼륨 맞추기(매개변수가 10보다 크면 10으로 맞춤)
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME; // 최소볼륨 맞추기(매개변수가 0보다 작으면 0으로 맞춤)
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	//search 인터페이스
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
