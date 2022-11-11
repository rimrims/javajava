package ch0702_03;

public abstract class Animal { // 추상 클래스

	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound(); // 추상 메소드 : 무조건 오버라이딩 해줘야함
								// 같은 용도의 같은 메소드가 필요할 때
}
