package Test221111;

public class CultureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Culture culture1 = new Movie("추격자",7,5,"스릴러");
		Culture culture2 = new Performance("지킬앤하이드", 9, 10,"뮤지컬");
		
		culture1.setTotalScore(12);
		culture2.setTotalScore(46);
		
		culture1.getInformation();
		culture2.getInformation();
	}

}
