package studentgrade;

import java.util.Scanner;
import define.Major;

public class StudentID {
	Scanner scanner = new Scanner(System.in);
	private String Year;//입학년도
	private String major;//전공
	private String StudentID;//학번
//------------------------------------------	
	public StudentID() {}
	public StudentID(String year, String major) {
		super();
		this.Year = year;
		this.major = major;
		makeStudentID();
	}
//------------------------------------------------
	public String getYear() {
		return this.Year;
	}
	public void setYear(String year) {
		this.Year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getStudentID() {
		return StudentID;
	}
//----------------------------------------------------------
	public void inputStudentID() {//학번(입학년도+전공코드+등록순서)
		System.out.print("입학년도 : ");
		String inputYear=scanner.nextLine();
		Major m=Major.COMPUTER;
		String maj=m.majorString();
		System.out.printf("추가할 학생 전공(%s) : ",maj);
		int inputMajor=Integer.parseInt(scanner.nextLine());
		setYear(inputYear);
		setMajor(String.valueOf(inputMajor));
	}
	
	public void isExistMajor() {
//		for(int i:)
	}
	
	public void makeStudentID() {
		School s = School.getInstance();
		String tempStudentID=Year.concat(major);
		tempStudentID=tempStudentID.concat(Integer.toString(s.getNumStudent()));
		this.StudentID=tempStudentID;
	}
	
//-----------------------------------------------	
	
	@Override
	public String toString() {
		return "StudentID [StudentID=" + StudentID + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StudentID == null) ? 0 : StudentID.hashCode());
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
		StudentID other = (StudentID) obj;
		if (StudentID == null) {
			if (other.StudentID != null)
				return false;
		} else if (!StudentID.equals(other.StudentID))
			return false;
		return true;
	}
	
	
	
}



