package com.yedam.java.ch0605_02;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton s1 = Singleton.getInstance();
					// =new Singleton(); -> singleton이 들어감.
		Singleton s2 = Singleton.getInstance(); // 이미 만들어진 객체를 가져오므로 s1 == s2
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.run(); // 작동됨
	}

}
