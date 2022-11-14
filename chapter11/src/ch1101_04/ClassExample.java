package ch1101_04;

import com.yedam.java.ch1101_01.Key;

public class ClassExample { 
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Key 클래스 객체 가져오기
		//1. 직접 클래스 객체 가져오기
		Class clazz = Key.class;
		
		System.out.println(clazz);
		//2. 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.java.ch1101_01.Key");
		
		System.out.println(clazz2);
		
		//3.객체로부터 클래스 객체 얻기
		Key key = new Key(1);
		
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("골든리트리버.jpg").getPath(); // class객체와 같은 경로에 있으면 경로 가져옴
		
		System.out.println(photoPath);
	}
}
