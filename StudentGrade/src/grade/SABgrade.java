package grade;

public class SABgrade implements Grade{
	private static SABgrade instance=new SABgrade();
	private SABgrade() {}
	public static SABgrade getInstance() {
		return instance;
	}
	
	public String getGrade(int score) {
		String gradeString="";
		if(score<=100 && score>=95) {
			gradeString="S";
		}else if(score<95 && score>=90) {
			gradeString="A";
		}else if(score<90 && score>=80) {
			gradeString="B";
		}else if(score<80 && score>=70) {
			gradeString="C";
		}else if(score<70 && score>=60) {
			gradeString="D";
		}else if(score<60) {
			gradeString="F";
		}
		
		return gradeString;
	}
	
}
