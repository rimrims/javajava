package Test221111;

public class Performance extends Culture{
	
	public Performance(String title, int directorNum, int actorNum, String Genre) {
		super(title, directorNum, actorNum);
		// TODO Auto-generated constructor stub
	}


	public String Genre;
	

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독 : " + directorNum);
		System.out.println("배우 : " + actorNum);
		System.out.println("관객 수 : " + audienceNum);
		System.out.println("공연총점 : " + score);
		System.out.println("공연평점 : " + getGrade());
		System.out.println("=======================");
		
	}
}
