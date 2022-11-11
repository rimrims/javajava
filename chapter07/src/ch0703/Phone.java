package ch0703;

public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("전원 켬");
	}
	
	public void turnOff() {
		System.out.println("전원 끔ㄴ");
	}
}
