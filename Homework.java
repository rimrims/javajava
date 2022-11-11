package test;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println(i);
			}
		}
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int j=4; j<arr1.length; j++) {
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스 번호> ");
		int index = Integer.parseInt(sc.nextLine());
		arr1[index] = 1000;
		
		System.out.println(Arrays.toString(arr1));
		
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		int min = arr1[0];
		
		for(int i=0; i<arr1.length; i++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
			if(min>arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.printf("최댓값 : %d , 최솟값 : %d \n",max,min);

		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print("양의 정수 입력> ");
			arr2[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]%3 == 0) {
				System.out.print(arr2[i]+" ");
			}
		}
	}
}
