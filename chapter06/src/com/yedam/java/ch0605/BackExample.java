package com.yedam.java.ch0605;

import java.util.Scanner;

public class BackExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String confirm;

		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);

		customer.getInfo(); // 실습본 출력

		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");

		confirm = sc.nextLine();
		if (confirm.toLowerCase().equals("y")) {

			System.out.println("출금 완료");

		} else {
			System.out.println("시스템 종료");
		}

	}

}