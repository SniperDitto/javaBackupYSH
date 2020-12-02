package grade;

public class ABgrade implements Grade{
	private static ABgrade instance=new ABgrade();
	private ABgrade() {}
	public static ABgrade getInstance() {
		return instance;
	}
	@Override
	public String getGrade(int score) {
		String gradeString="";
		if(score<=100 && score>=90) {
			gradeString="A";
		}else if(score<90 && score>=80) {
			gradeString="B";
		}else if(score<80 && score>=70) {
			gradeString="C";
		}else if(score<70 && score>=55) {
			gradeString="D";
		}else if(score<55) {
			gradeString="F";
		}
		
		return gradeString;
	}
	
	
}