package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		
		
		
//		if(week == 7) { // if문만 봤을 때는 7의 의미를 모름. 
//			System.out.println("오늘은 스터디를 갑니다.");
//		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) { // 명확하게 눈에 보임. 
			System.out.println("오늘은 스터디를 갑니다.");
		}else {
			System.out.println("오늘은...");
		}
	}
}
