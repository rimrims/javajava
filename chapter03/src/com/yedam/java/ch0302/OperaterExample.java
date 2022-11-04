package com.yedam.java.ch0302;

public class OperaterExample {

	public static void main(String[] args) {
		// 부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : " + result1); // 부호 그대로
		System.out.println("result2 : " + result2); // 부호 바뀜
		
		byte b = 100;
//		byte result30 = -b; // 부호연산자 사용하면서 int타입으로 바뀜. 오류.
//		byte result31 = (byte)-b; // byte타입으로 받고싶으면 강제타입변환.
		int result3 = -b;
		System.out.println("result3 : " + result3);
		
		// 증감연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++; // 11
		++x; // 12
		System.out.println("x =" + x);
		
		System.out.println("-----------------------");
		y--; //9
		--y; //8
		System.out.println("y = "+ y);
		System.out.println("------------------------");
		z = x++; // 대입연산자 -> 증감연산자 (증감연산자가 뒤에있어서 우선순위가 제일 뒤)
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		
		System.out.println("------------------------");
		z = ++x; // 증감연산자 -> 대입연산자 (증감연산자가 앞에있어서 우선순위가 제일 먼저)
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		System.out.println("------------------------");
		z = ++x + y++;
		System.out.println("x = "+ x); // 15
		System.out.println("y = "+ y); // 9
		System.out.println("z = "+ z); // 23
		
		/***/
		x = 5;
		y = 5;
		
		System.out.println("-------------------------");
		z = x++ + --y;
		System.out.println("x = "+ x); // 6
		System.out.println("y = "+ y); // 4
		System.out.println("z = "+ z); // 9
		
		System.out.println("-------------------------");
		z = --x + y++;
		System.out.println("x = "+ x); // 5
		System.out.println("y = "+ y); // 5
		System.out.println("z = "+ z); // 9
		
		System.out.println("-------------------------");
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play); // true
		
		play = !play; // false로 바꿈
		System.out.println(play); // false

		play = !play; // true로 바꿈
		System.out.println(play); // true
		
		System.out.println("-------------------------");
		boolean isOpen = true;
		
		if(!isOpen) { // true값만 가지고 있을 때 false값도 필요하다. 이렇게 만들어줌
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업 중입니다.");
		}
		
		System.out.println("-------------------------");
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result = " + result);
		
		result = v1 - v2;
		System.out.println("result = " + result);
		
		result = v1 * v2;
		System.out.println("result = " + result);
		
		result = v1 / v2;
		System.out.println("result = " + result);

		result = v1 % v2;
		System.out.println("result = " + result);
		
		System.out.println("-------------------------");
		//비교 연산자 : true , false로만 값 나옴
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2 ); // true
		System.out.println(">= : " + bResult);
		
		bResult = ( num1 == num2 ); // true
		System.out.println("== : " + bResult);
		
		bResult = ( num1 != num2 ); // false
		System.out.println("!= : " + bResult);
		
		System.out.println("-------------------------");
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		System.out.println("문자 비교 : " + (char1 > char2)); // false
		
		System.out.println("-------------------------");
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4)); // true
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6)); // false. 정밀도가 달라서
		System.out.println("float VS float : " + (v5 == (float)v6)); // true
		
		System.out.println("-------------------------");
		//논리 연산자
		int charCode = 'A'; // 65
		
		//유니코드 중 65보다 크거나 같고 90보다는 작거나 같으면 대문자(65~90)
		
		if((charCode >= 65) && (charCode <= 90)) { // &&면 피연산자 둘 다 확인
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >= 97) & (charCode <= 122)) { // & 하나면 피연산자를 앞에서부터 확인. 결과 나오면 바로 출력함
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		System.out.println("-------------------------");
		int numValue = 6;
		
		if((numValue % 2 == 0) | (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		System.out.println("-------------------------");		
		//복합 대입 연산자
		int resultA = 0;
		resultA += 10; // 10 resultA = resultA + 10
		System.out.println(" += : " + resultA);
		resultA -= 5; // 5 resultA = resultA - 5
		System.out.println(" -= : " + resultA);
		resultA *= 3; // 15 resultA = resultA * 3
		System.out.println(" *= : " + resultA);
		resultA /= 5; // 3 resultA = resultA / 5
		System.out.println(" /= : " + resultA);
		resultA %= 3; // 0 resultA = resultA % 3
		System.out.println(" %= : " + resultA);
		
		
	}

}
