package ch1101_04;

public class SystemExample {
	public static void main(String[] args) {
		
		//System.exit()
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				System.exit(0); //프로그램 완전종료
//			}
//		}
//		System.out.println("프로그램 종료"); // 출력x
		
		//현재시각 읽기
		long time1 = System.nanoTime(); // 스탑워치 시작 버튼. 0초 (사실 현재 시간 나노초로 들고옴)
		
		int sum = 0;
		for(int i=1; i<=100000; i++) {
			sum += 1;
		}
		
		long time2 = System.nanoTime(); // 다시쓰면 스탑워치 종료. 10초 (현재시간 들고옴)
		
		System.out.println("sum : " + sum);
		System.out.println("계산시간 : " + (time2 - time1) + "나노초가 소요됨.");
		
		long time3 = System.currentTimeMillis(); // 현재시간 읽어옴(중복데이터가 아예없음->랜덤데이터 뽑을때 사용하기도함)
		System.out.println(time3);
		
		
	}
}
