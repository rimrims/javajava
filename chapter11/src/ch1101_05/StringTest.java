package ch1101_05;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		char a;
		
		for(int i=str.length()-1; i>=0; i--) {
			a = str.charAt(i); // 한글자씩
			System.out.print(a);
		}
		System.out.println();

//		=========================================================
		
		byte[] bytes = null;
		String str1 = "1a2v4b";
		bytes = str1.getBytes();
		
		int engSum = 0;
		int numSum = 0;
		
		for(int i=0; i<bytes.length; i++) {
			if(bytes[i]>=97 && bytes[i]<=122) {
				engSum++;
			}else if(bytes[i]>=48 && bytes[i]<=57) {
				numSum++;
			}
		}
		System.out.println("숫자 : " + numSum + "영어 : " + engSum);
		

		
//		======================================================
		
		//입력한 생년월일 6자리를 입력하였을 경우 만나이를 구하는 ㅊ프로그램작성
		//금년 기준으로 100년이 넘어간 경우는 제외. 생일 신경x
		//input:000510 output:21살
		
		String bd = "000510";
		int year = Integer.parseInt(bd.substring(0, 3));
		
		int age = 0;
		for(int i=1; i<=100; i++) {
			
		}

		
	}
}
