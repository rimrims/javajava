package com.yedam.java.ch1101_03;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		
		//toString: 객체정보출력
		
		Object obj = new Object();
		System.out.println(obj.toString());
		
		Date obj2 = new Date();
		System.out.println(obj2.toString());
	}
}
