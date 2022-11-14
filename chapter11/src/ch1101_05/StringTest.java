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
		
	}
}
