package com.yedam.java.ch0605_example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 >");
		int studentNo = Integer.parseInt(sc.nextLine());
		Student[] stuScore = new Student[studentNo]; // 클래스를 배열로 받음. 입력받은 학생 수대로 배열 크기 결정됨
		
		for(int i=0; i<stuScore.length; i++) { //객체 만들어서 배열에 넣는다.
			Student student = new Student();
			
			System.out.println("이름 >");
			String name = sc.nextLine();
			student.setsName(name);
			
			System.out.println("번호 >");
			String no = sc.nextLine();
			student.setsNo(no);
			
			System.out.println("국어점수 >");
			int korScore = Integer.parseInt(sc.nextLine());
			student.setKor(korScore);
			
			System.out.println("수학점수 >");
			int mathScore = Integer.parseInt(sc.nextLine());
			student.setMath(mathScore);
			
			System.out.println("영어점수 >");
			int engScore = Integer.parseInt(sc.nextLine());
			student.setEng(engScore);
			
			stuScore[i] = student;
		}
		
//		for(int i=0; i<stuScore.length; i++) {
//			stuScore[i].getInfo();
			
		for(int i=0; i<stuScore.length; i++) {
			System.out.println("이름 : " + stuScore[i].getsName()); // 이런식으로 정보 가져오는 것도 가능getter사용법
		}
		
	}
}
