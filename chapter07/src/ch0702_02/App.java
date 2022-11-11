package ch0702_02;

public class App {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		// c -> b 상속관계
		// b -> a 상속관계
		// c -> b -> a 상속관계 (손자-아빠-할아버지)
		
		A a1 = b; // 부모 자식 자동타입변환
		A a2 = c; // 할아버지 손자 자동타입변환
		
	}

}
