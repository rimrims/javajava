package com.yedam.java.ch0605_example;

import java.util.Scanner;

public class Application {
	// 배열
	int[] ary = new int[6];

	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;

	public static void main(String[] args) {

		// 고객정보입력프로그램
		new Exeapp();

		/*
		 * while(true) { System.out.println("회원의 수 >"); int count =
		 * Integer.parseInt(sc.nextLine()); = new Bank[count];
		 * 
		 * //배열 크기만큼 반복문을 실행 //회원 정보를 객체에 담아서 배열에 저장 for (int i = 0; i < Bary.length;
		 * i++) {
		 * 
		 * Bank bank = new Bank(); // 반복문 안에서 새로운 객체 계속 만들도록. 현재는 빈 깡통이니까 내용(필드) 채워줘야함
		 * 
		 * // 정보입력 System.out.println("계좌번호 >"); int account =
		 * Integer.parseInt(sc.nextLine()); bank.setAccount(account); // 메소드 통해 데이터 들어감.
		 * 
		 * System.out.println("은행입력 >"); String bName = sc.nextLine();
		 * bank.setBank(bName);
		 * 
		 * System.out.println("금액설정 >"); int money = Integer.parseInt(sc.nextLine());
		 * bank.setMoney(money);
		 * 
		 * System.out.println("고객이름 >"); String name = sc.nextLine();
		 * bank.setName(name); // --------------------------------------------------- //
		 * bank객체 (계좌번호,은행이름,예금,고객이름 들어감) //
		 * --------------------------------------------------- Bary[i] = bank; // 배열의 빈
		 * 방에 객체 하나씩 만들어서 넣어줌 }
		 * 
		 * for(int i=0; i<Bary.length; i++) { Bary[i].getInfo(); }
		 * 
		 * // 회원정보 입력 public void showMenu() {
		 * System.out.println("========================================");
		 * System.out.println("|1.회원 수 입력 2.정보 입력 3.단건 조회 4. 모두 조회 5. 삭제 6. 종료");
		 * System.out.println("======================================"); }
		 * 
		 * // 회원 정보 입력 public void setInfo() { // 배열 크기만큼 반복문을 실행 // 회원 정보를 객체에 담아서 배열에
		 * 저장 for (int i = 0; i < Bary.length; i++) {
		 * 
		 * Bank bank = new Bank(); // 반복문 안에서 새로운 객체 계속 만들도록. 현재는 빈 깡통이니까 내용(필드) 채워줘야함
		 * 
		 * // 정보입력 System.out.println("계좌번호 >"); int account =
		 * Integer.parseInt(sc.nextLine()); bank.setAccount(account); // 메소드 통해 데이터 들어감.
		 * 
		 * System.out.println("은행입력 >"); String bName = sc.nextLine();
		 * bank.setBank(bName);
		 * 
		 * System.out.println("금액설정 >"); int money = Integer.parseInt(sc.nextLine());
		 * bank.setMoney(money);
		 * 
		 * System.out.println("고객이름 >"); String name = sc.nextLine();
		 * bank.setName(name); // --------------------------------------------------- //
		 * bank객체 (계좌번호,은행이름,예금,고객이름 들어감) //
		 * --------------------------------------------------- Bary[i] = bank; // 배열의 빈
		 * 방에 객체 하나씩 만들어서 넣어줌 } }
		 */
	}
}
