package com.yedam.java.ch0801;

public class Audio implements RemoteControl{ // 인터페이스(기본설계도)를 통해 만듦
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
