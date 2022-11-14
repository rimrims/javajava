package com.yedam.java.ch1101_01;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap -> Key , Value 데이터를 저장
		HashMap<Key, String> hashmap = new HashMap<>();
		
		
		hashmap.put(new Key(1), "홍길동"); // 열쇠로 데이터 넣어서 잠금
		
		String value = hashmap.get(new Key(1)); // 열쇠로 데이터 꺼내옴.
		System.out.println(value); // null. 알고보면 다른 객체임. new연산자!
		
		Key key = new Key(1);
		
		System.out.println(key.toString());
	}
	
}
