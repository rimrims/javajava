package test221110;

import java.util.Scanner;

public class ItemExample {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 상품 수
                	// 2) 상품 및 가격입력
                	// 3) 분석

		// 상품 수 - 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		
		Scanner sc = new Scanner(System.in);

		//1.상품 수
		System.out.println("상품 수 > ");
		int a = Integer.parseInt(sc.nextLine());
		Item[] items = new Item[a];
		
		//2.상품 및 가격 입력
		for (int i = 0; i < items.length; i++) {
			Item item = new Item();
			
			System.out.println("상품 이름> ");
			String name = sc.nextLine();
			item.setName(name);
			
			System.out.println("상품 가격> ");
			int price = Integer.parseInt(sc.nextLine());
			item.setPrice(price);

			items[i] = item;
		}
		//3.분석
		int max = items[0].getPrice();
		int sum = 0;

		for (int i = 0; i < items.length; i++) {
			int price = items[i].getPrice();

			if (max < price) {
				max = price;
			}
		}
		
		for (int i = 0; i < items.length; i++) {
			int price = items[i].getPrice();
			
			if (max == price) {
				continue;
			}else if(max != price) {
				sum += price;
			}
		}
		System.out.println("최고가 제품을 제외한 총 가격 : " + sum);


	}
}