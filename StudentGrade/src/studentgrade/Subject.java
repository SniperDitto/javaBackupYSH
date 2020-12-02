package studentgrade;

import java.util.ArrayList;
import java.util.HashMap;

public class Subject {
	private String subjectName;//과목명
	private String subjectID="";//수업코드(수업개설연도+과목고유코드+분반)
	//수강생명단(학번목록)
	private ArrayList<String> studentList = new ArrayList<String>();
	//성적목록(학번+성적)
	private HashMap<String, Score> scoreList  = new HashMap<String, Score>();
	//-----------------------------------------------------------
	public Subject() {}
	public Subject(String subjectName, String subjectID) {
		super();
		this.subjectName = subjectName;
		this.subjectID = subjectID;
	}
	//--------------------------------------------------------
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(SubjectID sID) {
		this.subjectID = sID.getSubjectID();
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public ArrayList<String> getStudentList() {
		return studentList;
	}
	public HashMap<String, Score> getScoreList() {
		return scoreList;
	}
	//--------------------------------------------------------
	public boolean isExistStudent(Student st) {
		for(String s:studentList) {
			if(st.getStudentID().equals(s)) {
				return true;
			}
		}
		return false;
	}
	public void addStudent(Student s) {
		if(isExistStudent(s)) {
			System.out.println("이미 학생 목록에 존재합니다");
		}else {
			studentList.add(s.getStudentID());
		}
	}
	public void deleteStudent(Student s) {
		if(isExistStudent(s)) {
			studentList.remove(s.getStudentID());
		}else {
			System.out.println("학생 목록에 없습니다.");
		}
	}
	public void addScore(Student st,Score sc) {
		if(isExistStudent(st)) {
			scoreList.put(st.getStudentID(),sc);
		}else {
			System.out.println("학생 목록에 없습니다.");
		}
	}
	public void deleteScore(Student st,Score sc) {
		if(isExistStudent(st)) {
			scoreList.remove(st.getStudentID());
		}else {
			System.out.println("학생 목록에 없습니다.");
		}
	}
//--------------------------------------	
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", subjectID=" + subjectID + ", studentList=" + studentList
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectID == null) ? 0 : subjectID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (subjectID == null) {
			if (other.subjectID != null)
				return false;
		} else if (!subjectID.equals(other.subjectID))
			return false;
		return true;
	}
	
	
	
	
}
                                    