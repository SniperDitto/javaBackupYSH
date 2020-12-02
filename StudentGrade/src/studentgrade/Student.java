package studentgrade;

import java.util.HashMap;

public class Student {
	private String studentID;//학번(입학년도+등록순서+전공코드)
	private String studentName;//이름
	private String majorID;//전공코드
	//성적목록(과목+성적)
	private HashMap<Subject,Score> scoreList = new HashMap<Subject,Score>();
//--------------------------------------------------	
	public Student() {}
	public Student(String studentID, String studentName, String majorID) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.majorID = majorID;
	}
//-------------------------------------------------
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMajorID() {
		return majorID;
	}
	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}
	public String getStudentID() {
		return studentID;
	}
//--------------------------------------------------	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", majorID=" + majorID + "]";
	}
	
	public boolean isExistSubject(Subject sub) {
		for(Subject s:scoreList.keySet()) {
			if(s==sub) {
				return true;
			}
		}
		return false;
	}
	
	public void addScore(Subject sub, Score sco) {
		if(isExistSubject(sub)) {
			System.out.println("이미 수강한 과목");
			scoreList.replace(sub, sco);
		}else {
			scoreList.put(sub, sco);
		}
		
	}
	public void removeScore(Subject sub) {
		if(isExistSubject(sub)) {
			scoreList.remove(sub);
		}else {
			System.out.println("존재하지 않는 과목");
		}
	}
}
