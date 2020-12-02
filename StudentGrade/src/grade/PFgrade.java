package grade;

public class PFgrade implements Grade{
	private static PFgrade instance=new PFgrade();
	private PFgrade() {}
	public static PFgrade getInstance() {
		return instance;
	}
	
	@Override
	public String getGrade(int score) {
		String gradeString="";
		if(score<=100 && score>=70) {
			gradeString="P";
		}else if(score<70) {
			gradeString="F";
		}
		
		return gradeString;
	}

}
