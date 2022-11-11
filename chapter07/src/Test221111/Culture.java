package Test221111;

public abstract class Culture {
	
	//필드
	public String title;
	public int directorNum;
	public int actorNum;
	public int audienceNum;
	public int score;
	
	//생성자
	public Culture(String title,int directorNum,int actorNum) {
		this.title = title;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}
	
	//메소드
	public void setTotalScore(int score) {
		audienceNum++;
		this.score += score;
	}
	
	public String getGrade() {
		int avg = score / audienceNum;
		String avgScore = null;
		
		if(avg <= 10) {
			avgScore = "☆";
		}else if(avg <= 20) {
			avgScore = "☆☆";
		}else if(avg <= 30) {
			avgScore = "☆☆☆";
		}else if(avg <= 40) {
			avgScore = "☆☆☆☆";
		}else if(avg <= 50) {
			avgScore = "☆☆☆☆☆";
		}
		return avgScore;
	}
	
	public abstract void getInformation();
}
