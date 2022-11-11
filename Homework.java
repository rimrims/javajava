package test;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		//�־��� �迭�� �̿��Ͽ� ���� ������ �����ϼ���.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//����1. �־��� �迭 �߿��� ���� 60�� ���� �ε����� ����غ���.
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println(i);
			}
		}
		
		//����2. �־��� �迭�� �ε����� 3�� ���� ������� ����, �������� ����غ���.
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int j=4; j<arr1.length; j++) {
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		
		//����3. �־��� �迭 ���� �����ϰ� ���� ���� �ε��� ��ȣ�� �Է¹޾�, �� ���� 1000���� �����غ���.
  		//   �Է�) �ε���: 3 ->   {10, 20, 30, 1000, 3, 60, -3
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ε��� ��ȣ> ");
		int index = Integer.parseInt(sc.nextLine());
		arr1[index] = 1000;
		
		System.out.println(Arrays.toString(arr1));
		
		//����4. �־��� �迭�� ��ҿ��� �ִ밪�� �ּҰ��� ���غ���.
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
		System.out.printf("�ִ� : %d , �ּڰ� : %d \n",max,min);

		
		//����5. ������ �迭�� �����Ͽ� ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print("���� ���� �Է�> ");
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
