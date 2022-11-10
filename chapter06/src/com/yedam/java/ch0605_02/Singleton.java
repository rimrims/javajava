package com.yedam.java.ch0605_02;

public class Singleton {
//	//싱글톤 p.279
//	// 메모리 관리 차원에서 같은 클래스를 많이 사용하고자 할때 사용함
//	// 전체프로그램에서 단 하나의 객체만 만들도록 보장
	private static Singleton singleton = new Singleton(); // 단 하나의 객체만 만듦.
						  // new Singleton이 singleton에 드감.
	
	private Singleton() { // 객체 생성을 막음
		
	}
	
	public static Singleton getInstance() { // 호출되면 만들어진 단 하나의 객체를 반환.
		return singleton;
		//singleton == new Singleton() -> 객체 생성
		//getInstance == singleton == new Singleton()
		// => getInstance == new Singleton()
	}
	
	//싱글톤 사용 방법 : 자주 쓰는 메소드를 모아서 싱글톤 클래스에 넣어둠.
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}
	//========================================================================
	/*
	private static Singleton singleton = null; // 단 하나의 객체만 만듦.
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() { // 객체 생성을 막음
		if(singleton == null) {
			return singleton = new Singleton();
		}else {
			return singleton;
		}
			
	}
}
*/

}

