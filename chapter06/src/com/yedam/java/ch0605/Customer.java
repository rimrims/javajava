package com.yedam.java.ch0605;

public class Customer {
	//필드
	String name;
	String bankName;
	int account;
	int balance;
	
	//생성자
	public Customer(String name,String bankName,int account,int balance) {
		this.name = name;
		this.bankName = bankName;
		this.account = account;
		this.balance = balance;
	}
	
	Bank bank = new Bank();
	
	//메소드
	void getInfo() {
		System.out.println("=== 입력하신 회원 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("은행 : " + bankName);
		System.out.println("계좌 : " + account);
		System.out.println("잔액 : " + balance);
	}
	void withDraw() {
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금 : " + balance);
		System.out.println("금리 : " + Bank.GOLD);
		System.out.println("예상 금액 :" + (balance + (balance * Bank.GOLD)));
	}
}
