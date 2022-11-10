package com.yedam.java.ch0605_01;

public class Application {
	
	public static void main(String[] args) {
		
		Access access = new Access();
		
		// 1) public
		access.free = "public";
		access.free(); // privacy메소드를 담은 public메소드 호출 -> 사용가능
		// 2) private
//		access.privacy = "privacy"; // 같은 클래스 내에서만 호출 가능하므로 호출 안됨
//		access.privacy(); //  호출 x
		// 3) protect
		access.parent = "parant";
		// 4) default
		access.basic = "basic";
		
	}
	
}
